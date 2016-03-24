package lab_1_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * Created by shrralis on 3/24/16.
 */
public class Quest_63 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n;

        do {
            System.out.print("n = ");
            n = Integer.parseInt(reader.readLine());
        } while (n <= 0);

        Random random = new Random();
        System.out.println(random.nextInt(n * 2 + 1) - n);
    }
}
