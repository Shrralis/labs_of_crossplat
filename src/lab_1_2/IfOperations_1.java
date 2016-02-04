package lab_1_2;

/**
 * Created by shrralis on 2/4/16.
 */
public class IfOperations_1 {

    public static void main(String[] args) {
        int a = 10, b = 12, c = 34;
        System.out.println("Найбільше: " +
                (a >= b && a >= c? a : b >= a && b >= c ? b : c));
        System.out.println("Найменше: " +
                (a <= b && a <= c? a : b <= a && b <= c ? b : c));
        System.out.println("Сума:" + (a + b + c));

    }
}
