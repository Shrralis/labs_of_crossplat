package lab_1_2;

/**
 * Created by shrralis on 2/5/16.
 *
 * Знайдіть найменший елемент в двовимірному масиві та номер рядка і стовпця, в якому він розташовані.
 */
public class Individual_4 {

    public static void main(String[] args) {
        int a[][] = new int[8][8];
        int min = Integer.MAX_VALUE, mini = a.length, minj = a[0].length;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = (int) (Math.cos(j) * (int) Math.exp(i + (j + 3) * 2) / ((j * 7 + i * 8 + (int) Math.acos(i *
                        j + 1) + 1) * 66)) / 80 + a.length - i * -1;
                a[i][j] = a[i][j] > 99 || a[i][j] < -99 ? a[i][j] / 100 : a[i][j];
                if (min > a[i][j]) {
                    min = a[i][j];
                    mini = i;
                    minj = j;
                }
                System.out.print(a[i][j] + "\t\t");
            }
            System.out.println();
        }
        System.out.println("Minimal element of array = " + min);
        System.out.println("Row: " + mini + "\nColumn: " + minj);
    }
}
