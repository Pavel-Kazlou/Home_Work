package home_work_1.FourthTask;

//4.1

public class OddNumber {

    private int number;

    public OddNumber(int number) {
        this.number = number;
    }

    /**
     * Метод проверяющий чётность/нечётность
     */
    public String oddOreNot() {
        if (number % 2 == 0) {
            return "Чётное";
        } else
            return "Нечётное";
    }
}


