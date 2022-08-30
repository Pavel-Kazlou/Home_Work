package home_work_3.Calcs.Additional;

import home_work_3.Calcs.Simple.CalculatorWithMathCopy;
import home_work_3.Calcs.Simple.CalculatorWithMathExtends;
import home_work_3.Calcs.Simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoChoiceAgregation {

    private CalculatorWithMathCopy superCalculator;
    private CalculatorWithOperator superCalculator1;
    private CalculatorWithMathExtends superCalculator2;

    private long countOperation;

    public long getCountOperation() {
        return countOperation;
    }

    public void incrementCountOperation() {
        countOperation++;
    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathCopy calculator) {
        this.superCalculator = calculator;
    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithOperator calculator) {
        this.superCalculator1 = calculator;
    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathExtends calculator) {
        this.superCalculator2 = calculator;
    }

    public double addition(double num1, double num2, double num3) {
        if (superCalculator != null) {
            incrementCountOperation();
            return superCalculator.addition(num1, num2, num3);
        } else if (superCalculator1 != null) {
            incrementCountOperation();
            return superCalculator1.addition(num1, num2, num3);
        } else {
            incrementCountOperation();
            return superCalculator2.addition(num1, num2, num3);
        }
    }

    public double subtraction(double num1, double num2) {
        if (superCalculator != null) {
            incrementCountOperation();
            return superCalculator.subtraction(num1, num2);
        } else if (superCalculator1 != null) {
            incrementCountOperation();
            return superCalculator1.subtraction(num1, num2);
        } else {
            incrementCountOperation();
            return superCalculator2.subtraction(num1, num2);
        }
    }

    public double multiplication(double num1, double num2) {
        if (superCalculator != null) {
            incrementCountOperation();
            return superCalculator.multiplication(num1, num2);
        } else if (superCalculator1 != null) {
            incrementCountOperation();
            return superCalculator1.multiplication(num1, num2);
        } else {
            incrementCountOperation();
            return superCalculator2.multiplication(num1, num2);
        }
    }

    public double division(double num1, double num2) {
        if (superCalculator != null) {
            incrementCountOperation();
            return superCalculator.division(num1, num2);
        } else if (superCalculator1 != null) {
            incrementCountOperation();
            return superCalculator1.division(num1, num2);
        } else {
            incrementCountOperation();
            return superCalculator2.division(num1, num2);
        }
    }

    public double pow(double value, double powValue) {
        if (superCalculator != null) {
            incrementCountOperation();
            return superCalculator.pow(value, powValue);
        } else if (superCalculator1 != null) {
            incrementCountOperation();
            return superCalculator1.pow(value, powValue);
        } else {
            incrementCountOperation();
            return superCalculator2.pow(value, powValue);
        }
    }

    public double absoluteValue(double value) {
        if (superCalculator != null) {
            incrementCountOperation();
            return superCalculator.absoluteValue(value);
        } else if (superCalculator1 != null) {
            incrementCountOperation();
            return superCalculator1.absoluteValue(value);
        } else {
            incrementCountOperation();
            return superCalculator2.absoluteValue(value);
        }
    }

    public double secondRoot(double value) {
        if (superCalculator != null) {
            incrementCountOperation();
            return superCalculator.secondRoot(value);
        } else if (superCalculator1 != null) {
            incrementCountOperation();
            return superCalculator1.secondRoot(value);
        } else {
            incrementCountOperation();
            return superCalculator2.secondRoot(value);
        }
    }
}
