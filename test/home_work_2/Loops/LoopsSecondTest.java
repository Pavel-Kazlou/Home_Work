package home_work_2.Loops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoopsSecondTest {

    @Test
    public void getCheck() {
        LoopsSecond loopsSecond = new LoopsSecond(247993);
        Assertions.assertEquals(13608,loopsSecond.getCheck());

        LoopsSecond loopsSecond1 = new LoopsSecond(123450);
        Assertions.assertEquals(120,loopsSecond1.getCheck());

        LoopsSecond loopsSecond2 = new LoopsSecond(110737);
        Assertions.assertEquals(147,loopsSecond2.getCheck());

        LoopsSecond loopsSecond3 = new LoopsSecond(0);
        Assertions.assertEquals(0,loopsSecond3.getCheck());
    }
}