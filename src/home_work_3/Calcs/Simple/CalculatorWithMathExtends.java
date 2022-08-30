package home_work_3.Calcs.Simple;

import home_work_3.Calcs.Api.ICalculator;


public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {
    @Override
    public double pow(double value, double powValue) {
        return Math.pow(value, powValue);
    }

    @Override
    public double absoluteValue(double value) {
        return Math.abs(value);
    }

    @Override
    public double secondRoot(double value) {
        return Math.sqrt(value);
    }
}
