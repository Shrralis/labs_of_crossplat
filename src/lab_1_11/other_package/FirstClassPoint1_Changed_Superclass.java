package lab_1_11.other_package;

/**
 * Created by shrralis on 6/3/16.
 */
public class FirstClassPoint1_Changed_Superclass {
    public static final int START = 0;
    static int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, START};

    protected static void separatedMethod() {
        int i1 = array.length - 1;
        for (int i = START; i < i1; i++) {
            for (int j = START; j < i1; j++) {
                if (array[j] < array[j + 1]) {
                    array[j] += array[j + 1];
                    array[j + 1] = array[j] - array[j + 1];
                    array[j] -= array[j + 1];
                }
            }
        }

        for (int i = START; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
