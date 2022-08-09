package home_work_1;

import java.util.Scanner;

public class Task3 {
    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите числa: ");
        int a = in.nextInt();
        int b = in.nextInt();
        if (a%b==0) {
            System.out.println("Делятся");
        } else {
            System.out.println ("Не делятся");
        }

}
}