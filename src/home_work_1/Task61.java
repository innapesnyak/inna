package home_work_1;

import java.util.Scanner;
import java.util.Objects;
public class Task61 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = in.next();
        if (Objects.equals(name, "Вася")) {
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал");
        } else {
        if (Objects.equals(name, "Анастасия")) {
            System.out.println("Я тебя так долго ждал");
            } else {
                System.out.println("Добрый день, а вы кто?");
            }
        }
    }
}
