package lab_1_4;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Created by shrralis on 3/24/16.
 */
public class DirectoryPrezentFilter {

    public static void main(String[] args) {
        String dirname = "./src/lab_1_4/";
        File f1 = new File(dirname);
        FilenameFilter only = new OnlyExt("java");
        String s[] = f1.list(only);
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
}
