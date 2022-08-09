package home_work_1;

import java.util.Scanner;

public class Task41 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int x = in.nextInt();
        if (x%2==0)
        System.out.println ("Число " + x + " является чётным");
        else
            System.out.println ("Число " + x + " является нечётным");
    }
}
