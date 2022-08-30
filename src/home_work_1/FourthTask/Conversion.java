package home_work_1.FourthTask;

// 4.4

public class Conversion {

    private double number;
    private final double multiplier = 1024;

    public Conversion(long number) {
        this.number = number;
    }

    /**
     * Метод переводит байты в килобайты
     *
     * @return
     */
    public double getConversion() {
        return number / multiplier;
    }
}
