package lab_1_1;

/**
 * Created by shrralis on 2/4/16.
 */
public class Arguments_1 {

    public static void main(String[] args) {
        System.out.println("Задано " + args.length + " аргуметнів");
        for (int i = 0; i < args.length; i++) {
            System.out.println("Значення " + i + "го аргумента " + args[i]);
        }
    }
}
