package home_work_2.Loops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LoopsThirdTest {

    @Test
    public void exponentiation() {
        LoopsThird loopsThird = new LoopsThird(5,1);
        Assertions.assertEquals(5,loopsThird.exponentiation());

        LoopsThird loopsThird1 = new LoopsThird(5,5);
        Assertions.assertEquals(3125,loopsThird1.exponentiation());

        LoopsThird loopsThird2 = new LoopsThird(7.5,2);
        Assertions.assertEquals(56.25,loopsThird2.exponentiation());

        LoopsThird loopsThird3 = new LoopsThird(1,5);
        Assertions.assertEquals(1,loopsThird3.exponentiation());
    }
}