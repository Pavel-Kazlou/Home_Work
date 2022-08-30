package home_work_2.Loops;

// 6

public class LoopsSix {
    public static void main(String[] args) {

        for (int j = 1; j <= 10; j++) {
            for (int i = 2; i <= 5; i++) {
                System.out.print(i + "x" + j + "=" + (i * j) + "\t");
            }
            System.out.println();
        }
        System.out.println("\t");

        for (int j = 1; j <= 10; j++) {
            for (int i = 6; i <= 9; i++) {
                System.out.print(+i + "x" + j + "=" + (i * j) + "\t");
            }
            System.out.println();
        }
    }
}
