package lab_1_5;

import java.io.*;

/**
 * Created by shrralis on 4/1/2016.
 */
public class Bylbashka {

    static String masuv_rjadkiv[] = { "Ukraine", "Second", "ALBA", "one", "Poland",
            "KEP" };
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int choose;
        do {
            System.out.print("Введіть пункт, який хочете виконати (0 - вихід): ");
            choose = Integer.parseInt(reader.readLine());
            if (choose == 0) break;
            switch (choose) {
                case 0 :
                    System.out.println("Вихід...");
                    break;
                case 14 :
                    point14();
                    break;
                case 15 :
                    point15();
                    break;
                case 16 :
                    point16();
                    break;
                case 17 :
                    point17();
                    break;
                case 18 :
                    point18();
                    break;
                case 19 :
                    System.out.println("Виконання пункту 19:\n\n");

                    System.out.print("Введіть рядок: ");
                    System.out.println("Результат: " + point19(reader.readLine()));
                    break;
                case 20 :
                    System.out.println("Результат: " + point20());
                    break;
                default :
                    System.out.println("Такого пункту немає");
                    break;
            }
        } while (choose != 0);
    }

    private static void point14() {
        System.out.println("Виконання пункту 14:\n\n");

        for (int j = 0; j < masuv_rjadkiv.length; j++) {
            for (int i = j + 1; i < masuv_rjadkiv.length; i++) {
                if (masuv_rjadkiv[i].compareToIgnoreCase(masuv_rjadkiv[j]) < 0) {
                    String new_masuv = masuv_rjadkiv[j];
                    masuv_rjadkiv[j] = masuv_rjadkiv[i];
                    masuv_rjadkiv[i] = new_masuv;
                }
            }
            System.out.println(masuv_rjadkiv[j]);
        }
    }

    private static void point15() {
        System.out.println("Виконання пункту 15:\n\n");

        for (int j = 0; j < masuv_rjadkiv.length; j++) {
            for (int i = j + 1; i < masuv_rjadkiv.length; i++) {
                if (masuv_rjadkiv[i].compareToIgnoreCase(masuv_rjadkiv[j]) > 0) {
                    String new_masuv = masuv_rjadkiv[j];
                    masuv_rjadkiv[j] = masuv_rjadkiv[i];
                    masuv_rjadkiv[i] = new_masuv;
                }
            }
            System.out.println(masuv_rjadkiv[j]);
        }
    }

    private static void point16() throws IOException {
        System.out.println("Виконання пункту 16:\n\n");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Ваше прізвище: ");
        String lName = reader.readLine();
        System.out.println("У верхньому регістрі: " + lName.toUpperCase());
        System.out.println("У нижньому регістрі: " + lName.toLowerCase());
    }

    private static void point17() {
        System.out.println("Виконання пункту 17:\n\n");

        String isbn = "978-3-16-148410-0";
        String[] isbnParts = isbn.split("-");

        System.out.println("префікс EAN.UCC: " + isbnParts[0]);
        System.out.println("номер регістраційної групи: " + isbnParts[1]);
        System.out.println("номер регістранту: " + isbnParts[2]);
        System.out.println("номер видання: " + isbnParts[3]);
        System.out.println("контрольна цифра: " + isbnParts[4]);
    }

    private static void point18() {
        System.out.println("Виконання пункту 18:\n\n");

        String s = "www.mysite.com";
        boolean isContain1 = s.contains("mysite");
        System.out.println(isContain1);// знайдено - повертає true

        boolean isContain2 = s.contains("mysite.ua");
        System.out.println(isContain2);// не знайдено - повертає false
    }

    private static boolean point19(String s) {
        return s.endsWith("ed");
    }

    private static boolean point20() throws IOException {
        System.out.println("Виконання пункту 20:\n\n");

        FileReader fileReader = new FileReader("src/lab_1_5/point20.rrs");
        BufferedReader reader = new BufferedReader(fileReader);
        String s = reader.readLine();
        return s.endsWith("ed");
    }
}
