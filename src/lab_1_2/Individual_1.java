package lab_1_2;

/**
 * Created by shrralis on 2/5/16.
 *
 * Обчисліть f = 10! трьома різними способами (з використанням операторів циклу while/for/do-while)
 */
public class Individual_1 {

    public static void main(String[] args) {
        int f = 1;
        for (int i = 2; i < 11; i++) {
            f *= i;
        }
        System.out.println("f = " + f + " - for");

        f = 1;
        int k = 2;
        while (k <= 10) {
            f *= k++;
        }
        System.out.println("f = " + f + " - while");

        f = 1;
        k = 2;
        do {
            f *= k++;
        } while(k <= 10);
        System.out.println("f = " + f + " - do{}while");
    }
}
