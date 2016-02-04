package lab_1_2;

/**
 * Created by shrralis on 2/4/16.
 */
public class Quest_57 {

    public static void main(String[] args) {
        float f = 1 / 1000000f; // вказуємо f у дільнику,
        double d = 2 / 1000000f; // щоб результат не перетворювався у ціле

        System.out.println(f); // вивід без форматування
        System.out.println(d);
        System.out.println("==========");
        System.out.format("%10.9f", f); // 10 знаків всього, 9 після коми
        System.out.print(" ");
        System.out.format("%10.9f", d);
        System.out.println("\n==========");
        System.out.format("%10.9f%n", f); // %n дозволяє додати перевід рядка
        System.out.format("%10.9f%n", d); // після значення
    }
}
