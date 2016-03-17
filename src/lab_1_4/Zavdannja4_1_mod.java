package lab_1_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by shrralis on 3/17/16.
 */
public class Zavdannja4_1_mod {

    public static void main(String[] args) throws IOException {
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введіть від 5 до 7 для завершення роботи...");
        do {
            c = (char) br.read();
            System.out.println(c);
        } while (c < '5' || c > '7');
    }
}
