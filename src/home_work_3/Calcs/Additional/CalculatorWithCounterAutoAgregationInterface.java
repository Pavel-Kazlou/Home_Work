package home_work_3.Calcs.Additional;

import home_work_3.Calcs.Api.ICalculator;
import home_work_3.Calcs.Simple.CalculatorWithMathCopy;

public class CalculatorWithCounterAutoAgregationInterface implements ICalculator {

    private ICalculator superCalculator;
    private long countOperation;

    public long getCountOperation() {
        return countOperation;
    }

    public void incrementCountOperation() {
        countOperation++;
    }

    public CalculatorWithCounterAutoAgregationInterface(CalculatorWithMathCopy calculator) {
        this.superCalculator = calculator;
    }

    public double addition(double num1, double num2, double num3) {
        incrementCountOperation();
        return superCalculator.addition(num1, num2, num3);
    }

    public double subtraction(double num1, double num2) {
        incrementCountOperation();
        return superCalculator.subtraction(num1, num2);
    }

    public double multiplication(double num1, double num2) {
        incrementCountOperation();
        return superCalculator.multiplication(num1, num2);
    }

    public double division(double num1, double num2) {
        incrementCountOperation();
        return superCalculator.division(num1, num2);
    }

    public double pow(double value, double powValue) {
        incrementCountOperation();
        return superCalculator.pow(value, powValue);
    }

    public double absoluteValue(double value) {
        incrementCountOperation();
        return superCalculator.absoluteValue(value);
    }

    public double secondRoot(double value) {
        incrementCountOperation();
        return superCalculator.secondRoot(value);
    }
}
