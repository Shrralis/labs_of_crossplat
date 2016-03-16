package lab_1_2;

/**
 * Created by shrralis on 2/4/16.
 */
public class IfOperations_4 {

    public static void main(String[] args) {
        int a = 21, b = 12;
        System.out.println(args[0].equals("max") ? a :
                args[0].equals("min") ? b :
                        a - b > 0 ? "Аргумент не рівний “max” і не рівний “min”, " +
                                "а різниця чисел a та b більша 0" : "");
    }
}
