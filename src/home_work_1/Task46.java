package home_work_1;

import java.util.Scanner;

public class Task46 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите год: ");
        int x = in.nextInt();
        if (x % 4 == 0)
            System.out.println(+x + " год является високосным");
        else
            System.out.println(+x + " год является невисокосным");
    }
}
