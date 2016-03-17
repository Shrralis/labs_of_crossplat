package lab_1_4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by shrralis on 3/17/16.
 */
public class SerializationProgram {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("Ярослав");
        student1.setAge(18);
        student1.setGroup("ПІ-13-02");
        try {
            FileOutputStream fileOutput = new FileOutputStream("file.txt");
            ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);
            objectOutput.writeObject(student1);
            FileInputStream fileInput= new FileInputStream("file.txt");
            ObjectInputStream objectInput = new ObjectInputStream(fileInput);
            Student student2 = (Student) objectInput.readObject();
            System.out.println(student2.getName());
            System.out.println(student2.getAge());
            System.out.println(student2.getGroup());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
