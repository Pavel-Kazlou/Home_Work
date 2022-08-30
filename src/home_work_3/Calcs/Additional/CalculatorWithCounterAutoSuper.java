package home_work_3.Calcs.Additional;

import home_work_3.Calcs.Simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {

    private long countOperation;

    public long getCountOperation() {
        return countOperation;
    }

    public void incrementCountOperation() {
        countOperation++;
    }

    @Override
    public double pow(double value, double powValue) {
        incrementCountOperation();
        return super.pow(value, powValue);
    }

    @Override
    public double absoluteValue(double value) {
        incrementCountOperation();
        return super.absoluteValue(value);
    }

    @Override
    public double secondRoot(double value) {
        incrementCountOperation();
        return super.secondRoot(value);
    }

    @Override
    public double addition(double num1, double num2, double num3) {
        incrementCountOperation();
        return super.addition(num1, num2, num3);
    }

    @Override
    public double subtraction(double num1, double num2) {
        incrementCountOperation();
        return super.subtraction(num1, num2);
    }

    @Override
    public double multiplication(double num1, double num2) {
        incrementCountOperation();
        return super.multiplication(num1, num2);
    }

    @Override
    public double division(double num1, double num2) {
        incrementCountOperation();
        return super.division(num1, num2);
    }
}
