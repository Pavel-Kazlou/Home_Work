package home_work_1.FourthTask;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DivisibilityTest {

    @Test
    public void getAnswer() {
        Divisibility divisibility1 = new Divisibility(2, 6);
        Assertions.assertEquals("Второе делится на первое",divisibility1.getAnswer());

        Divisibility divisibility2 = new Divisibility(6, 1);
        Assertions.assertEquals("Первое делится на второе",divisibility2.getAnswer());

        Divisibility divisibility3 = new Divisibility(0, 6);
        Assertions.assertEquals("На ноль делить нельзя",divisibility3.getAnswer());

        Divisibility divisibility4 = new Divisibility(7, 7);
        Assertions.assertEquals("Числа делятся друг на друга",divisibility4.getAnswer());

        Divisibility divisibility5 = new Divisibility(3, 14);
        Assertions.assertEquals("Числа не делятся друг на друга",divisibility5.getAnswer());
    }
}
// "На ноль делить нельзя"
// "Первое делится на второе"
// "Второе делится на первое"
// "Числа делятся друг на друга"
// "Числа не делятся друг на друга"