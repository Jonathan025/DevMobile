package com.example.calculator;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.concurrent.TimeUnit;

public class FluxActivity extends AppCompatActivity {

    private MyRSSsaxHandler _handler;
    private ScrollView _scrollView;
    private Button nextButton;
    private Button previousButton;
    private TextView dateView;
    private TextView descriptionView;
    private TextView titleView;
    private ImageView imageView;
    private FluxModel _fluxModel;


    private void linkButtons() {
        nextButton = findViewById(R.id.buttonNext);
        previousButton = findViewById(R.id.buttonPrev);
        dateView = findViewById(R.id.imageDate);
        descriptionView = findViewById(R.id.imageDescription);
        titleView = findViewById(R.id.imageTitle);
        imageView = findViewById(R.id.imageDisplay);
    }

    private void clickOnNextButton() {
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                _fluxModel.nextItem();
                show(_fluxModel.getItem());
            }
        });
    }

    private void clickOnPreviousButton() {
        previousButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                _fluxModel.previousItem();
                show(_fluxModel.getItem());
            }
        });
    }

    public void show(Item item) {
        /*String title = item.title.toString();
        String description = item.description.toString();
        String date = item.date.toString();
        Bitmap image = item.image;

        titleView.setText(title);
        descriptionView.setText(description);
        dateView.setText(date);
        imageView.setImageBitmap(image);*/
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flux);
        linkButtons();

        Context context = this;
        _fluxModel = new FluxModel(context);
        _fluxModel.sendRequestAndReceiveDatas();
        show(_fluxModel.getItem());

        clickOnNextButton();
        clickOnPreviousButton();
    }

}
