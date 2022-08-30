package home_work_3.Calcs.Additional;

import home_work_3.Calcs.Simple.CalculatorWithMathCopy;
import home_work_3.Calcs.Simple.CalculatorWithMathExtends;
import home_work_3.Calcs.Simple.CalculatorWithOperator;

public class CalculatorWithCounterDelegateChoiceAgregationMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoChoiceAgregation calc = new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathCopy());
        double division = calc.division(28, 5);
        double pow = calc.pow(division, 2);
        double multiplication = calc.multiplication(15, 7);
        double result = calc.addition(4.1, multiplication, pow);

        System.out.println(result);
        System.out.println(calc.getCountOperation());

        CalculatorWithCounterAutoChoiceAgregation calc1 = new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithOperator());
        double division1 = calc1.division(28, 5);
        double pow1 = calc1.pow(division1, 2);
        double multiplication1 = calc1.multiplication(15, 7);
        double result1 = calc1.addition(4.1, multiplication1, pow1);

        System.out.println(result1);
        System.out.println(calc1.getCountOperation());

        CalculatorWithCounterAutoChoiceAgregation calc2 = new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathExtends());
        double division2 = calc2.division(28, 5);
        double pow2 = calc2.pow(division2, 2);
        double multiplication2 = calc2.multiplication(15, 7);
        double result2 = calc2.addition(4.1, multiplication2, pow2);

        System.out.println(result2);
        System.out.println(calc2.getCountOperation());
    }
}
