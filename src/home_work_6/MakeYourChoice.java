package home_work_6;

import java.io.File;
import java.util.Scanner;

public class MakeYourChoice {
    private static String bookName;

    public static String getBookName() {
        return bookName;
    }

    /**
     * метод позволяет ввести название книги через консоль
     *
     * @return ссылка на книгу в виде строки
     */
    public static String bookChoice(String directoryPath) {
        File bookExist;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Укажите название книги: ");
            bookName = sc.nextLine();
            String bookPath = directoryPath + "/" + bookName;

            bookExist = new File(bookPath);
            if (bookExist.exists()) {
                return bookPath;
            } else {
                System.out.println("Книга не найдена, попробуйте ещё раз");
            }
        } while (!bookExist.exists());
        return null;
    }
}