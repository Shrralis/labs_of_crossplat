package lab_1_6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by shrralis on 4/5/2016.
 */
public class ProgramList {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        List<Integer> list3 = new ArrayList<Integer>();
        point4_10(list, list2);
        point11(list3);
        point12_13(list, list2, list3);
    }

    private static void showList(List<Integer> list) {
        for (Integer each :
                list) {
            System.out.println(each);
        }
    }

    private static void point4_10(List<Integer> list, List<Integer> list2) {
        list.add(1);
        list.add(4);
        list.add(5);
        list.add(2);
        list.add(1);
        list2.add(7);
        list2.add(9);
        list2.add(13);
        list.addAll(list2);
        System.out.println("list:");
        showList(list);
    }

    private static void point11(List<Integer> list3) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list3.add(random.nextInt(100));
        }
        System.out.println("list3:");
        showList(list3);
    }

    private static void point12_13(List<Integer> list, List<Integer> list2, List<Integer> list3) {
        for (int i = 0; i < list.size(); i++) {
            boolean is = true;
            for (int j = 0; j < list2.size(); j++) {
                if ((is = list.get(i).equals(list2.get(j)))) break;
            }
            if (!is) list3.add(list.get(i));
        }

        System.out.println("list:");
        showList(list);
        System.out.println("list2:");
        showList(list2);
        System.out.println("Результативний список:");
        showList(list3);
        Collections.sort(list3);
        System.out.println("Відсортований список:");
        showList(list3);
    }
}
