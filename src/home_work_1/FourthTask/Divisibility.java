package home_work_1.FourthTask;

// 4.3

public class Divisibility {

    private int a;
    private int b;

    public Divisibility(int a, int b) {
        this.a = a;
        this.b = b;
    }

    /**
     * Метод проверки делимости одного числа на другое
     *
     * @return
     */
    public String getAnswer() {
        if (a == 0 || b == 0) {
            return "На ноль делить нельзя";
        } else if (a % b == 0 && b % a != 0) {
            return "Первое делится на второе";
        } else if (b % a == 0 && a % b != 0) {
            return "Второе делится на первое";
        } else if (a / b == 1 && b / a == 1) {
            return "Числа делятся друг на друга";
        }
        return "Числа не делятся друг на друга";
    }
}

