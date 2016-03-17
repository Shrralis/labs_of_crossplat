package lab_1_4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by shrralis on 3/17/16.
 */
public class StreamProgram {

    public static void main(String[] args) throws IOException {
        try {
            FileOutputStream output = new FileOutputStream("file.txt");
            output.write("Жиравов Ярослав Олександрович".getBytes());
            output.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        FileInputStream input =new FileInputStream("file.txt");
        byte[] buffer = new byte[64];
        int length = input.read(buffer);
        while (length != -1) {
            System.out.println(new String(buffer, 0, length));
            length = input.read(buffer);
        }
    }
}
