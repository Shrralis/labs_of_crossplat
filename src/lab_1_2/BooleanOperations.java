package lab_1_2;

/**
 * Created by shrralis on 2/4/16.
 */
public class BooleanOperations {

    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        System.out.println("a=" + a + ", b = " + b); // виведемо початкове
        // значення змінних
        a = b;
        System.out.println("a=" + a); // виведемо змінене значення змінної а
        a = (2 > 1 && b == false); // присвоєння результату логічного виразу
        System.out.println("a=" + a);
        System.out.println(3 > 2);
        System.out.println(3 == 2);
    }
}
