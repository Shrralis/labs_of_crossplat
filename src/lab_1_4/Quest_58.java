package lab_1_4;

/**
 * Created by shrralis on 3/24/16.
 */
public class Quest_58 {

    public static void main(String[] args) {
        int amount = 0;
        double summary = 0.0, y;
    
        for (int x = 2; x < 40; x += 4) {
            y = Math.exp(Math.cos(3 * x)) - Math.log(Math.abs(Math.cos(2 * x))) + 4 * Math.pow(Math.sin(3*x*x), 2);
            if (y >= -2 && y <= 2) {
                amount++;
                summary += y;
            }
        }

        System.out.println("Кількість = " + amount);
        System.out.println("Сума = " + summary);
    }
}
