package lab_1_4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

/**
 * Created by shrralis on 3/24/16.
 */
public class Quest_64_mod {

    public static void main(String[] args) throws IOException {
        FileReader fReader = new FileReader("./src/lab_1_4/Quest_64_mod.rrs");
        BufferedReader reader = new BufferedReader(fReader);
        String s;
        int a = Integer.parseInt(reader.readLine().substring(5));               //перший рядок має "0-сектор", в ньому треба починати рахувати з 1!!!!!!!!!!!
        int b = Integer.parseInt(reader.readLine().substring(4));
        fReader = null;
        reader = null;
        s = null;

        if (a >= b) {
            System.out.println("b не більше за a!");
            return;
        }

        Random random = new Random();
        System.out.println(random.nextInt(++b - a) + a);
    }
}
