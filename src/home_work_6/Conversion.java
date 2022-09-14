package home_work_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Conversion {
    /**
     * метод переводит коллекцию Map в ListArray
     * @param map коллекция для перевода
     * @param <K> тип ключа
     * @param <V> тип значения
     * @return коллекцию ArrayList
     */
    public static <K,V> List<Map.Entry <K,V>> toConvert(Map<K,V> map){
        return new ArrayList<>(map.entrySet());
    }
}
