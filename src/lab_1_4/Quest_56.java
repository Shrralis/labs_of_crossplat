package lab_1_4;

/**
 * Created by shrralis on 3/24/16.
 */
public class Quest_56 {

    public static void main(String[] args) {
        int k = 0;
        double result = 0.0, y;

        for (int x = 10; x < 30; x += 2.5) {
            y = 5 * Math.pow(Math.sin(3 * x), 2) + 4 * Math.pow(Math.cos(2 * x), 3) - 2 * Math.exp(Math.tan(2 * x));
            if (y < 0) {
                result += y;
                k++;
            }
        }

        result /= k;

        System.out.println("Result = " + result);
    }
}
