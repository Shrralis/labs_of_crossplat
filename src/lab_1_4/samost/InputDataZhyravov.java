package lab_1_4.samost;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by shrralis on 23.03.2016.
 */
public class InputDataZhyravov {

    static float[] inputData() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        float result[] = new float[3];
        System.out.println("Введення даних:");
        System.out.print("a = ");
        result[0] = Float.parseFloat(reader.readLine());
        System.out.print("b = ");
        result[1] = Float.parseFloat(reader.readLine());
        System.out.print("x = ");
        result[2] = Float.parseFloat(reader.readLine());
        return result;
    }
}
