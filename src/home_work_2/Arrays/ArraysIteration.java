package home_work_2.Arrays;

import java.util.Arrays;

public class ArraysIteration {
    public static void main(String[] args) {

        System.out.println("Вывод каждого элемента массива: " + printAll());
        System.out.println("Вывод каждого элемента массива: " + printWhileAll());
        System.out.println("Вывод каждого элемента массива: " + printForEachAll());
        System.out.println("Вывод каждого элемента массива: " + printDoWhileAll());


        System.out.println("Вывод каждого второго элемента массива "+arrayForEverySecond());
        System.out.println("Вывод каждого второго элемента массива "+arrayWhileEverySecond());
        System.out.println("Вывод каждого второго элемента массива "+arrayDoWhileEverySecond());
        System.out.println("Вывод каждого второго элемента массива "+arrayForEachEverySecond());

        System.out.println("Вывод элементов массива в обратном порядке "+arrayForRevert());
        System.out.println("Вывод элементов массива в обратном порядке "+arrayWhileRevert());
        System.out.println("Вывод элементов массива в обратном порядке "+arrayDoWhileRevert());
        System.out.println("Вывод элементов массива в обратном порядке "+arrayForEachRevert());
    }

    //2.1.1
    // метод  arrayForAll  выводит все элементы массива
    //@return возвращает элементы массива
    public static String printAll() {
        int[] arr = ArraysUtils.arrayFromConsole();
        for (int i = 0; i < arr.length; i++) {
        }
        String arrString = Arrays.toString(arr);
        return arrString;
    }

    // метод  arrayWhileAll  выводит все элементы массива
    //@return возвращает элементы массива
    public static String printWhileAll() {
        int[] arr = ArraysUtils.arrayFromConsole();
        int i = 0;
        while (i < arr.length) {
            i++;
        }
        String arrString = Arrays.toString(arr);
        return arrString;
    }

    // метод  arrayForEachAll  выводит все элементы массива
    //@return возвращает элементы массива
    public static String printForEachAll() {
        int[] arr = ArraysUtils.arrayFromConsole();
        for (int item : arr) {
        }
        String arrString = Arrays.toString(arr);
        return arrString;
    }

    // метод  arrayDoWhileAll  выводит все элементы массива
    //@return возвращает элементы массива
    public static String printDoWhileAll() {
        int[] arr = ArraysUtils.arrayFromConsole();
        int i = 0;
        do {
            i++;
        }
        while (i < arr.length);
        String arrString = Arrays.toString(arr);
        return arrString;
    }

    //2.1.2
    // метод  arrayForEverySecond возвращает каждый второй элемент массива
    //@return возвращает каждый второй элемент массива
    public static String arrayForEverySecond() {
        int[] myArray = ArraysUtils.arrayFromConsole();
        int[] myArrayNew = new int[myArray.length / 2];
        int j = 0;
        for (int i = 1; i < myArray.length; i = i + 2) {
            myArrayNew[j] = myArray[i];
            j++;
        }
        String arrString = Arrays.toString(myArrayNew);
        return arrString;
    }

    // метод  arrayWhileEverySecond возвращает каждый второй элемент массива
    //@return возвращает каждый второй элемент массива
    public static String arrayWhileEverySecond() {
        int[] myArray = ArraysUtils.arrayFromConsole();
        int i = 1;
        int j = 0;
        int[] myArrayNew = new int[myArray.length / 2];
        while (i < myArray.length) {
            myArrayNew[j] = myArray[i];
            j++;
            i = i + 2;
        }
        String arrString = Arrays.toString(myArrayNew);
        return arrString;
    }

    // метод  arrayDoWhileEverySecond возвращает каждый второй элемент массива
    //@return возвращает каждый второй элемент массива
    public static String arrayDoWhileEverySecond() {
        int[] myArray = ArraysUtils.arrayFromConsole();
        int[] myArrayNew = new int[myArray.length / 2];
        int j = 0;
        int i = 1;
        do {
            myArrayNew[j] = myArray[i];
            j++;
            i = i + 2;
        }
        while (i < myArray.length);
        String arrString = Arrays.toString(myArrayNew);
        return arrString;
    }

    // метод  arrayForEachEverySecond возвращает каждый второй элемент массива
    //@return возвращает каждый второй элемент массива
    public static String arrayForEachEverySecond() {
        int[] myArray = ArraysUtils.arrayFromConsole();
        int[] myArrayNew = new int[myArray.length / 2];
        int i = 1;
        int j = 0;
        for (int item : myArray) {
            if (i % 2 != 0) {
                myArrayNew[j] = myArray[i];
                j++;
            }
            i++;
        }
        String arrString = Arrays.toString(myArrayNew);
        return arrString;
    }

    //2.1.3
    // метод  arrayForRevert возвращает массив в обратном порядке
    //@return возвращаетмассив в обратном порядке
    public static String arrayForRevert() {
        int[] myArray = ArraysUtils.arrayFromConsole();
        int[] myArrayNew = new int[myArray.length];
        int j = 0;
        for (int i = myArray.length - 1; i >= 0; i--) {
            myArrayNew[j] = myArray[i];
            j++;
        }
        String arrString = Arrays.toString(myArrayNew);
        return arrString;
    }

    // метод  arrayWhileRevert возвращает массив в обратном порядке
    //@return возвращаетмассив в обратном порядке
    public static String arrayWhileRevert() {
        int[] myArray = ArraysUtils.arrayFromConsole();
        int[] myArrayNew = new int[myArray.length];
        int j = 0;
        int i = myArray.length - 1;
        while (i >= 0) {
            myArrayNew[j] = myArray[i];
            j++;
            i = i - 1;
        }
        String arrString = Arrays.toString(myArrayNew);
        return arrString;
    }

    // метод  arrayDoWhileRevert возвращает массив в обратном порядке
    //@return возвращаетмассив в обратном порядке
    public static String arrayDoWhileRevert() {
        int[] myArray = ArraysUtils.arrayFromConsole();
        int[] myArrayNew = new int[myArray.length];
        int j = 0;
        int i = myArray.length - 1;
        do {
            myArrayNew[j] = myArray[i];
            j++;
            i = i - 1;
        }
        while (i >= 0);
        String arrString = Arrays.toString(myArrayNew);
        return arrString;
    }

    // метод  arrayForEachRevert возвращает массив в обратном порядке
    //@return возвращаетмассив в обратном порядке
    public static String arrayForEachRevert() {
        int[] myArray = ArraysUtils.arrayFromConsole();
        int[] myArrayNew = new int[myArray.length];
        int j = 0;
        int i = myArray.length - 1;
        for (int item : myArray) {
            myArrayNew[j] = myArray[i];
            j++;
            i = i - 1;
        }
        String arrString = Arrays.toString(myArrayNew);
        return arrString;
    }
}

