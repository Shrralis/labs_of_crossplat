package lab_1_2;

/**
 * Created by shrralis on 2/4/16.
 */
public class ForEachOperations {

    public static void main(String[] args) {
        String[] strings = {"College", "of", "Electronic", "Equipments", "Computer", "Science"};
        for (String each : strings) {
            System.out.println(each);
        }
        int[] numbers = {23, 45, 12, 2, 1,2, 45, 2, 3,6, 34, 7};
        for (int each : numbers) {
            if (each >= 10 || each % 2 != 0) continue;
            System.out.println(each);
        }
    }
}
