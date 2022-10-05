package home_work_6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class MainT7 {
    public static void main(String[] args) throws IOException {

        do {
            HundredBooks hundredBooks = new HundredBooks();
            String pathInString = GetDirectoryPath.getPath();
            hundredBooks.listToConsole(pathInString);                           // выводим список книг в консоль

            Path filePath = Path.of(MakeYourChoice.bookChoice(pathInString));
            String filePathToString = Files.readString(filePath);               // вибираем книгу

            do {
                JustSearch.search(filePathToString);                            // производим поиск нужного слова с записью результата в файл
                FileInfo.fileCreating(MakeYourChoice.getBookName(), JustSearch.getWord(), JustSearch.getCount());
            } while (!JustSearch.getWord().equals(JustSearch.exitSearch) && !JustSearch.getWord().equals(JustSearch.exitWord));
        } while (!JustSearch.getWord().equals(JustSearch.exitWord));
    }
}