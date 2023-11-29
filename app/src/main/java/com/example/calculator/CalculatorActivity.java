package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {

    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button0;
    private Button buttonPlus;
    private Button buttonMinus;
    private Button buttonMult;
    private Button buttonDiv;
    private Button buttonDel;
    private Button buttonEqual;

    private TextView _screen;
    private StringBuilder _stringOnScreen = new StringBuilder();
    private final CalculatorModel calculator = new CalculatorModel();



    private void linkButtons() {
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button0 = findViewById(R.id.button0);
        buttonPlus = findViewById(R.id.buttonPlus);
        buttonMinus = findViewById(R.id.buttonMinus);
        buttonMult = findViewById(R.id.buttonMult);
        buttonDiv = findViewById(R.id.buttonDiv);
        buttonDel = findViewById(R.id.buttonDel);
        buttonEqual = findViewById(R.id.buttonEqual);
        _screen = findViewById(R.id.screenText);
    }

    private void clickOnCharacter(Button button, String character) {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                _stringOnScreen = calculator.addCharacter(_stringOnScreen, character);
                _screen.setText(_stringOnScreen.toString());
            }
        });
    }

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        linkButtons();

        clickOnCharacter(button0, "0");
        clickOnCharacter(button1, "1");
        clickOnCharacter(button2, "2");
        clickOnCharacter(button3, "3");
        clickOnCharacter(button4, "4");
        clickOnCharacter(button5, "5");
        clickOnCharacter(button6, "6");
        clickOnCharacter(button7, "7");
        clickOnCharacter(button8, "8");
        clickOnCharacter(button9, "9");

        clickOnCharacter(buttonPlus, "+");
        clickOnCharacter(buttonMinus, "-");
        clickOnCharacter(buttonMult, "*");
        clickOnCharacter(buttonDiv, "/");

        buttonDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                _stringOnScreen = calculator.actionOfDelButton(_stringOnScreen);
                _screen.setText(_stringOnScreen.toString());
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                _stringOnScreen = calculator.calculResult(_stringOnScreen);
                _screen.setText(_stringOnScreen.toString());
            }
        });

    }
}
