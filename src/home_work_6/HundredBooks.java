package home_work_6;

import java.io.File;

public class HundredBooks {
    /**
     * Метот выводит в консоль название всех файлов из указанной папки
     *
     * @param path сслылка на папку
     */
    public void listToConsole(String path) {
        try {
            File directoryPath = new File(path);                                 // Чтение из директории
            String[] bookToArray = directoryPath.list();                         // Список всех файлов в папке
            System.out.println("Список файлов:");
            for (int i = 0; i < bookToArray.length; i++) {
                System.out.println((i + 1) + ". " + bookToArray[i]);
            }
        } catch (Exception e) {
            System.out.println("Проверьте корректность ссылки");
        }

    }
}

