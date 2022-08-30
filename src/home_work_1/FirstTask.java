package home_work_1;

//1.2

import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a first number: ");
        int num = in.nextInt();
        System.out.print("Input a second number: ");
        int num2 = in.nextInt();

        System.out.printf("Your number: %d \n", num & num2);
        System.out.printf("Your number: %d \n", num | num2);
        in.close();
    }
}
//1.3
// 41 - 0010 1001
// 73 - 0100 1001
// 0010 1001 & 0100 1001 = 0000 1001(9)
// 0010 1001 | 0100 1001 = 0110 1001(105)
//1.4
// побитовые операторы применимы к целочисленным типам long, int, short, char, byte - НО ПРОЮУЮ!!!
// для работы с числами с плавающей точкой использую тип float
// для ввода чисел с плавающей точкой использую спецификатор %f
// использую метод nextFloat() для считывания введённого числа float
// Ввод в кансоль точки разеляющей целую часть от десятичной в моём случае недопустимо - использую запятую

// В ручную кое что получается:
// 42,5 - 0101010.1
// 74,5 - 1001010.1
// 0101010.1 & 1001010.1 = 0001010.1(10.5)
// 0101010.1 | 1001010.1 = 1101010.1(106.5)

// Через компилятор нет:
// Scanner in = new Scanner(System.in);
// System.out.print("Input a first number: ");
// float num = in.nextFloat();
// System.out.print("Input a second number: ");
// float num2 = in.nextFloat();

// System.out.printf("Your number: %f \n", num & num2);
// Operator '&' cannot be applied to 'float' После компиляции - java: bad operand types for binary operator '&'
// System.out.printf("Your number: %f \n", num | num2);
// Operator '|' cannot be applied to 'float' После компиляции - java: bad operand types for binary operator '|'
// in.close();





