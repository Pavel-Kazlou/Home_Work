package home_work_3.Calcs.Simple;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {
//        4.1 + 15 * 7 + (28 / 5) ^ 2
        CalculatorWithMathExtends calc = new CalculatorWithMathExtends();
        double num1 = calc.division(28, 5);
        double num2 = calc.pow(num1, 2);
        double num3 = calc.multiplication(15, 7);
        double result = calc.addition(4.1,num3,num2);

        System.out.println(result);
    }
}
