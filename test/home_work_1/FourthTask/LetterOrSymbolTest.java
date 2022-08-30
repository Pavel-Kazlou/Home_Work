package home_work_1.FourthTask;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class LetterOrSymbolTest {

    @Test
    public void getSolution() {
        LetterOrSymbol letterOrSymbol = new LetterOrSymbol('g');
        Assertions.assertEquals("Буква", letterOrSymbol.getSolution());

        LetterOrSymbol letterOrSymbol1 = new LetterOrSymbol('}');
        Assertions.assertEquals("Символ", letterOrSymbol1.getSolution());

        LetterOrSymbol letterOrSymbol2 = new LetterOrSymbol('1');
        Assertions.assertEquals("Не буква и не символ", letterOrSymbol2.getSolution());
    }
}
// "Буква"
// "Символ"
// "Не буква и не символ"