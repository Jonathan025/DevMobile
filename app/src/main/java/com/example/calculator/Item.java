package com.example.calculator;

import android.graphics.Bitmap;

public class Item {
    public StringBuilder title;
    public StringBuilder description;
    public StringBuilder date;
    public Bitmap image;

    public Item(StringBuilder Title, StringBuilder Date, StringBuilder Description, Bitmap Image) {
        title = Title;
        date = Date;
        description = Description;
        image = Image;
    }
}
