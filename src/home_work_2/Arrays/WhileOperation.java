package home_work_2.Arrays;

public class WhileOperation implements IArraysOperation {
    /**
     * метод выводит все элементы массива
     *
     * @param array массив элементы которого надо вывести
     * @return массив
     */

    @Override
    public int[] arrayAll(int[] array) {
        int i = 0;
        while (i < array.length) {
            i++;
        }
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
        int i = 1;
        int j = 0;
        int[] myArrayNew = new int[array.length / 2];
        while (i < array.length) {
            myArrayNew[j] = array[i];
            j++;
            i = i + 2;
        }
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
        while (i >= 0) {
            myArrayNew[j] = array[i];
            j++;
            i = i - 1;
        }
        return myArrayNew;
    }
}
