package home_work_3.Calcs.Simple;

public class CalculatorWithOperator {

    public double addition(double num1, double num2, double num3) {

        double result = num1 + num2 + num3;
        return result;
    }

    public double subtraction(double num1, double num2) {

        double result = num1 - num2;
        return result;
    }

    public double multiplication(double num1, double num2) {

        double result = num1 * num2;
        return result;
    }

    public double division(double num1, double num2) {

        double result = num1 / num2;
        return result;
    }

    public double pow(double value, double powValue) {

        double result = 1;

        if (powValue < 0) {
            System.out.println("Отрицательная степень не допустима!");
        } else {
            for (int i = 1; i <= powValue; ++i) {
                result = result * value;
            }
        }
        return result;
    }

    public double absoluteValue(double value) {
        return (Math.abs(value));
    }

    // public double absoluteValue(double value) {  нужно написать таким способом
//    if(value < 0){
//        return -value;
//    } else {
//        return a;
//    }
//    return a < 0 ? - a : a;   или таким
    public double secondRoot(double value) {
        return (Math.sqrt(value));
    }
}
