package com.example.calculator;

import android.content.Context;
import androidx.test.platform.app.InstrumentationRegistry;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class testCalculatorModel {
    private CalculatorModel calculator = new CalculatorModel();
    private StringBuilder string = new StringBuilder();
    @Test
    public void testAddCharacter() {
        String expectedResult = "8";
        assertEquals(calculator.addCharacter(string, "8").toString(), expectedResult);
    }
    @Test
    public void testAddCharacters() {
        String expectedResult = "9+91";
        string = calculator.addCharacter(string, "9");
        string = calculator.addCharacter(string, "+");
        string = calculator.addCharacter(string, "9");
        string = calculator.addCharacter(string, "1");
        assertEquals(string.toString(), expectedResult);
    }
    @Test
    public void testAddCharacterLimit() {
        String tenCharacters = "9999999999";
        string = new StringBuilder(tenCharacters);
        String expectedResult = tenCharacters;
        assertEquals(calculator.addCharacter(string, "9").toString(), expectedResult);
    }
    @Test
    public void testCalculResult() {
        String expectedResult = "81";
        string = new StringBuilder("9*9");
        assertEquals(calculator.calculResult(string).toString(), expectedResult);
    }
    @Test
    public void testCalculResultError() {
        String expectedResult = "Invalid";
        string = new StringBuilder("9**9");
        assertEquals(calculator.calculResult(string).toString(), expectedResult);
    }

    @Test
    public void testDel() {
        String expectedResult = "9*";
        string = new StringBuilder("9*9");
        assertEquals(calculator.actionOfDelButton(string).toString(), expectedResult);
    }

    @Test
    public void testEmptyDel() {
        String expectedResult = "";
        string = new StringBuilder();
        assertEquals(calculator.actionOfDelButton(string).toString(), expectedResult);
    }
}
