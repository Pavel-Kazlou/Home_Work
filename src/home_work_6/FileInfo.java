package home_work_6;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileInfo {

    /**
     * метод создаёт файл в директории проекта и записывает в него результаты поиска
     *
     * bookName - название книги
     * word - искомое слово
     * number - колличество повторений
     */
    public static void fileCreating(String bookName, String word, Long number) {

        try {
            File file = new File("SearchingResults.txt");
            if (file.createNewFile()) {
                System.out.println("Файл создан");
            }
        } catch (Exception e) {
            System.err.println(e);
        }
        if (!word.equals("BECK") && !word.equals("EXIT")) {
            String newFile = "SearchingResults.txt";
            Path path = Paths.get(newFile);
            String writingIn = bookName + ": слово " + "<<" + word + ">>" + " повторяется: " + number + " раз(а)." + "\n";
            byte[] bs = writingIn.getBytes();
            try {
                Files.write(path, bs, StandardOpenOption.APPEND);
            } catch (IOException e) {
                System.out.println("Произошла ошибки при записи в файл");
            }
        } else {
            System.out.println("История поиска записана!");
        }
    }
}

