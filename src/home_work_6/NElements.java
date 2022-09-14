package home_work_6;

import java.util.List;
import java.util.Map;

public class NElements {
    /**
     * метод возвращает n записей из коллекции
     * @param arrList коллекция из которой будут выбраны записи
     * @param number количество возвращаемых записей
     */
    public static void someElements(List<Map.Entry<String, Integer>> arrList, int number) {
        int i = 0;
        while (i < number) {
            System.out.println(arrList.get(i));
            i++;
        }
    }
}
