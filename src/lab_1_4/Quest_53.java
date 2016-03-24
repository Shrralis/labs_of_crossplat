package lab_1_4;

/**
 * Created by shrralis on 3/24/16.
 */
public class Quest_53 {

    public static void main(String[] args) {
        double m = 0.7, c = 2.1, x = 1.7;
        System.out.println("z = " + (Math.sin(x) / Math.sqrt(1 + m * m * Math.pow(Math.sin(x), 2)) - c * m *
                (Math.log10(x) / Math.log10(3))));
    }
}
