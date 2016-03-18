package lab_1_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * Created by shrralis on 3/18/2016.
 */
public class Individual_10_mod {

    public static void main(String[] args) throws IOException {
        inputData();
    }

    private static void inputData() throws IOException {
        //ввід початкових даних для створення масиву
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введіть розмір матриці");
        System.out.print("Кількість стовпців: ");
        int m = Integer.parseInt(reader.readLine());
        System.out.print("Кількість рядків: ");
        int n = Integer.parseInt(reader.readLine());
        float a[][] = createArray(n, m);                                                        //створення масиву
        System.out.println("Original:");
        showArray(a);                                                                           //показ масиву
        //заповнення даних для зміщення
        System.out.println("Зміщення");
        System.out.print("Введіть індекс елемента для його зміщення (приклад: 3,4): ");
        String sTemp[] = reader.readLine().split(",");
        int oIndex[] = new int[] {Integer.parseInt(sTemp[0]), Integer.parseInt(sTemp[1])};
        System.out.print("Введіть кількість позицій, на яку потрібно змістити: ");
        int oOffset = Integer.parseInt(reader.readLine());
        a = offsetArray(a, oIndex, oOffset);
        System.out.println("\nOffset: \t");
        showArray(a);
    }

    private static float[][] createArray(int n, int m) {
        Random random = new Random();
        float a[][] = new float[n][m];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = random.nextInt(100) + random.nextFloat();
            }
        }
        return a;
    }

    private static void showArray(float a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.printf("%.3f\t", a[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    private static float[][] offsetArray(float a[][], int oIndex[], int oOffset) {
        for (int i = 0; i < oOffset; i++) {
            float temp = a[oIndex[1]][a[0].length - 1];
            for (int j = a[0].length - 1; j > 0; j--) {
                a[oIndex[1]][j] = a[oIndex[1]][j-1];
            }
            a[oIndex[1]][0] = temp;
        }
        return a;
    }
}
