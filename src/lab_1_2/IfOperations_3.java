package lab_1_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by shrralis on 2/4/16.
 */
public class IfOperations_3 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        int a, b;
        System.out.print("Enter a: ");
        a = Integer.parseInt(reader.readLine());
        System.out.print("Enter b: ");
        b = Integer.parseInt(reader.readLine());
        System.out.println(Math.abs(a) > Math.abs(b) ? a : b);
        System.out.println(a == b ? "Аргументи рівні" : "Аргументи не рівні");
    }
}
