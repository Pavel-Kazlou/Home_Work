package home_work_6.WorkWithT;

import java.util.List;
import java.util.Map;

public class Sort {
    /**
     * метод сортирует коллекцию
     *
     * @param arrayList коллекция для сортировки
     */
    public static void toSort(List<Map.Entry<String, Integer>> arrayList) {
        arrayList.sort(new WordComparator());
    }
}
