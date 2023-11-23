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
    private boolean _resultIsPresent = false;


    private int getOperatorIndex(StringBuilder stringOnScreen) {
        for (int i=0; i<stringOnScreen.length(); i++) {
            char currentChar = stringOnScreen.charAt(i);
            if (!Character.isDigit(currentChar)) {
                return i;
            }
        }
        return -1;
    }

    private void calculResult() {
        int operatorIndex = getOperatorIndex(_stringOnScreen);
        char operator = _stringOnScreen.charAt(operatorIndex);
        int firstTerm = Integer.parseInt((_stringOnScreen.substring(0, operatorIndex)));
        int secondTerm = Integer.parseInt((_stringOnScreen.substring(operatorIndex+1)));
        int result = 0;
        switch (operator) {
            case '+' :
                result = firstTerm + secondTerm;
                break;
            case '-' :
                result = firstTerm - secondTerm;
                break;
            case 'x' :
                result = firstTerm * secondTerm;
                break;
            case '/' :
                result = firstTerm / secondTerm;
                break;
        }
        _stringOnScreen.setLength(0);
        _stringOnScreen.append(result);
        _screen.setText(_stringOnScreen);
        _resultIsPresent = true;
    }

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

    private void actionOfDigitButton(String digit) {
        if (_resultIsPresent) {
            _stringOnScreen.setLength(0);
            _resultIsPresent = false;
        }
        _stringOnScreen.append(digit);
        _screen.setText(_stringOnScreen.toString());
    }

    private void clickOnDigit(Button button, String digit) {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                actionOfDigitButton(digit);
            }
        });
    }

    private void clickOnOperator(Button button, String operator) {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (_resultIsPresent) {
                    _resultIsPresent = false;
                }
                _stringOnScreen.append(operator);
                _screen.setText(_stringOnScreen.toString());
            }
        });
    }

    private void actionOfDelButton() {
        if (_stringOnScreen.length() > 0) {
            _stringOnScreen = _stringOnScreen.deleteCharAt(_stringOnScreen.length() - 1);
            _screen.setText(_stringOnScreen.toString());
        }
    }

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        linkButtons();

        clickOnDigit(button0, "0");
        clickOnDigit(button1, "1");
        clickOnDigit(button2, "2");
        clickOnDigit(button3, "3");
        clickOnDigit(button4, "4");
        clickOnDigit(button5, "5");
        clickOnDigit(button6, "6");
        clickOnDigit(button7, "7");
        clickOnDigit(button8, "8");
        clickOnDigit(button9, "9");

        clickOnOperator(buttonPlus, "+");
        clickOnOperator(buttonMinus, "-");
        clickOnOperator(buttonMult, "x");
        clickOnOperator(buttonDiv, "/");

        buttonDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                actionOfDelButton();
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculResult();
            }
        });

    }
}
