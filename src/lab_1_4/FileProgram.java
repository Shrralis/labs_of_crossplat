package lab_1_4;

import java.io.File;
import java.io.IOException;

/**
 * Created by shrralis on 3/17/16.
 */
public class FileProgram {

    public static void main(String[] args) throws IOException {
        File file = new File("file.txt");
        System.out.println("Існує: " + file.exists());
        System.out.println("Повний шлях до файлу: " + file.getAbsolutePath());
        file.createNewFile();
        System.out.println("Існує: " + file.exists());
        File directory = new File("students/");
        System.out.println("Каталог: " + directory.isDirectory());
        System.out.println(directory.getName());
        for (String line :
                directory.list()) {
            System.out.println(" " + line + (new File(directory.getAbsolutePath() + "/" + line).isDirectory() ? " - " +
                    "каталог" : " - файл"));
        }
    }
}
