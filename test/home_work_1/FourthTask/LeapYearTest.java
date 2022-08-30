package home_work_1.FourthTask;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LeapYearTest {

    @Test
    public void getSolution() {
        LeapYear leapYear = new LeapYear(2000);
        Assertions.assertEquals("Год является високостным",leapYear.getSolution());

        LeapYear leapYear1 = new LeapYear(1997);
        Assertions.assertEquals("Год не является високостным",leapYear1.getSolution());
    }
}
// "Год является високостным"
// "Год не является високостным"