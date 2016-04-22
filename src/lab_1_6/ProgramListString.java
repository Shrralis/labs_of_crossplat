package lab_1_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by shrralis on 4/5/2016.
 */
public class ProgramListString {

    public static void main(String[] args) throws IOException {
        List<String> strings = new ArrayList<String>();
        List<String> strings2 = new ArrayList<String>();
        point14(strings);
        showStrings(strings);
        point14(strings2);
        System.out.println("compareStrings: " + compareStrings(strings, strings2));
        point21(strings);
        point23(strings);
        System.out.println("containsString: " + containsString(strings, "world"));
        reverse(strings);
        System.out.println(strings);
        point28(strings, strings2);
    }

    private static void point14(List<String> strings) {
        strings.add("Hello");
        strings.add("world");
        strings.add("!");
    }

    private static void showStrings(List<String> strings) {
        for (String each :
                strings) {
            System.out.print(each + " ");
        }
        System.out.println();
    }

    private static boolean compareStrings(List<String> strings, List<String> strings2) {
        boolean result = false;
        if (strings.size() != strings2.size()) return false;
        for (String each :
                strings) {
            for (String each2 :
                    strings2) {
                if ((result = each.equals(each2)) == true) break;
            }
            if (result == false) break;
        }
        return result;
    }

    private static boolean compareStrings2(List<String> strings, List<String> strings2) {
        return strings.size() == strings2.size();
    }

    private static void point21(List<String> strings) {
        for (int i = strings.size() - 1; i >= 0; i--) {
            System.out.println(strings.get(i));
        }
    }

    private static void point23(List<String> strings) {
        strings.add("Yaroslav");
        strings.add("Zhyravov");
        strings.add("PI-13-02");
        System.out.println("Index of \"Yaroslav\" = " + strings.indexOf("Yaroslav"));
        System.out.println("Index of \"Zhyravov\" = " + strings.indexOf("Zhyravov"));
        System.out.println("Index of \"PI-13-02\" = " + strings.indexOf("PI-13-02"));
    }

    private static boolean containsString(List<String> strings, String string) {
        for (String each :
                strings) {
            if (each.equals(string)) return true;
        }
        return false;
    }

    private static boolean containsString2(List<String> strings, String string) {
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).equals(string)) return true;
        }
        return false;
    }

    private static void reverse(List<String> strings) {
        List<String> temp = new ArrayList<String>();
        for (int i = strings.size() - 1; i >= 0; i--) {
            temp.add(strings.get(i));
        }
        strings.clear();
        strings.addAll(temp);
    }

    private static void point28(List<String> strings, List<String> strings2) throws IOException {
        System.out.println("Кількість елементів в першому списку = " + strings.size());
        System.out.println("Кількість елементів в другому списку = " + strings2.size());
        System.out.print("Який обрати список для подальшої роботи? (1 або 2, інакше - вихід): ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        if (a != 1 && a != 2) {
            return;
        }
        for (String line : (a == 1 ? strings : strings2)) {
            System.out.println(line);
        }
        System.out.println("Останній індекс елемента \"world\" = " + (a == 1 ? strings : strings2).lastIndexOf("world"));
    }
}
