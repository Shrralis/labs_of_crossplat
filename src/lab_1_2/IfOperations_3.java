package lab_1_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by shrralis on 2/4/16.
 */
public class IfOperations_3 {

    public static void main(String[] args) throws IOException {
        int a, b;
        a = args[0].length();
        b = args[1].length();
        System.out.println(Math.abs(a) > Math.abs(b) ? args[0] + "(" + a + ")" : args[1] + "(" + b + ")");
        System.out.println(a == b ? "Аргументи рівні" : "Аргументи не рівні");
    }
}
