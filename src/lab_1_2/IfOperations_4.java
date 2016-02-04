package lab_1_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by shrralis on 2/4/16.
 */
public class IfOperations_4 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        int a = 21, b = 12;
        String s;
        System.out.print("Enter s: ");
        s = reader.readLine();
        System.out.println(s.equals("max") ? a :
                s.equals("min") ? b :
                        a - b > 0 ? "Аргумент не рівний “max” і не рівний “min”, " +
                                "а різниця чисел a та b більша 0" : "");
    }
}
