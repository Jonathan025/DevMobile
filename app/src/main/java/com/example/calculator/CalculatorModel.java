package com.example.calculator;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class CalculatorModel {
    private boolean _resultIsPresent = false;
    private final int _limit;
    private final String digits = "0123456789";


    public CalculatorModel(int limit) {
        _limit = limit;
    }

    public CalculatorModel() {
        _limit = 10;
    }

    public StringBuilder addCharacter(StringBuilder stringOnScreen, String character) {
        if ( (_resultIsPresent && digits.contains(character)) || stringOnScreen.toString().equals("Invalid")) {
            stringOnScreen.setLength(0);
            _resultIsPresent = false;
        }
        if (stringOnScreen.length() < _limit ) {
            stringOnScreen.append(character);
            _resultIsPresent = false;
        }
        return stringOnScreen;
    }

    public StringBuilder calculResult(StringBuilder stringOnScreen) {
        String calcul = stringOnScreen.toString();
        Expression expression = new ExpressionBuilder(calcul).build();
        _resultIsPresent = true;
        try {
            double doubleResult = expression.evaluate();
            int intResult = (int)doubleResult;
            stringOnScreen.setLength(0);
            stringOnScreen.append(intResult);
            return stringOnScreen;
        } catch (Exception error) {
            stringOnScreen = new StringBuilder("Invalid");
            return stringOnScreen;
        }
    }

    public StringBuilder actionOfDelButton(StringBuilder stringOnScreen) {
        if (stringOnScreen.length() > 0) {
            stringOnScreen = stringOnScreen.deleteCharAt(stringOnScreen.length() - 1);
        }
        return stringOnScreen;
    }
}
