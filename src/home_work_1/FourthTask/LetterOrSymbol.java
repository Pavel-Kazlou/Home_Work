package home_work_1.FourthTask;

import java.util.Scanner;

// 4.5

public class LetterOrSymbol {

    private char symbol;

    public LetterOrSymbol(char symbol) {
        this.symbol = symbol;
    }

    /**
     * Метод метод определяет введён символ или буква
     */
    public String getSolution() {

        if ((symbol >= 'a') && (symbol <= 'z') || (symbol >= 'A') && (symbol <= 'Z')) {
            return "Буква";
        } else if ((symbol >= ' ') && (symbol <= '/') || (symbol >= ':') && (symbol <= '@') || (symbol >= '[') && (symbol <= '`')
                || (symbol >= '{') && (symbol <= '~')) {
            return "Символ";
        }
        return "Не буква и не символ";
    }
}
