package home_work_3.Calcs.Additional;

import home_work_3.Calcs.Simple.CalculatorWithMathCopy;

public class CalculatorWithCounterDelegateAgregationMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoAgregation calc = new CalculatorWithCounterAutoAgregation(new CalculatorWithMathCopy());
        double num1 = calc.division(28, 5);
        double num2 = calc.pow(num1, 2);
        double num3 = calc.multiplication(15, 7);
        double result = calc.addition(4.1, num3, num2);

        System.out.println(result);
        System.out.println(calc.getCountOperation());
    }
}
