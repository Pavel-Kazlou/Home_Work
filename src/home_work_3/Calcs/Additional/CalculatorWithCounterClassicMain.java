package home_work_3.Calcs.Additional;

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {
//        4.1 + 15 * 7 + (28 / 5) ^ 2
        CalculatorWithCounterClassic calc = new CalculatorWithCounterClassic();
        double num1 = calc.division(28, 5);
        calc.incrementCountOperation();
        double num2 = calc.pow(num1, 2);
        calc.incrementCountOperation();
        double num3 = calc.multiplication(15, 7);
        calc.incrementCountOperation();
        double result = calc.addition(4.1,num3,num2);

        System.out.println(result);
        System.out.println(calc.getCountOperation());
    }
}
