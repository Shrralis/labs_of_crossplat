package lab_1_2;

/**
 * Created by shrralis on 2/5/16.
 *
 * Знайдіть суму всіх непарних чисел масиву цілих чисел.
 */
public class Individual_5 {

    public static void main(String[] args) {
        int a[][] = new int[8][8];
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = (int) (Math.cos(j) * (int) Math.exp(i + (j + 3) * 2) / ((j * 7 + i * 8 + (int) Math.acos(i *
                        j + 1) + 1) * 66)) / 80 + a.length - i * -1;
                a[i][j] = a[i][j] > 99 || a[i][j] < -99 ? a[i][j] / 100 : a[i][j];
                if (a[i][j] % 2 != 0) {
                    sum += a[i][j];
                }
                System.out.print(a[i][j] + "\t\t");
            }
            System.out.println();
        }
        System.out.println("Summary = " + sum);
    }
}
