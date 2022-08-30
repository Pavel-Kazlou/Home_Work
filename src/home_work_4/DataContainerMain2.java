package home_work_4;

import java.util.Arrays;

public class DataContainerMain2 {
    public static void main(String[] args) {
        DataContainer<Integer> container = new DataContainer<>(new Integer[3]);

        System.out.println(Arrays.toString(container.getItems()));

        System.out.println();
        int index1 = container.add(1);
        int index2 = container.add(2);
        int index3 = container.add(3);
        int index4 = container.add(777);


        System.out.println(index1);
        System.out.println(index2);
        System.out.println(index3);
        System.out.println(index4);

        System.out.println(Arrays.toString(container.getItems()));
        System.out.println();

        String text1 = String.valueOf(container.get(index1));
        String text2 = String.valueOf(container.get(index2));
        String text3 = String.valueOf(container.get(index3));
        String text4 = String.valueOf(container.get(index4));


        System.out.println(text1);
        System.out.println(text2);
        System.out.println(text3);
        System.out.println(text4);

        System.out.println(Arrays.toString(container.getItems()));
        System.out.println();
        System.out.println(container);

        container.delete(2);
        System.out.println(Arrays.toString(container.getItems()));

        System.out.println(container.delete(3));
        System.out.println(Arrays.toString(container.getItems()));

    }
}
