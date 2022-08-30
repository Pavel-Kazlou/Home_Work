package home_work_2.Loops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoopsFifthTest {

    @Test
    public void maxOne() {
        LoopsFifth loopsFifth = new LoopsFifth();
        Assertions.assertEquals(8, loopsFifth.maxOne(83624531));
    }

    @Test
    public void evenOdd() {
        LoopsFifth loopsFifth = new LoopsFifth();
        Assertions.assertEquals("3; 4", loopsFifth.evenOdd(3456792));
    }

    @Test
    public void feb() {
        int[] arrExpected = {1, 2, 3, 5, 8};
        int[] arrActual = LoopsFifth.feb(5);
        assertArrayEquals(arrExpected, arrActual);
    }

    @Test
    public void step() {
        int[] arrExpected = {5, 8, 11, 14};
        int[] arrActual = LoopsFifth.step(5, 15, 3);
        assertArrayEquals(arrExpected, arrActual);
    }

    @Test
    public void revers() {
        LoopsFifth loopsFifth = new LoopsFifth();
        Assertions.assertEquals(987654321,loopsFifth.revers(123456789));
    }
}