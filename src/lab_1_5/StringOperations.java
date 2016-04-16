package lab_1_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by shrralis on 3/29/2016.
 */
public class StringOperations {

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
                case 3 :
                    point3(args);
                    break;
                case 4 :
                    point4_6(false);
                    break;
                case 5 :case 6 :
                    //5-6
                    point4_6(true);
                    break;
                case 7 :
                    point7();
                    break;
                case 8 :
                    point8();
                    break;
                case 9 :
                    point9();
                    break;
                case 10 :
                    point10();
                    break;
                case 11 :
                    point11();
                    break;
                case 12 :
                    point12();
                    break;
                case 13 :
                    point13();
                    break;
                default :
                    System.out.println("Такого пункту немає");
                    break;
            }
        } while (choose != 0);
    }

    private static void point3(String[] args) {
        System.out.println("Виконання пункту 3: \n\n");

        System.out.println("Hello".concat(" world"));
        System.out.println(concatArgs(args));
    }

    private static void point4_6(boolean keyboard) throws IOException {
        System.out.println("Виконання пункту " + (keyboard ? "4" : "5, 6") + ": \n\n");

        String a = "StringOperations";
        String b= new String("StringOperations");
        String c = a;
        String d = "stringoperations";

        if(keyboard) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Ваше прізвище: ");
            a = reader.readLine();
            System.out.print("Прізвище сусіда: ");
            b = reader.readLine();
            c = a.toUpperCase();
            d = b.toLowerCase();
            System.out.println("Ваше прізвище - " + a);
            System.out.println("Прізвище сусіда - " + b);
            System.out.println("Ваше прізвище (змінено регістр) - " + c);
            System.out.println("Прізвище сусіда (змінено регістр)- " + d);
        }

        System.out.println("a.equals(b) = " + a.equals(b));
        System.out.println("b.equals(a) = " + b.equals(a));
        System.out.println("a.equals(c) = " + a.equals(c));
        System.out.println("a.equals(d) = " + a.equals(d));
        System.out.println("a.equalsIgnoreCase(d) = " + a.equals(b));
    }

    private static void point7() throws IOException {
        System.out.println("Виконання пункту 7: \n\n");

        System.out.println(inputUntilStop());
    }

    private static void point8() {
        System.out.println("Виконання пункту 8: \n\n");

        String name = "MyName";
        System.out.println("Довжина рядка: " + name.length());
    }

    private static void point9() {
        System.out.println("Виконання пункту 9: \n\n");

        String string = "Hello World";
        String substring1 = "Hello";
        String substring2 = "Test";

        System.out.println(string.indexOf(substring1)); // виводить 0
        System.out.println(string.indexOf(substring2)); // виводить -1.
    }

    private static void point10() {
        System.out.println("Виконання пункту 10: \n\n");

        String string = "http://google.com";
        System.out.println("Починається з http:// " + string.startsWith("http://"));
        System.out.println("Починається з ftp:// " + string.startsWith("ftp://"));
        System.out.println("Закінчується з .com " + string.endsWith(".com"));
        System.out.println("Закінчується з .com.ua " + string.endsWith(".com.ua"));
    }

    private static void point11() {
        System.out.println("Виконання пункту 11: \n\n");

        String s = "Hello World";
        System.out.println(s.substring(3));
        System.out.println(s.substring(1, 5));
    }

    private static void point12() {
        System.out.println("Виконання пункту 12: \n\n");

        String s = "Це демонстрація getChars методу";
        int start = 16;
        int end = 25;
        char buf[] = new char[end - start];
        s.getChars(start, end, buf, 0);
        System.out.println(buf);
    }

    private static void point13() throws IOException {
        System.out.println("Виконання пункту 13: \n\n");

        System.out.print("Введіть текстове повідомлення: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int start = (s.length() - 1) / 2;
        int end = s.length() - 1;
        char buf[] = new char[end - start];
        s.getChars(start, end, buf, 0);
        System.out.println(buf);
    }

    private static String concatArgs(String[] args) {
        String result = new String();
        for (int i = 0; i < args.length; i++) {
            result += (args[i] + " ");
        }
        return result.trim();
    }

    private static String inputUntilStop() throws IOException {
        String result = new String(), line = new String();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (!(line = reader.readLine()).equals("Stop")) {
            result += line;
        }
        return result;
    }
}
