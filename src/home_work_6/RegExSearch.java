package home_work_6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine {

    @Override
    public long search(String text, String word) {
        Matcher matcher = Pattern.compile("(?i).*?\\b" + Pattern.quote(word) + "\\b.*?").matcher(text);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }
}
//(?i).*?\\b%s\\b.*?