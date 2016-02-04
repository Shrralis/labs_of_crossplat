package lab_1_2;

/**
 * Created by shrralis on 2/4/16.
 */
public class ForOperations_3 {

    public static void main(String[] args) {
        int[]  x = {1, 2, 3, 5, 7, 9, 12, 34, 56, 65, 153};
        int argument = Integer.parseInt(args[0]),
        keq = 0, kmor = 0, kles = 0;
        for (int i = 0; i < x.length; i++) {
            if (argument == x[i]) {
                System.out.println("x[" + i + "] = argument = " + argument);
                keq++;
            }
            if (argument > x[i]) {
                System.out.println("x[" + i + "] = " + x[i] + " < argument");
                kmor++;
            }
            if(argument < x[i]) {
                System.out.println("x[" + i + "] = " + x[i] + " > argument");
                kles++;
            }
        }
        System.out.println(keq + " - amounts of elements which equal argument.");
        System.out.println(kmor + " - amounts of elements which more argument.");
        System.out.println(kles + " - amounts of elements which less argument.");
        System.out.println(argument + " - argument.");
    }
}
