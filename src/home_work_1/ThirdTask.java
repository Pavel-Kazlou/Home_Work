package home_work_1;

// 3.0

public class ThirdTask {
    public static void main(String[] args) {

        // Методы вычисляют модули чисел
        System.out.println(Math.abs(13));       // int 13
        System.out.println(Math.abs(48.4d));    // double 48.4
        System.out.println(Math.abs(-9823L));   // long 9823
        System.out.println(Math.abs(-4.961f));  // float 4.961

        // Методы возвращают sin, cos, tan, asin, acos, atan указанного в радианах double значения(для перевода в радианы использую метод static double toRadians(double angdeg)
        double a = 0;
        System.out.println(Math.sin(Math.toRadians(a))); // sin 0 = 0
        double b = 30;
        System.out.println(Math.cos(Math.toRadians(b))); // cos 18 = 0.8660
        double c = 45;
        System.out.println(Math.tan(Math.toRadians(c))); // tan 45 = 1
        double d = 60;
        System.out.println(Math.asin(Math.toRadians(d))); // NaN потому что абсолютное значение больше чем 1
        double e = 90;
        System.out.println(Math.acos(Math.toRadians(e))); // NaN потому что абсолютное значение больше чем 1
        double f = 60;
        System.out.println(Math.atan(Math.toRadians(f))); // atan 60 = результат компиляции не совпадает с реальным значением т.к. при перевод в радианы происходит с погрешностью

        // Метод pow - для возведения в степень(первое значение в скобках возводится во второе значение)
        System.out.println(Math.pow(3,4));      // 81
        System.out.println(Math.pow(7,2));      // 49
        System.out.println(Math.pow(14,3));     // 2744

        // Метод sqrt, cbrt - для извлечения квадратного и кубического корней
        System.out.println(Math.sqrt(144));     // 12
        System.out.println(Math.sqrt(64));      // 83
        System.out.println(Math.cbrt(125));     // 5.0
        System.out.println(Math.cbrt(1000));    // 10.0

        // Метод random Для генерации случайных чисел(генерируется double число из промежутка 0.0 - 1.0)
        for (int i = 0; i < 5; i++) {
            System.out.println(Math.random());
        }
        // Методы round(если >= 0.5 то в большую, иначе в меньшую), ceil(только в меньшую) и floor(только в большую) - для округления чисел
        System.out.println(Math.round(1.1));    // 1
        System.out.println(Math.round(1.8));    // 2
        System.out.println(Math.floor(1.1));    // 1.0
        System.out.println(Math.ceil(1.1));     // 2.0
    }
}
