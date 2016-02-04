package lab_1_2;

/**
 * Created by shrralis on 2/4/16.
 */
public class Quest_53 {

    public static void main(String[] args) {
        int[] numbers = {23, 45, 12, 2, 1, 2, 45, 2, 3, 6, 34, 7};
        for (int each : numbers) {
            if (each == 3) break;
            if (each >= 10) continue;
            System.out.println(each);
        }
    }
}
