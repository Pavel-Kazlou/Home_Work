package home_work_3;

public class WithoutCalculatorMain {
    public static void main(String[] args) {

//        4.1 + 15 * 7 + (28 / 5) ^ 2
//        4.1 + 105 + 5.6 ^ 2
//        109.1 + 31.36

        double a = 4.1;
        double b1 = 15;
        double b2 = 7;
        double c1 = 28;
        double c2 = 5;
        int d = 2;

        double result = a + (b1 * b2) + Math.pow((c1 / c2), d);
        System.out.println(result);                                            // 140.45999999999998
    }
}
