package home_work_2.Arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraysTasksTest {

    private final int[] arrActual = {1, 0, 12, 45, 2, 3, 9, 5, 7, 7, 234, -6};
    private final int[] arrActual2 = {-1, -6};
    private final int[] arrActual3 = {0, 0, 1};
    private final int[] arrExpectedAvgLess2 = {-6};
    private final int[] arrExpectedAvgLess = {1, 0, 12, 2, 3, 9, 5, 7, 7, -6};
    private final int[] arrExpectedTwoNumbers = {-6, 0};
    private final int[] arrExpectedTwoNumbers2 = {0, 0};
    private final int[] arrlessThenNumbers = {12, 45, 9, 7, 7, 234, -6};
    private final int[] arrlessThenNumbers2 = {1, 0, 12, 45, 2, 3, 9, 5, 7, 7, 234, -6};

    @Test
    public void countCheck() {
        assertEquals(4, ArraysTasks.count(arrActual));
    }

    @Test
    public void countCheck2() {
        assertEquals(0, ArraysTasks.count(arrActual2));
    }

    @Test
    public void maxElementCheck() {
        assertEquals(234, ArraysTasks.maxElement(arrActual));
    }

    @Test
    public void maxElementCheck2() {
        assertEquals(-1, ArraysTasks.maxElement(arrActual2));
    }

    @Test
    public void sumElementsCheck() {
        assertEquals(319, ArraysTasks.sumElements(arrActual));
    }

    @Test
    public void arrayAvgCheck() {
        assertEquals(26, ArraysTasks.arrayAvg(arrActual));
    }

    @Test
    public void arrayAvgCheck2() {
        assertEquals(-3, ArraysTasks.arrayAvg(arrActual2));
    }

    @Test
    public void numberLessCheck() {
        assertArrayEquals(arrExpectedAvgLess, ArraysTasks.numbersLess(26, arrActual));
    }

    @Test
    public void numberLessCheck2() {
        assertArrayEquals(arrExpectedAvgLess2, ArraysTasks.numbersLess(-3, arrActual2));
    }

    @Test
    public void twoNumbersCheck() {
        assertArrayEquals(arrExpectedTwoNumbers, ArraysTasks.twoNumbers(arrActual));
    }

    @Test
    public void twoNumbersCheck2() {
        assertArrayEquals(arrExpectedTwoNumbers2, ArraysTasks.twoNumbers(arrActual3));
    }

    @Test
    public void lessThenNumbersCheck() {
        assertArrayEquals(arrlessThenNumbers, ArraysTasks.lessThenNumbers(arrActual, -1, 5));
    }

    @Test
    public void lessThenNumbersCheck2() {
        assertArrayEquals(arrlessThenNumbers2, ArraysTasks.lessThenNumbers(arrActual, 18, 20));
    }

    @Test
    public void sumElementsCheck2() {
        assertEquals(-7, ArraysTasks.sumElements(arrActual2));
    }
}