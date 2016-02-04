package lab_1_2;

/**
 * Created by shrralis on 2/4/16.
 */
public class Quest_62 {

    public static void main(String[] args) {
        int x[] = new int[20], tempM[] = new int[20], tempL[] = new int[20];
        int li = 0, mi = 0;
        for (int i = 0; i < 20; i++) {
            x[i] = 8 * i + 2 * i / 2;
            x[i] *= i % 2 == 0 ? -1 : 1;
            if (x[i] <= 0) tempL[li++] = x[i];
            else tempM[mi++] = x[i];
        }
        int l[] = new int[li], m[] = new int[mi];
        for (int i = 0; i < l.length; i++) {
            l[i] = tempL[i];
        }
        for (int i = 0; i < m.length; i++) {
            m[i] = tempM[i];
        }
        tempL = null;
        tempM = null;
        System.out.printf("X\t\tMORE_0\t\tOTHER\n");
        for (int i = 0; i < 20; i++) {
            System.out.println(x[i] + "\t\t" +
                    (i < m.length ? m[i] : "\t\t") + "\t\t\t" +
                    (i < l.length ? l[i] : ""));
        }
    }
}
