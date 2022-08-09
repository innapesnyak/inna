package home_work_1;

import java.util.Scanner;
public class Task44 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        double x = in.nextDouble();
        System.out.print("Выберите перевод в Кб (1) или в Байты (2): ");
        int n = in.nextInt();
        switch (n) {
            case 1:
                System.out.println("Перевод в килобайты составил: " + (x * 1024));
                break;
            case 2:
                System.out.println("Перевод в байты составил: " + (x / 1024));
                break;
            default:
                System.out.println();
        }
    }
}
