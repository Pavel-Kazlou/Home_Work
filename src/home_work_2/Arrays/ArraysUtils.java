package home_work_2.Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArraysUtils {

    // 2.1.1
    public static int[] arrayFromConsole() {

        Scanner in = new Scanner(System.in);        // Объявляем Scanner
        System.out.print("Размер массива: ");
        int size = in.nextInt();                    // Читаем с клавиатуры размер массива и записываем в size
        int[] array = new int[size];                // Создаём массив int размером в size
        System.out.println("Элементы массива:");
        /*Пройдёмся по всему массиву, заполняя его*/
        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();                // Заполняем массив элементами, введёнными с клавиатуры
        }
        System.out.println();
        return array;
    }

    // 2.1.2
    public static int[] arrayRandom(int size, int maxValueExclusion) {

        Random rnd = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(maxValueExclusion);
        }
        return array;
    }
}