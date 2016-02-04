package lab_1_2;

import java.util.Calendar;

/**
 * Created by shrralis on 2/4/16.
 */
public class IfOperations_2 {

    public static void main(String[] args) {
        int a = 12, b = 42, c;
        c = 8 + (Calendar.getInstance().get(Calendar.MONTH) + 1);
        int maxSum = a + b;
        int minSum = a + b;
        maxSum = (maxSum >= (a + c) ? maxSum : a + c);
        minSum = (minSum <= (a + c) ? minSum : a + c);
        maxSum = (maxSum >= (b + c) ? maxSum : b + c);
        minSum = (minSum <= (b + c) ? minSum : b + c);
        System.out.println("Найбільша сума: " + maxSum);
        System.out.println("Середнє арифметичне найбільшої " +
                "та найменшої суми: " + (maxSum + minSum) / 2);
    }
}
