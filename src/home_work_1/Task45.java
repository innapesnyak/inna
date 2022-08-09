package home_work_1;

import java.util.Scanner;

public class Task45 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Введите букву или символ: ");
        char x = reader.next().charAt(0);
        if (x >= 'A' && x <= 'Z') {
            System.out.println("This is letter " + x);
        } else if (x >= 'a' && x <= 'z') {
            System.out.println("This is letter " + x);
        } else if (x >= 'А' && x <= 'Я') {
            System.out.println("Это буква " + x);
        } else if (x >= 'а' && x <= 'я') {
            System.out.println("Это буква " + x);
        } else {
            System.out.println("Это символ " + x);
        }
    }
}
