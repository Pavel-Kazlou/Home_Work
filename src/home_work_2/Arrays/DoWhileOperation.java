package home_work_2.Arrays;

public class DoWhileOperation implements IArraysOperation {

    /**
     * метод выводит все элементы массива
     *
     * @param array массив элементы которого надо вывести
     * @return массив
     */

    @Override
    public int[] arrayAll(int[] array) {
        int i = 0;
        do {
            i++;
        }
        while (i < array.length);
        return array;
    }

    /**
     * метод выводит каждый второй элемент массива
     *
     * @param array массив элементы которого надо вывести
     * @return массив
     */
    @Override
    public int[] arrayEverySecond(int[] array) {
        int[] myArrayNew = new int[array.length / 2];
        int j = 0;
        int i = 1;
        do {
            myArrayNew[j] = array[i];
            j++;
            i = i + 2;
        }
        while (i < array.length);
        return myArrayNew;
    }

    /**
     * метод возвращает массив в обратном порядке
     *
     * @param array массив элементы которого надо вывести
     * @return массив
     */
    @Override
    public int[] arrayRevert(int[] array) {
        int[] myArrayNew = new int[array.length];
        int j = 0;
        int i = array.length - 1;
        do {
            myArrayNew[j] = array[i];
            j++;
            i = i - 1;
        }
        while (i >= 0);
        return myArrayNew;
    }
}