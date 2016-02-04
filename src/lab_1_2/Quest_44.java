package lab_1_2;

/**
 * Created by shrralis on 2/4/16.
 */
public class Quest_44 {

    static int a[] = new int[10];

    static void print_() {
        System.out.println("Масив \n");
        for (int i = 0; i < 10; i++) {
            System.out.println("a[" + i + "]" + a[i]);
        }
    }

    static void sum() {
        int sum = 0;
        for (int i = 0; i < 10; i++)
            sum += a[i];
        System.out.println("");
        System.out.println("Сума елементів одновимірного масиву " + sum);
    }

    public static void main(String args[]) {
        for (int i = 0; i < 10; i++)
            a[i] = (int) (Math.random() * 6);
        print_();
        sum();
    }
}
