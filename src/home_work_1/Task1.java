package home_work_1;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(); //54 в двоичной системе 110_110
        int b = scanner.nextInt();//35 в двоичной системе 100_011
        scanner.close();
        int result1 = a & b; //результат & в двоичной системе  100010 = 34
        int result2 = a | b; ////результат | в двоичной системе 110111 = 55
        System.out.println(result1);
        System.out.println(result2);

        //Дополнительный программный перевод в двоичную систему счисления (результат из консоли) для проверки ручного расчета
        String result1ToBinary = Integer.toBinaryString(result1); //1
        String result2ToBinary = Integer.toBinaryString(result2); //101111
        System.out.println(result1ToBinary);
        System.out.println(result2ToBinary);

        //Попытка сделать побитовую операцию с числом 42.5

        double fractionalNumber = 42.5;
        //double result3 = fractionalNumber & firstNumber; //Error: Operator '&' cannot be applied to 'double'
        //Побитовые операции в Java проводятся только над целочисленными типами, поэтому данный код не скомпилируется,
        //будет выведена ошибка "bad operand types for binary operator '&'"


    }
}