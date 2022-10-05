package home_work_6;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
    /**
     * метод вычитывает файл и помещает его в строку
     *
     * @param path путь к файлу который должен быть вычитан
     */
    public static String toRead(String path) {
        FileReader fr = null;
        StringBuilder sb = new StringBuilder();
        try {
            fr = new FileReader(path);
        } catch (FileNotFoundException e) {
            System.out.println("Вы выбрали файл которого не существует");
        }
        try {
            int ch;
            do {
                ch = fr.read();
                if (ch != -1) {
                    sb.append(Character.toChars(ch));
                }
            } while (ch != -1);
        } catch (IOException e) {
            System.out.println("Что то пошло не так");
        }
        return sb.toString();
    }
}
