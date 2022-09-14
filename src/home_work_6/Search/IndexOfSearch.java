package home_work_6.Search;

import home_work_6.Interface.ISearchEngine;

public class IndexOfSearch implements ISearchEngine {
    public long search(String text, String word) {
        int count = 0;
        int index = text.indexOf(word);
        while (index != -1) {
            if (index == 0 && word.length() == 1) {
                count++;
            } else if (index == 0 && word.length() > 0) {
                boolean b2 = Character.isLetter(text.charAt(index + word.length()));
                if (!b2) {
                    count++;
                }
            } else if (index == text.indexOf(text.length() - 1)) {
                count++;
            } else if (index + word.length() - 1 == text.length() - 1) {
                count++;
            } else {
                boolean b1 = Character.isLetter(text.charAt(index - 1));
                boolean b2 = Character.isLetter(text.charAt(index + word.length()));
                if (!b1 && !b2) {
                    count++;
                }
            }
            text = text.substring(index + 1);
            index = text.indexOf(word);
        }
        return count;
    }
}

