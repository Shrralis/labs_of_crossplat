package lab_1_2;

/**
 * Created by shrralis on 2/4/16.
 */
public class Quest_55 {

    public static void main(String[] args) {
        int masuv[][] = new int[3][3];
        int i, j, z = 0;
        for (i = 0; i < 3; i++)
            for (j = 0; j < 3; j++) {
                masuv[i][j] = z;
                z++;
            }
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++)
                System.out.print(masuv[i][j] + " ");
            System.out.println();
        }
    }
}
