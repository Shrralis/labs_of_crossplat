package lab_1_4;

/**
 * Created by shrralis on 3/24/16.
 */
public class Quest_57 {

    public static void main(String[] args) {
        int kv = 0, kd = 0;
    
        for (int x = 5; x < 30; x += 2.5) {
            if (2 * Math.abs(Math.cos(2 * x)) + Math.pow(Math.cos(2 * x), 2) - Math.exp(2.5 * Math.sin(2 * x)) > 0)
                kd++;
            else kv++;
        }

        System.out.println((kd > kv ? "Додатніх" : "Від’ємних") + " більше");
    }
}
