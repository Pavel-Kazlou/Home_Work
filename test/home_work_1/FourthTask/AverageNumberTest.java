package home_work_1.FourthTask;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class AverageNumberTest {

    @Test
    public void getAverage() {
        AverageNumber averageNumber = new AverageNumber(55, 56, 54);
        Assertions.assertEquals(55, averageNumber.getAverage());
    }
}