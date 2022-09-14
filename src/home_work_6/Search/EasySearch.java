package home_work_6.Search;

import home_work_6.Interface.ISearchEngine;

public class EasySearch implements ISearchEngine {
//Перенести суть IndexOfSearch в Easy and RegEx Search
    @Override
    public long search(String text, String word) {

        String[] arr = text.split("[\\s!,.:;) ?]+");
        long count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (word.equals(arr[i])) {
                count++;
            }
        }
        return count;
    }
}

