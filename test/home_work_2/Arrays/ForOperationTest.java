package home_work_2.Arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ForOperationTest {

    private final int[] arrActual = {1, 4, 5, 8, 12, 5, 0, 5};
    private final int[] arrExpectedAll = {1, 4, 5, 8, 12, 5, 0, 5};
    private final int[] arrExpectedSecond = {4, 8, 5, 5};
    private final int[] arrExpectedRevert = {5, 0, 5, 12, 8, 5, 4, 1};

    @Test
    public void arrayAll() {
        IArraysOperation first = new ForOperation();
        assertArrayEquals(arrExpectedAll, first.arrayAll(arrActual));
    }

    @Test
    public void arrayEverySecond() {
        IArraysOperation second = new ForOperation();
        assertArrayEquals(arrExpectedSecond, second.arrayEverySecond(arrActual));
    }

    @Test
    public void arrayRevert() {
        IArraysOperation third = new ForOperation();
        assertArrayEquals(arrExpectedRevert, third.arrayRevert(arrActual));
    }
}