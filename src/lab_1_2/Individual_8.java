package lab_1_2;

/**
 * Created by shrralis on 2/4/16.
 */
public class Individual_8 {

    public static void main(String[] args) {
        double a[][] = new double[][] {
                {1.2, 3, 5.55, 4.6, 8.7, 0.32, -5.3, 4.1, 8.5, 9},
                {14, -73.7, 65.3, -4.4, 8, 4.6, 0, 74.7, 68.5, 89.7},
                {21.5, 23, -25.33, 54.4, -88.532, 120.5, -50.2, -44, -88.8, 91.2},
                {124, -83.5, -51, 84.7, -81, -105.15, -135.5, 14, -89, 29.4},
                {1.2, 3, 5.55, 4.6, 8.7, 0.32, -5.3 ,4.1 ,8.5 ,9},
                {14, -73.7, 65.3, -4.4, 8, 4.6, 0, 74.7, 68.5, 89.7},
                {21.5, 23, -25.33, 54.4, -88.532, 120.5, -50.2, -44, -88.8, 91.2},
                {124, -83.5, -51, 84.7, -81, -105.15, -135.5, 14, -89, 29.4},
                {1.2, 3, 5.55, 4.6, 8.7, 0.32, -5.3 ,4.1 ,8.5 ,9},
                {14, -73.7, 65.3, -4.4, 8, 4.6, 0, 74.7, 68.5, 89.7}
        };
        double aMax[][] = new double[a.length][2];
        double result = 0;
        for (int i = 0; i < a.length; i++) {
            aMax[i][0] = Double.MIN_VALUE;
            aMax[i][1] = 0;
            for (int j = 0; j < a[0].length; j++) {
                aMax[i][0] = aMax[i][0] < a[i][j] ? a[i][j] : aMax[i][0];
            }
            for (int j = 0; j < a[0].length; j++) {
                aMax[i][1] += aMax[i][0] - a[i][j];
            }
            result += aMax[i][1];
        }
        System.out.println("Result equals " + result);
    }
}
