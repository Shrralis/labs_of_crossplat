package lab_1_4;

import java.util.Scanner;

/**
 * Created by shrralis on 3/17/16.
 */
public class Quest_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Створюємо об'єкт класу Scanner
        int i = 2;
        System.out.print("Введіть ціле число: ");
        if (sc.hasNextInt()) { // повертає істину якщо з потоку введення можна
            // зчитати ціле число
            i = sc.nextInt(); // Зчитує ціле число з потоку введення і
            // зберігаємо в змінну
            System.out.println(i * 2);
        } else {
            System.out.println("Ви ввели не ціле число");
        }
    }
}
