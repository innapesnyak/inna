package home_work_1;

import java.util.Scanner;
public class Task42 {
    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите числa: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if (a>b && a<c ) {
            System.out.println("Средним является " + a);
        } else if (a<b && a>c) {
            System.out.println("Средним является " + a);
        } else if (b>a && b<c) {
            System.out.println("Средним является " + b);
        } else if (b<a && b>c) {
            System.out.println("Средним является " + b);
        } else if (c>a && c<b) {
            System.out.println("Средним является " + c);
        } else if (c>b && c<a) {
            System.out.println("Средним является " + c);
        } else   {
            System.out.println ("Нет среднего числа");

        }
    }
}


