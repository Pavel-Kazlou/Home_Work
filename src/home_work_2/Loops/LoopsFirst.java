package home_work_2.Loops;

// 1.1

public class LoopsFirst {

    private double number;

    public LoopsFirst(double number) {
        this.number = number;
    }

    public double multi() {
        if (number <= 0) {
            return number;
        }
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        return result;
    }
}
