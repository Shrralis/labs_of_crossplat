package lab_1_3.individual_4;

import java.util.Calendar;

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
        if (age > 100 || age < 0) {
            System.out.println("Age must be in interval [0; 100]!");
        }
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
        if (course > 0 && course <5) {
            this.course = course;
            String courseYear = String.valueOf(Calendar.getInstance().get(Calendar.YEAR) % 100 - course);
            groupName = groupName.replace(groupName.substring(3, 5), courseYear);
            //System.out.println(groupName);
        } else {
            System.out.println("Course must be in interval [1; 4]!");
        }
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
        if (age > 100 || age < 0) {
            System.out.println("Error! Age isn't in interval [0; 100]!");
        }
        System.out.println("Course = " + course);
        System.out.println("Group name = " + groupName);
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
    }

    public void courseFromGroupName() {
        if (groupName.trim().isEmpty()) {
            System.out.println("Group name is empty!");
            return;
        }
        System.out.println("Your group is " + groupName);
        course = ((Calendar.getInstance().get(Calendar.YEAR) % 100) - Integer.parseInt(groupName.trim().substring(3,
                5)));
        System.out.println("Your course is " + course);
    }
}
