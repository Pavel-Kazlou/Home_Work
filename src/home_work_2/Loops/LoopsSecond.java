package home_work_2.Loops;

// 1.2

public class LoopsSecond {

    private int number;

    public LoopsSecond(int number) {
        this.number = number;
    }

    public int getCheck() {

        int result = 1;
        int i = 1;

        if (number < 1) {
            return number;
        }

        if (number % 10 == 0) {
            do {
                number = number / 10;
            } while (number % 10 == 0);
        }

        if (number % 10 != 0) {
            do {
                i = number % 10;
                if (i == 0) {
                    number = number / 10;
                    i = number % 10;
                }
                number = number / 10;
                result = result * i;
            } while (number > 0);
        }
        return result;
    }
}
