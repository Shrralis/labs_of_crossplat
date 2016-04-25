package lab_1_7;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Shrralis on 4/21/2016.
 */
public class StudentsMap {

    public static void main(String[] args) {
        Map<String, Float> students = new HashMap<String, Float>();
        students.put("Жиравов", 8.1f);
        students.put("Пастушенко", 6.6f);
        students.put("Рибак", 6.1f);
        showMap(students);

        Map<String, StudentInfo> studentsInfo = new HashMap<String, StudentInfo>();

        StudentInfo info = new StudentInfo();
        info.setMinimal(7);
        info.setAverage((float) 8.4);
        info.setMaximal(10);
        studentsInfo.put("Вася Пупкін", info);

        StudentInfo[] sInfo = new StudentInfo[3];
        for (int i = 0; i < sInfo.length; i++) {
            sInfo[i] = new StudentInfo();
        }
        sInfo[0].setMinimal(4);
        sInfo[0].setAverage(6.6f);
        sInfo[0].setMaximal(8);
        studentsInfo.put("Пастушенко Василь", sInfo[0]);
        sInfo[1].setMinimal(4);
        sInfo[1].setAverage(6.1f);
        sInfo[1].setMaximal(7);
        studentsInfo.put("Рибак Сергій", sInfo[1]);
        sInfo[2].setMinimal(4);
        sInfo[2].setAverage(8.1f);
        sInfo[2].setMaximal(11);
        studentsInfo.put("Жиравов Ярослав", sInfo[2]);

        for (String student :
                studentsInfo.keySet()) {
            System.out.println(student + " min: " + showStudentInfo(studentsInfo.get(student), "min"));
        }

        System.out.println();
        for (String student :
                studentsInfo.keySet()) {
            System.out.println(student + " max: " + showStudentInfo(studentsInfo.get(student), "max"));
        }

        System.out.println();
        for (String student :
                studentsInfo.keySet()) {
            float avgMark = Float.parseFloat(showStudentInfo(studentsInfo.get(student), "avg").trim());
            if(avgMark >= 7.0f) {
                System.out.println(student + " avg: " + avgMark);
            }
        }

        System.out.println();
        for (String student :
                studentsInfo.keySet()) {
            float realAvgMark = Float.parseFloat(showStudentInfo(studentsInfo.get(student), "avg").trim());
            float avgMark = (Float.parseFloat(showStudentInfo(studentsInfo.get(student), "max").trim()) +
                    Float.parseFloat(showStudentInfo(studentsInfo.get(student), "min").trim())) / 2;
            System.out.println(student + " realAvg: " + realAvgMark + " - computedAvg: " + avgMark + " - " +
                    "difference (cAvg-realAvg): " + (avgMark - realAvgMark));
        }
    }

    static void showMap(Map map) {
        for (Object o :
                map.keySet()) {
            System.out.println(o + " - " + (map.get(o).getClass().getName().matches("^.*StudentInfo$") ?
                    showStudentInfo((StudentInfo) map.get(o)) : map.get(o)));
        }
    }

    static String showStudentInfo(StudentInfo studentInfo) {
        return (studentInfo.getMinimal() + " - " +
                studentInfo.getAverage() + " - " +
                studentInfo.getMaximal());
    }

    static String showStudentInfo(StudentInfo studentInfo, String mode) {
        return ((mode.matches("^.*min.*$") ? studentInfo.getMinimal() : "") + "" +
                (mode.matches("^.*avg.*$") ? studentInfo.getAverage() : "") + "" +
                (mode.matches("^.*max.*$") ? studentInfo.getMaximal() : ""));
    }

    //TODO: make point 33!!!
}
