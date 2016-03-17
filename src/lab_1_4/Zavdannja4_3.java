package lab_1_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by shrralis on 3/17/16.
 */
public class Zavdannja4_3 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int i;
        int suma = 0;
        System.out.println("Введіть довільні числа від 0 до quit...");
        do {
            str = br.readLine();
            try {
                i = Integer.parseInt(str);
            } catch (NumberFormatException e) {
                System.out.println("Невірний формат");
                i = 0;
            }
            suma += i;
            System.out.println("Поточна сума рівна: " + suma);
        } while (i != 0);
    }
}
