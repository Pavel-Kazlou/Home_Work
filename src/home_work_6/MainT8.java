package home_work_6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class MainT8 {
    public static void main(String[] args) throws IOException {

        ThreadCreator threadCreator = new ThreadCreator();

        do {
            HundredBooks hundredBooks = new HundredBooks();
            String pathInString = GetDirectoryPath.getPath();
            hundredBooks.listToConsole(pathInString);

            Path filePath = Path.of(MakeYourChoice.bookChoice(pathInString));
            String filePathToString = Files.readString(filePath);

            do {
                JustSearch js = new JustSearch();
                js.setText(filePathToString);
                threadCreator.execute(js);
                FileInfo.fileCreating(MakeYourChoice.getBookName(), JustSearch.getWord(), JustSearch.getCount());
            } while (!JustSearch.getWord().equals(JustSearch.exitSearch) && !JustSearch.getWord().equals(JustSearch.exitWord));
        } while (!JustSearch.getWord().equals(JustSearch.exitWord));
    }
}