package lab_1_4;

import java.io.*;

/**
 * Created by shrralis on 3/24/16.
 */
public class Quest_61 {

    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n, k = 0;

        do {
            System.out.print("n = ");
            n = Integer.parseInt(reader.readLine());
        } while (n <= 0);

        do {
            k++;
            System.out.println();
        } while ((n /= 10) != 0);

        System.out.println(k + " цифр(-а/-и)");

        File file = new File("./src/lab_1_4/Quest_61.rrs");
        if (!file.exists()) file.createNewFile();
        FileOutputStream outputStream = new FileOutputStream(file);
        outputStream.write((k + " цифр(-а/-и)").getBytes());
        outputStream.close();
    }
}
