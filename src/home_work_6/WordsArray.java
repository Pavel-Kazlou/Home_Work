package home_work_6;

import java.io.Serializable;

public class WordsArray implements Serializable {
    /**
     * метод разбивает полученную строку на отдельные слова
     *
     * @param line строка для разбиения
     * @return возвращает массив слов
     */
    public static String [] addWordsToArray (String line) {
        return line.split("[\\s!,.:;]+");
    }
}
