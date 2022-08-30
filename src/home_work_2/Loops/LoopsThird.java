package home_work_2.Loops;

// 1.3

public class LoopsThird {

    private double number;
    private double pow;

    public LoopsThird(double number, double pow) {
        this.number = number;
        this.pow = pow;
    }

    public double exponentiation() {

        double result = 1;
        if (pow < 0) {
            System.out.println("Отрицательная степень не допустима!");
            return result;
        } else {
            for (int i = 1; i <= pow; ++i) {
                result = result * number;
            }
        }
        return result;
    }
}