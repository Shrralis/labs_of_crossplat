package lab_1_4.samost;

/**
 * Created by shrralis on 23.03.2016.
 */
public class ComputeZhyravov {

    static void compute(float a, float b, float x) {
        System.out.println("Розрахунки:");
        System.out.printf("y = %.3f\n", (b * Math.pow(Math.tan(x), 2) - a / Math.pow(Math.sin(x / a), 2)));
        System.out.printf("d = %.3f\n", (a * Math.exp(-1 * Math.sqrt(a)) * Math.cos(b * x / a)));
    }
}
