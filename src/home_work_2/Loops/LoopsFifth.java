package home_work_2.Loops;

import java.util.Random;
import java.util.Scanner;

public class LoopsFifth {

    //1.5.1
    public int maxOne(int number) {
        int result = 0;
        if (number >= 1) {
            while (number >= 1) {
                if (number % 10 > result)
                    result = number % 10;
                number = number / 10;
            }
        } else {
            return 0;
        }
        return result;
    }

    //1.5.2
    public static void loopsTwo() {
        Random random = new Random();
        int minValue = 0;
        int value = random.nextInt(1000 + minValue) + minValue;
        if (value % 2 == 0) {
            minValue += 1;
        }
        System.out.println((value / 1000) * 100);
    }

    //1.5.3
    public String evenOdd(int number) {

        int even = 0;
        int odd = 0;

        for (int i = 1; number / i > 0; i = i * 10) {
            if ((number / i) % 2 == 0)
                even++;
            else
                odd++;
        }
        return even + "; " + odd;
    }

    //1.5.4
    public static int[] feb(int count) {

        int n0 = 0;
        int n1 = 1;
        int n2 = 0;
        int[] arr = new int[count];
        for (int i = 0; i < arr.length; i++) {
            n2 = n0 + n1;
            n0 = n1;
            n1 = n2;
            arr[i] = n1;
        }
        return arr;
    }

    //1.5.5
    public static int[] step(int min, int max, int step) {

        int result = min;
        int i;
        for (i = 0; result <= max; i++) {
            result = result + step;
        }
        result = min;
        int[] arr = new int[i];
        for (int j = 0; j < i; j++) {
            arr[j] = result;
            result = result + step;
        }
        return arr;
    }

    //1.5.6
    public int revers(int number) {

        int result = 0;
        while (number != 0) {
            result = result * 10 + number % 10;
            number = number / 10;
        }
        return result;
    }
}


