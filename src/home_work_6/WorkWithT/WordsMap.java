package home_work_6.WorkWithT;


import java.util.HashMap;
import java.util.Map;

public class WordsMap {

    /**
     * метод создает коллекцию из уникальных слов(ключ) и количество их упоминаний(значение)
     *
     * @param words массив из которого выбираются слова
     * @return коллецию MAP в которой ключ = слово из массива, значение = частота упоминаний слова
     */
    public static Map<String, Integer> mapCollection(String[] words) {
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            if (map.keySet().contains(word)) {
                map.put(word, map.get(word) + 1);           // если уже есть ключ, то прибавляем единицу
            } else {
                map.put(word, 1);                           // Если нет, то кладем ключ и присваиваем значение 1
            }
        }
        return map;
    }
}

