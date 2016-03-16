package lab_1_2;

/**
 * Created by shrralis on 2/4/16.
 */
public class Quest_45 {
/*
    Program must compute arithmetical mean of
    marks of your group from last semester
*/
    public static void main(String[] args) {
        int marks[] = new int[]{6, 7, 8, 9, 7, 9, 4, 10, 8, 7, 6, 9, 8, 7, 5, 4, 4, 8, 6, 9, 8, 7};
        double avg = 0;
        for (int i = 0; i < marks.length; i++) {
            avg += marks[i];
        }
        avg /= marks.length;
        System.out.println("Result is " + avg);
    }
}
