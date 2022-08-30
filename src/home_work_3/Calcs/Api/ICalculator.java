package home_work_3.Calcs.Api;

public interface ICalculator {
    double addition(double num1, double num2, double num3);

    double subtraction(double num1, double num2);

    double multiplication(double num1, double num2);

    double division(double num1, double num2);

    double pow(double value, double powValue);

    double absoluteValue(double value);

    double secondRoot(double value);

}
