package lab_1_2;

/**
 * Created by shrralis on 2/4/16.
 */
public class SwitchOperations {

    public static void main(String[] args) {
        int x = 6;
        switch (x) {
            case 0: case 1: case 2: case 3: case 4: case 5:
                System.out.println("012345");
                break;
            case 6: case 8: case 9:
                System.out.println("689");
                break;
            default:
                System.out.println("Не знайдено");
        }
    }
}
