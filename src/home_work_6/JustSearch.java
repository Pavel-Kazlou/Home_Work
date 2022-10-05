package home_work_6;

import java.util.Scanner;
import java.util.concurrent.Callable;

public class JustSearch implements Callable<Long> {

    private static String word;
    private static long count;
    public static String exitSearch = "BECK";
    public static String exitWord = "EXIT";
    private String text;

    public static String getWord() {
        return word;
    }
    public static long getCount() {
        return count;
    }
    public void setText(String text) {
        this.text = text;
    }

    /**
     * метод позволяет ввести слово через консоль и посчитать колличество его упоминаний в тексте
     *
     * @return колличество упоминаний найденого слова в тексте
     */
    public static long search(String text) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Какое слово нужно найти и посчитать?(Введите 'BECK' - для возврата, 'EXIT' - для выхода)");
        word = sc.nextLine();

        String[] arr = text.split("[\\s!,.:;) ?]+");
        count = 0;
        if (word.equals("BECK")) {
            System.out.println("Возврат к директории");
        } else if (word.equals("EXIT")) {
            System.out.println("Выход из программы");
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (word.equals(arr[i])) {
                    count++;
                }
            }
            System.out.println("Ваше слово упомянуто: " + count + " раз(а)");
        }
        return count;
    }

    @Override
    public Long call() throws Exception {
        return this.search(text);
    }
}