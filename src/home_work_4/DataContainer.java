package home_work_4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.StringJoiner;

public class DataContainer<T> {
    private T[] data;

    public DataContainer(T[] data) {
        this.data = data;
    }


    //4
//метод добавляет данные в первую позицию (ячейку) после последней заполненной позиции (ячейки)
//@param item - значение добавляемое в массив
//@return индекс для которого было добавлено значение
    public int add(T item) {
        if (item != null) {
            for (int index = 0; index <= data.length - 1; index++) {
                if (data[index] == null) {
                    this.data[index] = item;
                    return index;
                }
            }
            data = Arrays.copyOf(data, data.length + 1);
            data[data.length - 1] = item;
            return data.length - 1;
        }
        return -1;
    }

    //5
//метод возвращает значение хранимое в массиве для указанного индекса
//@param index индекс массива
//@return значение для индекса
    public T get(int index) {
        if (index < data.length) {
            return data[index];
        } else {
            return null;
        }
    }

    //6
//метод возвращает значение поля data
//@return возвращает массив в data
    public T[] getItems() {
        return data;
    }

    //7
//метод удаляет значения для индекса полученного в аргументе
//@param index индекс
//@return возвращает true при успешном удалении элемента и false если индекс выходит за пределы массива
    public boolean delete(int index) {
        T[] newArray;
        if (index <= data.length - 1) {
            int i;
            newArray = Arrays.copyOf(data, data.length - (data.length - index));
            newArray = Arrays.copyOf(newArray, data.length - 1);
            for (i = index; i < data.length - 1; i++) {
                newArray[i] = data[i + 1];
            }
            data = newArray;
            return true;
        } else {
            return false;
        }
    }

    //8
//метод перебирает массив и удаляет первое из значений равное полученному в аргументе
//@param item значение для удаления из массива
//@return возвращает true при успешном удалении элемента и false если значение не найдено в массиве
    public boolean delete(T item) {
        if (item == null) {
            return false;
        } else {
            for (int i = 0; i < data.length; i++) {
                if (data[i] == item) {
                    delete(i);
                    return true;
                }
            }
        }
        return false;
    }

    //10
//метод переопределяет метод toString()
//@param item значение в ячейке
//@return выводить содержимое data без ячеек в которых хранится null
    @Override
    public String toString() {
        StringJoiner strValue = new StringJoiner(", ");
        for (T item : data) {
            if (item != null) {
                strValue.add(item.toString());
            }
        }
        return "data = " + strValue;
    }

    //9
//метод занимается сортировкой данных записанных в поле data используя реализацию сравнения из ПЕРЕДАННОГО объекта comparator.
//@param item значение в ячейке
//@return выводить содержимое data без ячеек в которых хранится null
//    public void sort(Comparator<? super T> cmp) {
//        boolean sort = false;
//
//        while (!sort) {
//            sort = true;
//            for (int i = 1; this.data.length; i++) {
//                if (cmp.compare(this.data[i - 1]; this.data[i]) > 0) {
//                    T temp = this.data[i];
//                    this.data[i] = this.data[i - 1];
//                    this.data[i - 1] = temp;
//                    sort = false;
//                }
//            }
//        }
//    }
}
