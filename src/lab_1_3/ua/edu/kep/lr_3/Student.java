package lab_1_3.ua.edu.kep.lr_3;

/**
 * Created by shrralis on 2/5/16.
 */
public class Student extends Human {

    private int course, age;
    private String groupName, name;

    public Student() {
    }

    public Student(String name, int age, int course, String groupName) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.groupName = groupName;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void print() {
        super.print();

        System.out.println("Course = " + course);
        System.out.println("Group name = " + groupName);
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
    }
}
