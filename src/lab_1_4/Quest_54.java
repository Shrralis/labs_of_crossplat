package lab_1_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by shrralis on 3/24/16.
 */
public class Quest_54 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("x = ");
        double x = Double.parseDouble(reader.readLine());

        double z = 0, b = 2.5;
        int a = 2, k = 3;
        if (x < a && x > -a)
            z = (Math.cos((1 / 2) * x) * Math.sin(a * x) + b * x * x * x) / (-1 * Math.cos(k * x) * Math.sin((1 / k) *
                    x) + b * b);
        else if (x == a)
            z = 2 * b * Math.pow(Math.sin(k * x), 3) + 2 * Math.exp(Math.tan(a * x));
        else if (x > a && x < 2 * x)
            z = Math.pow(a * x * x, 1 / 3) + Math.log(Math.abs(k * x));
        System.out.println("z = " + z);
    }
}
