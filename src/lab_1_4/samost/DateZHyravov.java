package lab_1_4.samost;

import java.util.Date;

/**
 * Created by shrralis on 23.03.2016.
 */
public class DateZhyravov {

    static void dateTime() {
        Date date = new Date();
        System.out.println("Поточні дата та час у форматі (Місяць, день року та день тижня):");
        System.out.printf("%1$tB, %1$tj %1$te", date);
    }
}
