package lab_1_3.ua.edu.kep;

import lab_1_3.ua.edu.kep.lr_3.Human;

/**
 * Created by shrralis on 2/5/16.
 */
public class Program {

    public static void main(String[] args) {
        Human h = new Human();
        h.setName("Богдан Хмельницький");
        h.setAge(30);
        h.print();
        h.printAgeInfo(8);
        h.printAgeInfo(80);
        h.printAgeInfo(18);
        h.printAgeInfo(68);
        h.printAgeInfo(48);
        h.printAddressPhone();
        //System.out.println("Розподіл ваги (avgWeight) = " + h.avgWeight());

        Human h2 = new Human("Іван Мазепа", 32);
        h2.print();
    }
}
