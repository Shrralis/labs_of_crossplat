package lab_1_2;

/**
 * Created by shrralis on 2/5/16.
 *
 * *Елементи  одновимірного масиву циклічно  змістити  на  дві позиції вліво.
 */
public class Individual_9 {

    public static void main(String[] args) {
        int a[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int temp;
        System.out.print("Original:\t");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
        System.out.print("\nOffset: \t");
        for (int i = 0; i < 2; i++) {
            temp = a[0];
            for (int j = 0; j < a.length - 1; j++) {
                a[j] = a[j + 1];
            }
            a[a.length - 1] = temp;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
    }
}
