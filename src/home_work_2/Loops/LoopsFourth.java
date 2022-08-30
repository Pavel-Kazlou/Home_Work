package home_work_2.Loops;

// 1.4

public class LoopsFourth {

    private long a = Long.MAX_VALUE;
    private long b = Long.MIN_VALUE;

    public long multi(long num1, long num2) {
        do {
            num1 = num1 * num2;
        } while (num1 > 0);
        System.out.println(num1);
        return num1 ;
    }

}
//450 283 905 890 997 363