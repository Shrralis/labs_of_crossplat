package lab_1_4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by shrralis on 3/24/16.
 */
public class FileReaderPrezent {

    public static void main(String[] args) throws IOException{
        FileReader fr = new FileReader("./src/lab_1_4/FileReaderPrezent.java");
        BufferedReader br = new BufferedReader(fr);
        String s;
        while ((s = br.readLine()) != null) {
            System.out.println(s);
        }
        fr.close();
    }
}