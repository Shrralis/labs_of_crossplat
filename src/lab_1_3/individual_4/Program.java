package lab_1_3.individual_4;

/**
 * Created by shrralis on 2/5/16.
 */
public class Program {


    public static void main(String[] args) {
        Student s1 = new Student("Ярослав Жиравов", 18, 2, "ПІ-13-02");
        s1.print();
        s1.courseFromGroupName();
        s1.setGroupName(" ПІ-15-01 ");
        s1.courseFromGroupName();
    }

}
