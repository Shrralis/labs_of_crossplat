package lab_1_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by shrralis on 3/17/16.
 */
public class Zavdannja4_2_mod {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введіть будь-яке ціле число: ");
        int number = Integer.parseInt(reader.readLine());
        System.out.println(number + "  у двійковій системі "
                + Integer.toBinaryString(number));
        System.out.println(number + "  у вісімковій системі "
                + Integer.toOctalString(number));
        System.out.println(number + "  у шістнадцятковій системі "
                + Integer.toHexString(number));
    }
}
