package lab_1_2;

/**
 * Created by shrralis on 2/5/16.
 *
 * Напишіть   програму,    що   сортує   масив   цілих   чисел   за зменшенням.
 */
public class Individual_3 {

    public static void main(String[] args) {
        int a[] = new int[]{1, 3, 2, 5, 7, 4, 6, 8};
        System.out.println("Original array:");
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + (i + 1) + "] = " + a[i]);
        }
        System.out.println("Sorted array:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < i; j++) {
                if(a[i] > a[j]) {
                    a[i] += a[j];
                    a[j] = a[i] - a[j];
                    a[i] -= a[j];
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + (i + 1) + "] = " + a[i]);
        }
    }

}
