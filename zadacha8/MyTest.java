import calculator.CalculatorApp;
import calculator.Input;
import calculator.Operations;
import org.junit.Assert;
import org.junit.Test;
import calculator.Function;

import java.util.Scanner;

public class MyTest {
    @Test
    public void additionSymbolIsPlus() {
        Function function = new Operations.Addition();
        Assert.assertEquals("+", function.getSymbol());
    }

    @Test
    public void subtractionSymbolIsMinus() {
        Function function = new Operations.Subtraction();
        Assert.assertEquals("-", function.getSymbol());
    }

    @Test
    public void multiplicationSymbolIsStar() {
        Function function = new Operations.Multiplication();
        Assert.assertEquals("*", function.getSymbol());
    }

    @Test
    public void divisionSymbolIsSlash() {
        Function function = new Operations.Division();
        Assert.assertEquals("/", function.getSymbol());
    }

    @Test
    public void logSymbolIsLog() {
        Function function = new Operations.Log();
        Assert.assertEquals("log", function.getSymbol());
    }

    @Test
    public void sqrtSymbolIsSqrt() {
        Function function = new Operations.Sqrt();
        Assert.assertEquals("sqrt", function.getSymbol());
    }

    @Test
    public void parseInput_ReturnsExitString_UserInputIsExit() {
        CalculatorApp app = new CalculatorApp();
        Input input = new Input();
        Scanner scan = new Scanner("Выход\n");
        Assert.assertEquals("Выход", app.parseInput(input, scan));
    }

    @Test
    public void parseInput_ReturnsWrongInputString_UserInputsIncorrectOperation() {
        CalculatorApp app = new CalculatorApp();
        Input input = new Input();
        Scanner scan = new Scanner("Какая-то строка 2.5 18\n");
        Assert.assertEquals("wrong input", app.parseInput(input, scan));
    }

    @Test
    public void parseInput_ReturnsWrongInputString_FirstOperandMissingInInput() {
        CalculatorApp app = new CalculatorApp();
        Input input = new Input();
        Scanner scan = new Scanner("log\n");
        Assert.assertEquals("wrong input", app.parseInput(input, scan));
    }

    @Test
    public void parseInput_ReturnsWrongInputString_FirstOperandIsNotANumber() {
        CalculatorApp app = new CalculatorApp();
        Input input = new Input();
        Scanner scan = new Scanner("+ b 2\n");
        Assert.assertEquals("wrong input", app.parseInput(input, scan));
    }

    @Test
    public void parseInput_ReturnsWrongInputString_SecondOperandMissingForBinaryOperation() {
        CalculatorApp app = new CalculatorApp();
        Input input = new Input();
        Scanner scan = new Scanner("/ 5.5\n");
        Assert.assertEquals("wrong input", app.parseInput(input, scan));
    }

    @Test
    public void parseInput_ReturnsWrongInputString_SecondOperandIsNotANumber() {
        CalculatorApp app = new CalculatorApp();
        Input input = new Input();
        Scanner scan = new Scanner("- 18.34 fhgdg\n");
        Assert.assertEquals("wrong input", app.parseInput(input, scan));
    }

    @Test
    public void parseInput_ReturnsCorrectInputString_InputSatisfiesReqsInPrompt() {
        CalculatorApp app = new CalculatorApp();
        Input input = new Input();
        Scanner scan1 = new Scanner("sqrt 81\n");
        Scanner scan2 = new Scanner("* 9132.34 15\n");
        Assert.assertEquals("correct input", app.parseInput(input, scan1));
        Assert.assertEquals("correct input", app.parseInput(input, scan2));
    }
    
    @Test
    public void matchOperation_ReturnsTrue_PlusStringPassed() {
        CalculatorApp app = new CalculatorApp();
        Assert.assertTrue(app.matchOperation("+"));
    }

    @Test
    public void matchOperation_ReturnsTrue_MinusStringPassed() {
        CalculatorApp app = new CalculatorApp();
        Assert.assertTrue(app.matchOperation("-"));
    }

    @Test
    public void matchOperation_ReturnsTrue_StarStringPassed() {
        CalculatorApp app = new CalculatorApp();
        Assert.assertTrue(app.matchOperation("*"));
    }

    @Test
    public void matchOperation_ReturnsTrue_SlashStringPassed() {
        CalculatorApp app = new CalculatorApp();
        Assert.assertTrue(app.matchOperation("/"));
    }

    @Test
    public void matchOperation_ReturnsTrue_LogStringPassed() {
        CalculatorApp app = new CalculatorApp();
        Assert.assertTrue(app.matchOperation("log"));
    }

    @Test
    public void matchOperation_returnsTrue_SqrtStringPassed() {
        CalculatorApp app = new CalculatorApp();
        Assert.assertTrue(app.matchOperation("sqrt"));
    }

    @Test
    public void matchOperation_returnsFalse_StringNotMatchingOperationSymbolsPassed() {
        CalculatorApp app = new CalculatorApp();
        Assert.assertFalse(app.matchOperation(" sgwg54yh"));
    }
}
