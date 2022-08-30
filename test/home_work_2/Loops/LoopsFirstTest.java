package home_work_2.Loops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LoopsFirstTest {

    @Test
    public void multi() {
        LoopsFirst loopsFirst = new LoopsFirst(8);
        Assertions.assertEquals(40320, loopsFirst.multi());

        LoopsFirst loopsFirst1 = new LoopsFirst(0);
        Assertions.assertEquals(0, loopsFirst1.multi());

        LoopsFirst loopsFirst2 = new LoopsFirst(-1);
        Assertions.assertEquals(-1, loopsFirst2.multi());
    }
}