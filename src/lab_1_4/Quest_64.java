package lab_1_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * Created by shrralis on 3/24/16.
 */
public class Quest_64 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a, b;

        do {
            System.out.print("a = ");
            a = Integer.parseInt(reader.readLine());
            System.out.print("b = ");
            b = Integer.parseInt(reader.readLine());
        } while (a >= b);

        reader = null;

        Random random = new Random();
        System.out.println(random.nextInt(++b - a) + a);
    }
}
