package home_work_1.FourthTask;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class OddNumberTest {

    @Test
    public void oddOreNot() {
        OddNumber oddNumber = new OddNumber(4);
        Assertions.assertEquals("Чётное", oddNumber.oddOreNot());

        OddNumber oddNumber1 = new OddNumber(5);
        Assertions.assertEquals("Нечётное", oddNumber1.oddOreNot());
    }
}
// "Чётное"
// "Нечётное"