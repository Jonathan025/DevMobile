package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button CalculatorButton;
    Button FluxButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CalculatorButton = findViewById(R.id.calculatorLauncher);

        CalculatorButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View _view) {
                Intent i = new Intent(com.example.calculator.MainActivity.this, CalculatorActivity.class);
                startActivity(i);
            }
        });

        FluxButton = findViewById(R.id.calculatorLauncher);

        FluxButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View _view) {
                Intent i = new Intent(com.example.calculator.MainActivity.this, FluxActivity.class);
                startActivity(i);
            }
        });
    }
}