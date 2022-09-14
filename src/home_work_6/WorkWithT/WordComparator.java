package home_work_6.WorkWithT;

import java.util.Map.Entry;
import java.util.Comparator;
import java.util.Map;

public class WordComparator implements Comparator<Map.Entry<String, Integer>> {

    @Override
    public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
        return o2.getValue().compareTo(o1.getValue());
    }
}
