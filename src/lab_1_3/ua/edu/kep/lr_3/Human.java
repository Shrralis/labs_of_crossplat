package lab_1_3.ua.edu.kep.lr_3;

/**
 * Created by shrralis on 2/5/16.
 */
public class Human {

    private String name, address, city, country, phone;
    private int age, height, weight;

    public Human() {
        System.out.println("Ініціалізація об’єкта типу Human");
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String value) {
        address = value;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String value) {
        city = value;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String value) {
        country = value;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String value) {
        phone = value;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int value) {
        height = value;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int value) {
        weight = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        name = value;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int value) {
        age = value;
    }

    public void print() {
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
        System.out.println("Height = " + height);
        System.out.println("Weight = " + weight);
        System.out.println("Country = " + country);
        System.out.println("City = " + city);
        System.out.println("Address = " + address);
        System.out.println("Phone = " + phone + "\n\n");
    }

    public void printAgeInfo(int age) {
        String result;
        if (age >=1 && age < 12) result = "дитина";
        else if (age >= 12 && age < 18) result = "підліток";
        else if (age >= 18 && age < 22) result = "студент";
        else if (age >= 22 && age < 60) result = "середній вік";
        else if (age >= 60 && age < 75) result = "похилий вік";
        else result = "старечий вік";
        System.out.println(age + " - " + result);
    }

    public void printAddressPhone() {
        System.out.println("Address = " + address);
        System.out.println("Phone = " + phone + "\n\n");
    }

    public int avgWeight() {
        return height/weight;
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
