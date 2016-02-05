package lab_1_3.individual_1;

/**
 * Created by shrralis on 2/5/16.
 */
public class Student {

    private int course, age;
    private String groupName, name;

    public Student() {
    }

    public Student(String name, int age, int course, String groupName) {
        if (name.trim().isEmpty()) {
            System.out.println("Name can't be empty!");
            return;
        }
        if (groupName.trim().isEmpty()) {
            System.out.println("Group name can't be empty!");
            return;
        }
        this.name = name.trim();
        this.age = age;
        this.course = course;
        this.groupName = groupName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.trim().isEmpty()) {
            System.out.println("Name can't be empty!");
            return;
        }
        this.name = name.trim();
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
        if (groupName.trim().isEmpty()) {
            System.out.println("Group name can't be empty!");
            return;
        }
        this.groupName = groupName.trim();
    }

    public void print() {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Error! Name is empty!");
            return;
        }
        if (groupName.trim().isEmpty()) {
            System.out.println("Error! Group name is empty!");
            return;
        }
        System.out.println("Course = " + course);
        System.out.println("Group name = " + groupName);
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
    }

}
