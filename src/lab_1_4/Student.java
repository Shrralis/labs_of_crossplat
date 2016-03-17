package lab_1_4;

import java.io.Serializable;

/**
 * Created by shrralis on 3/17/16.
 */
public class Student implements Serializable {

    private String name, group;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public static void main(String[] args) {

    }
}
