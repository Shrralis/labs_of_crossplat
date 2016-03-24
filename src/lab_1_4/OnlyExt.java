package lab_1_4;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Created by shrralis on 3/24/16.
 */
public class OnlyExt implements FilenameFilter {

    String ext;

    public OnlyExt(String ext) {
        this.ext = "." + ext;
    }

    public boolean accept(File dir, String name) {
        return name.endsWith(ext);
    }
}
