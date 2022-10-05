package home_work_6;

import java.io.File;
import java.util.Scanner;

public class GetDirectoryPath {


    /**
     * метод для ввода ссылки на директорию с файлами
     *
     * @return ссылку на директорию в виде строки
     */
    public static String getPath() {
        File check;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите адрес папки для считывания:");
            String path = sc.nextLine();

            check = new File(path);
            if (check.isDirectory()) {
                return path;
            } else {
                System.out.println("Не верный адрес, попробуйте ещё раз");
            }
        } while (!check.isDirectory());
        return null;
    }
}
