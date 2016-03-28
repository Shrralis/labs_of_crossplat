package lab_1_4.samost;

import java.io.IOException;

/**
 * Created by shrralis on 23.03.2016.
 */
public class Zhyravov {

    private static float a, b, x;

    public static void main(String[] args) throws IOException {
        float data[] = InputDataZhyravov.inputData();
        a = data[0];
        b = data[1];
        x = data[2];
        data = null;
        InputedDataZhyravov.inputedData(a, b, x);
        ComputeZhyravov.compute(a, b, x);
        DateZhyravov.dateTime();
    }
}
