package lab_1_7;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Shrralis on 4/21/2016.
 */
public class ProgramMap {

    public static void main(String[] args) {
        // point 4
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("середній бал групи", 5);
        map.put("середній бал курсу", 5);
        map.put("середній бал факультету", 4);
        map.put("середній бал коледжу", 4);
        map.put("середній бал міста", 4);
        map.put("середній бал регіону", 4);
        // point 6
        System.out.println("-----------------------------------------");
        for (String eachKey :
                map.keySet()) {
            System.out.println(eachKey);
        }
        // point7
        System.out.println("-----------------------------------------");
        for (Integer eachValue :
                map.values()) {
            System.out.println(eachValue);
        }
        // point 8
        System.out.println("-----------------------------------------");
        for (Map.Entry<String, Integer> eachEntry:
        map.entrySet()){
            System.out.println(eachEntry.getKey() + " = " + eachEntry.getValue());
        }
        // point 9
        Integer mark = map.get("середній бал коледжу");
        System.out.println("Середній бал коледжу рівний " + mark);
        Integer t = map.get("test");
        System.out.println("test = " + t);
        // point 10
        boolean hasKey = map.containsKey("середній бал групи");
        System.out.println("Є ключ \"середній бал групи\" = " + hasKey);
        hasKey = map.containsKey("test");
        System.out.println("Є ключ \"test\" = " + hasKey);
        // point 11
        boolean hasValue = map.containsValue(5);
        System.out.println("Є значення \"5\" = " + hasValue);
        hasValue = map.containsValue(-1);
        System.out.println("Є значення \"-1\" = " + hasValue);
        // point 12
        System.out.println("Кількість елементів в карті рівна " + map.size());
        // point 13
        map.put("Мінімальний бал", 3);
        if (map.containsKey("мінімальний бал")) {
            System.out.println("Пара була добавлена успішно із значенням " + map.get("мінімальний бал"));
        } else {
            System.out.println("Пара не була добавлена");
        }
        // point 14
        map.put("середній бал регіону", 3);
        // point 15
        if (map.get("середній бал регіону") == 3) {
            System.out.println("Значення було змінено!");
        } else {
            System.out.println("Значення змінено не було!");
        }
        // point 16
        map.clear();
        // point 17
        System.out.println("Карта " + (map.isEmpty() ? "була " : "не була ") + "очищена!");
    }
}
