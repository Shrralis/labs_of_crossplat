package lab_1_2;

/**
 * Created by shrralis on 2/4/16.
 */
public class ForEachOperations_2 {

    public static void main(String[] args) {
        int m[] = new int[] {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096};
        for (int i = m.length - 1; i >= 0; i--) {
            System.out.print((i == m.length - 1 ? "" : ", ") + m[i]);
        }
    }
}
