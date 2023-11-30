package com.example.calculator;

import android.content.Context;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import org.xml.sax.InputSource;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.StringReader;

public class FluxModel {
    private String _url;
    private Context _context;
    private int _extractedItemIndex = 1;
    private int _numberOfItems;
    private Item _extractedItem;

    public FluxModel(Context context, String url) {
        _url = url;
        _context = context;
    }

    public FluxModel(Context context) {
        _url = "https://www.lemonde.fr/international/rss_full.xml";
        _context = context;
    }

    public void sendRequestAndReceiveDatas() {
        RequestQueue queue = Volley.newRequestQueue(_context);

        StringRequest stringRequest = new StringRequest(Request.Method.GET, _url, response -> {
            try {
                SAXParserFactory parserFactory = SAXParserFactory.newInstance();
                SAXParser parser = parserFactory.newSAXParser();
                MyRSSsaxHandler handler = new MyRSSsaxHandler(_extractedItemIndex);

                parser.parse(new InputSource(new StringReader(response)), handler);

                _numberOfItems = handler.getNumberOfItems();
                _extractedItem = handler.getWantedItem();
                System.out.println("title : " + _extractedItem.title);
                System.out.println("description : " + _extractedItem.description);
                System.out.println("date : " + _extractedItem.date);

            } catch (Exception e) {
                System.err.println("ERROR : " + e.getMessage());
            }
        }, error -> System.err.println("ERROR during send request : " + error.getMessage()));

        queue.add(stringRequest);
    }

    public void nextItem() {
        if (_extractedItemIndex < _numberOfItems) {
            _extractedItemIndex++;
        }
    }

    public void previousItem() {
        if (_extractedItemIndex > 1) {
            _extractedItemIndex--;
        }
    }

    public Item getItem() {
        return _extractedItem;
    }
}
