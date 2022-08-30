package home_work_2.Arrays;

import java.util.Arrays;

public class ArraysTasks {

    //2.4.1
    /**
     * Метод count подсчитывает количество четных положительных чисел
     *
     * @param array массив с числами для подсчета
     * @return количество четных положительных чисел
     */
    public static int count(int[] array) {
        int count = 0;
        for (int element : array) {
            if (element % 2 == 0 && element > -1) {
                count = count + 1;
            }
        }
        return count;
    }

    //2.4.2
    /**
     * Метод maxElement находит наибольший элемент в массиве
     *
     * @param array массив с числами для подсчета
     * @return возвращает наибольший элемент массива
     */
    public static int maxElement(int[] array) {
        int maxElement = array[0];
        for (int i = 0; i < array.length; i = i + 2) {
            int element = array[i];
            if (element > maxElement) {
                maxElement = element;
            }
        }
        return maxElement;
    }

    //2.4.3
    /**
     * метод arrayAvg рассчитывает среднее арифметическое из цифр массива
     *
     * @param array массив для выбора
     * @return возвращает среднее арифметическое
     */
    public static long arrayAvg(int[] array) {
        long elementCount = 0;
        for (int j : array) {
            elementCount = elementCount + j;
        }
        return elementCount / array.length;
    }

    /**
     * метод возвращает массив из чисел которые меньше среднего арифметического массива из аргумента
     *
     * @param avgElement среднее арифметическое
     * @param array      массив
     * @return массив с числами которые меньше среднего арифметического
     */
    public static int[] numbersLess(long avgElement, int[] array) {
        int[] arrayResult = new int[0];
        int j = 0;
        for (int k : array) {
            if (k < avgElement) {
                arrayResult = Arrays.copyOf(arrayResult, arrayResult.length + 1);
                arrayResult[j] = k;
                j++;
            }
        }
        return arrayResult;
    }

    //2.4.4.
    /**
     * метод twoNumbers возвращает два наименьших числа массива
     *
     * @param array массив для выборки
     * @return массив с наименьшими числами
     */
    public static int[] twoNumbers(int[] array) {
        int avgItem;
        int itemCount = 0;
        int[] myArrayNew = new int[2];
        for (int element : array) {
            itemCount = itemCount + element;
        }
        avgItem = itemCount / array.length;//нахожу среднее арифметическое для использования его  при сравнении
        int minElementFirst = avgItem;
        for (int element : array) {
            if (minElementFirst >= element) {
                minElementFirst = element;
            }
        }
        int minElementSecond = avgItem;
        int countFirstElement = 0;
        for (int j : array) {
            if (j < minElementSecond && j != minElementFirst) {
                minElementSecond = j;
                myArrayNew[0] = minElementSecond;
            } else if (j == minElementFirst) {
                countFirstElement = countFirstElement + 1;
                myArrayNew[1] = minElementFirst;
            }
        }

        if (countFirstElement > 1) {
            myArrayNew[0] = minElementFirst;
            myArrayNew[1] = minElementFirst;
        } else {
            myArrayNew[0] = minElementFirst;
            myArrayNew[1] = minElementSecond;
        }
        return myArrayNew;
    }

    //2.4.5
    /**
     * метод lessThenNumbers возвращает массив за исключением чисел из интервала
     *
     * @param array массив
     * @param begin нижняя граница диапазона для чисел
     * @param end   верхняя граница диапазона для чисел
     * @return возвращает массив за исключением чисел из интервала
     */
    public static int[] lessThenNumbers(int[] array, int begin, int end) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= begin && array[i] <= end) {
                count++;
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                array = Arrays.copyOf(array, array.length - 1);
                i--;
            }
        }
        return array;
    }

    //2.4.6.
    /**
     * метод sumElements суммирует все числа в массиве
     *
     * @param array массив
     * @return возвращает сумму чисел массива
     */
    public static int sumElements(int[] array) {
        int numberCount = 0;
        for (int arrElement : array) {
            numberCount = numberCount + arrElement;
        }
        return numberCount;
    }
}
