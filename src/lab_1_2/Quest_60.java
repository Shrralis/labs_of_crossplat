package lab_1_2;

/**
 * Created by shrralis on 2/4/16.
 */
public class Quest_60 {

    public static void main(String[] args) {
        double a[][] = new double[5][5];
        final int OFFSET = 8, GROUP = 2;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                a[i][j] = (OFFSET * i + GROUP * j) / 2;
                System.out.printf(i < j ? "%.3f\t" : "\t\t", a[i][j]);
            }
            System.out.println();
        }
    }
}
