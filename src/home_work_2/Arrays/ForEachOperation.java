package home_work_2.Arrays;

public class ForEachOperation implements IArraysOperation {
    /**
     * метод выводит все элементы массива
     *
     * @param array массив элементы которого надо вывести
     * @return массив
     */

    @Override
    public int[] arrayAll(int[] array) {
        for (int item : array) {
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
        int[] myArrayNew = new int[array.length / 2];
        int i = 1;
        int j = 0;
        for (int item : array) {
            if (i % 2 != 0) {
                myArrayNew[j] = array[i];
                j++;
            }
            i++;
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
        for (int item : array) {
            myArrayNew[j] = array[i];
            j++;
            i = i - 1;
        }
        return myArrayNew;
    }
}
