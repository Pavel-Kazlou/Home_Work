package home_work_3.Calcs.Additional;

import home_work_3.Calcs.Simple.CalculatorWithMathCopy;

public class CalculatorWithCounterAutoCompositeInterfaceMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoAgregationInterface calculator = new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathCopy());
        double num1 = calculator.division(28, 5);
        double num2 = calculator.pow(num1, 2);
        double num3 = calculator.multiplication(15, 7);
        double result = calculator.addition(4.1,num3,num2);

        System.out.println(result);
        System.out.println(calculator.getCountOperation());
    }
}
