package lab_1_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by shrralis on 3/24/16.
 */
public class Quest_60 {

    public static void main(String[] args) throws IOException {
        double a, b, c;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("a = ");
        a = Double.parseDouble(reader.readLine());
        System.out.print("b = ");
        b = Double.parseDouble(reader.readLine());
        c = Math.sqrt(a * a + b * b);
        System.out.println("Площа = " + ((a * b) / 2));
        System.out.println("Периметр = " + (a + b + c));
    }
}
