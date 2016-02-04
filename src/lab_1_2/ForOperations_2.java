package lab_1_2;

/**
 * Created by shrralis on 2/4/16.
 */
public class ForOperations_2 {

    public static void main(String[] args) {
        int[]  x = {1, 2, 3, 5, 7, 9, 12, 34, 56, 65, 153};
        for (int i = 0; i < x.length; i += 2) {
            System.out.println("x[" + i + "]=" + x[i]);
        }
    }
}
