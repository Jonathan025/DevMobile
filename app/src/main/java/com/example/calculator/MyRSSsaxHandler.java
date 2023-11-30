package com.example.calculator;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.Attributes;

import android.os.AsyncTask;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;



public class MyRSSsaxHandler extends DefaultHandler {
    private boolean _isInItem = false;
    private boolean _isInTitle = false;
    private boolean _isInDescription = false;
    private boolean _isInDate = false;
    private int _wantedItemIndex;
    private int _currentItem = 0;
    private int _numberOfItems = 0;
    private StringBuilder _title = new StringBuilder();
    private StringBuilder _description = new StringBuilder();
    private StringBuilder _date = new StringBuilder();
    private Bitmap _image;


    public MyRSSsaxHandler(int wantedItemIndex) {
        _wantedItemIndex = wantedItemIndex;
    }


    public void startElement(String notUsed1, String notUsed2, String name, Attributes attributes) {
        if (name.equalsIgnoreCase("item")) {
            _isInItem = true;
            _currentItem++;
            _numberOfItems++;
        }
        if (_isInItem) {
            if (_currentItem == _wantedItemIndex) {
                if (name.equalsIgnoreCase("title")) {
                    _isInTitle = true;
                    _title.setLength(0);
                } else if (name.equalsIgnoreCase("description")) {
                    _isInDescription = true;
                    _description.setLength(0);
                } else if (name.equalsIgnoreCase("pubDate")) {
                    _isInDate = true;
                    _date.setLength(0);
                } else if (name.equalsIgnoreCase("media:content") || name.equalsIgnoreCase("enclosure")) {
                    String imageUrl = attributes.getValue("url");
                    _image = getBitmap(imageUrl);
                    _isInItem = false;
                }
            }
        }
    }

    public int getNumberOfItems() {
        return _numberOfItems;
    }

    public Item getWantedItem() {
        Item wantedItem = new Item(_title, _date, _description, _image);
        return wantedItem;
    }

    public void characters(char[] character, int start, int length) {
        String characters = new String(character, start, length);
        if (_isInTitle) {
            _title.append(characters);
            _isInTitle = false;
        } else if (_isInDescription) {
            _description.append(characters);
            _isInDescription = false;
        } else if (_isInDate) {
            _date.append(characters);
            _isInDate = false;
        }
    }

    public Bitmap getBitmap(String imageUrl) {
        try {
            return new DownloadImageTask().execute(imageUrl).get();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    private static class DownloadImageTask extends AsyncTask<String, Void, Bitmap> {
        @Override
        protected Bitmap doInBackground(String... urls) {
            String imageUrl = urls[0];
            try {
                URL url = new URL(imageUrl);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setDoInput(true);
                connection.connect();
                InputStream input = connection.getInputStream();
                return BitmapFactory.decodeStream(input);
            } catch (Exception e) {
                System.err.println("ERROR during image download : " + e.getMessage());
                return null;
            }
        }
    }

}
