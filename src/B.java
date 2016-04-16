import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by shrralis on 4/16/2016.
 */
public class B {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine().trim();
        String[] s = str.split(" ");
        int d1 = Integer.parseInt(s[0]);
        int d2 = Integer.parseInt(s[1]);
        int d3 = Integer.parseInt(s[2]);
        int way1 = d1 + d2 + d3;
        int way2 = d1 * 2 + d2 * 2;
        System.out.println(way1 >= way2 ? way2 : way1);
    }
}
