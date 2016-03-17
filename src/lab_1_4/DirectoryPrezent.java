package lab_1_4;

import java.io.File;

/**
 * Created by shrralis on 3/17/16.
 */
public class DirectoryPrezent {

    public static void main(String[] args) {
        String dirname = ".";
        File f1 = new File(dirname);
        if (f1.isDirectory()) {
            System.out.println("Каталог " + f1.getAbsolutePath());
            String s[] = f1.list();
            for (int i = 0; i < s.length; i++) {
                File f = new File(dirname + "/" + s[i]);
                if (f.isDirectory()) {
                    System.out.println(s[i] + " - це каталог");
                } else {
                    System.out.println(s[i] + " - це файл");
                }
            }
        } else {
            System.out.println(dirname + " - це не каталог");
        }
    }
}
