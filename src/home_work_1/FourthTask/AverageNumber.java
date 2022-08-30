package home_work_1.FourthTask;

// 4.2

public class AverageNumber {

    private int a;
    private int b;
    private int c;

    public AverageNumber(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Метод находит среднее число
     */
    public int getAverage() {

        if (a >= b && a <= c || a <= b && a >= c) {
            return a;
        } else if (b >= a && b <= c || b <= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }
}
