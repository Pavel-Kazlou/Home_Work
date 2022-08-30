package home_work_1.FourthTask;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ConversionTest {

    @Test
    public void getConversion() {
        Conversion conversion = new Conversion(1000000);
        Assertions.assertEquals(976.5625, conversion.getConversion());
    }
}