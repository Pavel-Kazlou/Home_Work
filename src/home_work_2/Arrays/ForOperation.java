package home_work_2.Arrays;

public class ForOperation implements IArraysOperation {
    /**
     * метод выводит все элементы массива
     *
     * @param array массив элементы которого надо вывести
     * @return массив
     */

    @Override
    public int[] arrayAll(int[] array) {
        for (int i = 0; i < array.length; ) {
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
        int[] myArrayNew = new int[array.length / 2];
        int j = 0;
        for (int i = 1; i < array.length; i = i + 2) {
            myArrayNew[j] = array[i];
            j++;
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
        for (int i = array.length - 1; i >= 0; i--) {
            myArrayNew[j] = array[i];
            j++;
        }
        return myArrayNew;
    }
}
