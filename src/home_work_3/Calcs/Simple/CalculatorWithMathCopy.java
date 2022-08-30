package home_work_3.Calcs.Simple;

import home_work_3.Calcs.Api.ICalculator;

public class CalculatorWithMathCopy implements ICalculator {

    public double addition(double num1, double num2, double num3) {
        return num1 + num2 + num3;
    }
    public double subtraction(double num1, double num2) {
        return num1 - num2;
    }
    public double multiplication(double num1, double num2) {
        return num1 * num2;
    }
    public double division(double num1, double num2) {
        return num1 / num2;
    }
    public double pow(double value, double powValue) {
        return Math.pow(value, powValue);
    }
    public double absoluteValue(double value) {
        return Math.abs(value);
    }
    public double secondRoot(double value) {
        return Math.sqrt(value);
    }
}

