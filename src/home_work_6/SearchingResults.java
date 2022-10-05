package home_work_6;

import java.io.File;
import java.io.IOException;

public class SearchingResults {

    /**
     * метод создает файл в директории
     *
     * @throws IOException
     */
    public static void writeResults() throws IOException {
        File file = new File("История Поиска", "result.txt");
        file.createNewFile();
    }
}