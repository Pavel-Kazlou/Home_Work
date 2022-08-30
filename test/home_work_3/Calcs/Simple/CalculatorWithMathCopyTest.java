package home_work_3.Calcs.Simple;

import home_work_3.Calcs.Additional.CalculatorWithCounterAutoAgregationInterface;
import home_work_3.Calcs.Api.ICalculator;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorWithMathCopyTest {

    @Test
    public void addition() {
        ICalculator data = new CalculatorWithMathCopy();
        assertEquals(29.3,data.addition(15, 10, 4.3));
    }

    @Test
    public void subtraction() {
        ICalculator data = new CalculatorWithMathCopy();
        assertEquals(11.2,data.subtraction(17,5.8));
    }

    @Test
    public void multiplication() {
        ICalculator data = new CalculatorWithMathCopy();
        assertEquals(16.5,data.multiplication(5.5,3));
    }

    @Test
    public void division() {
        ICalculator data = new CalculatorWithMathCopy();
        assertEquals(3,data.division(33,11));
    }

    @Test
    public void pow() {
        ICalculator data = new CalculatorWithMathCopy();
        assertEquals(125,data.pow(5,3));
    }

    @Test
    public void absoluteValue() {
        ICalculator data = new CalculatorWithMathCopy();
        assertEquals(7,data.absoluteValue(-7));
    }

    @Test
    public void secondRoot() {
        ICalculator data = new CalculatorWithMathCopy();
        assertEquals(6,data.secondRoot(36));
    }

    //CalculatorWithMathExtends
    @Test
    public void pow1() {
        ICalculator data = new CalculatorWithMathExtends();
        assertEquals(31.359999999999996, data.pow(5.6, 2));
    }

    @Test
    public void absoluteValue1() {
        ICalculator data = new CalculatorWithMathExtends();
        assertEquals(3, data.absoluteValue(-3));
    }

    @Test
    public void secondRoot1() {
        ICalculator data = new CalculatorWithMathExtends();
        assertEquals(7, data.secondRoot(49));
    }

    //CalculatorWithCounterAutoAgregationInterface
    @Test
    public void addition2() {
        ICalculator data = new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathCopy());
        assertEquals(29.3, data.addition(15, 10, 4.3));
    }

    @Test
    public void subtraction2() {
        ICalculator data = new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathCopy());
        assertEquals(11.2, data.subtraction(17,5.8));
    }

    @Test
    public void division2() {
        ICalculator data = new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathCopy());
        assertEquals(3, data.division(33, 11));
    }

    @Test
    public void multiplication2() {
        ICalculator data = new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathCopy());
        assertEquals(16.5, data.multiplication(5.5, 3));
    }

    @Test
    public void pow2() {
        ICalculator data = new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathCopy());
        assertEquals(31.359999999999996, data.pow(5.6, 2));
    }

    @Test
    public void absoluteValue2() {
        ICalculator data = new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathCopy());
        assertEquals(3, data.absoluteValue(-3));
    }

    @Test
    public void secondRoot12() {
        ICalculator data = new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathCopy());
        assertEquals(7, data.secondRoot(49));
    }
}