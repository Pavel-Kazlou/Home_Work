package home_work_1.FourthTask;

// 4.6

public class LeapYear {

    private long year;

    public LeapYear(long year) {
        this.year = year;
    }

    /**
     * Метод метод определяет введён символ или буква
     */
    public String getSolution() {

        if ((year % 400 == 0) || (year % 4 == 0) && ((year % 100 != 0))) {
            return "Год является високостным";
        } else {
            return "Год не является високостным";
        }
    }
}
