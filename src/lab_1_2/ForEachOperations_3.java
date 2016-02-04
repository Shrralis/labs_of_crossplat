package lab_1_2;

/**
 * Created by shrralis on 2/4/16.
 */
public class ForEachOperations_3 {

    public static void main(String[] args) {
        String s[] = new String[] {
                "Yaroslav", "Zhyravov", "PI-13-02"
        };
        for (String line :
                s) {
            System.out.println(line.charAt(0) + " " + line.charAt(line.length() - 1));
        }
    }
}
