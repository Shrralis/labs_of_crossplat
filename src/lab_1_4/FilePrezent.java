package lab_1_4;

import java.io.File;

/**
 * Created by shrralis on 3/17/16.
 */
public class FilePrezent {

    static void p(String s) {
        System.out.println(s);
    }
    public static void main(String[] args) {
        File f1 = new File(
                "src/lab_1_4/FilePrezent.java");
        p("Ім’я файлу: " + f1.getName());
        p("Шлях: " + f1.getPath());
        p("Повний шлях: " + f1.getAbsolutePath());
        p("Надкаталог: " + f1.getParent());
        p(f1.exists() ? " існує" : " не існує");
        p(f1.canWrite() ? " для запису" : " не для запису");
        p(f1.canRead() ? " для читання" : " не для читання");
        p("Остання зміна файлу: " + f1.lastModified());
        p("Розмір файлу " + f1.length() + " байтів");
    }
}
