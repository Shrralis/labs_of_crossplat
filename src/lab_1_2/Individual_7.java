package lab_1_2;

/**
 * Created by shrralis on 2/5/16.
 *
 * *Знайдіть індекс елемента, що має найменше відхилення від найбільшого елемента двовимірного масиву.
 */
public class Individual_7 {

    public static void main(String[] args) {
        int a[][] = new int[8][8];
        int min = 0, max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = (int) (Math.cos(j) * (int) Math.exp(i + (j + 3) * 2) / ((j * 7 + i * 8 + (int) Math.acos(i *
                        j + 1) + 1) * 66)) / 80 + a.length - i * -1;
                a[i][j] = a[i][j] > 99 || a[i][j] < -99 ? a[i][j] / 100 : a[i][j];
                if (max < a[i][j]) {
                    max = a[i][j];
                }
                System.out.print(a[i][j] + "\t\t");
            }
            System.out.println();
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                min = (max - min > max - a[i][j] && max - a[i][j] != 0) ? a[i][j] : min;
            }
        }
        System.out.println("Maximal element of array = " + max);
        System.out.println("Your number = " + min);
    }
}
