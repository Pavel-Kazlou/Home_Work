package home_work_4;

import java.util.Arrays;

public class DataContainerMain {
    public static void main(String[] args) {
        DataContainer<String> container = new DataContainer<>(new String[3]);

        System.out.println(Arrays.toString(container.getItems()));

        System.out.println();
        int index1 = container.add("Привет");
        int index2 = container.add("Как дела");
        int index3 = container.add("Работаю");
        int index4 = container.add("Давай потом");


        System.out.println(index1);
        System.out.println(index2);
        System.out.println(index3);
        System.out.println(index4);

        System.out.println(Arrays.toString(container.getItems()));
        System.out.println();

        String text1 = container.get(index1);
        String text2 = container.get(index2);
        String text3 = container.get(index3);
        String text4 = container.get(index4);


        System.out.println(text1);
        System.out.println(text2);
        System.out.println(text3);
        System.out.println(text4);

        System.out.println(Arrays.toString(container.getItems()));
        System.out.println();
        System.out.println(container);

        container.delete(2);
        System.out.println(Arrays.toString(container.getItems()));

        System.out.println(container.delete(text1));
        System.out.println(Arrays.toString(container.getItems()));

    }
}
