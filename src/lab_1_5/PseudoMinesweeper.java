package lab_1_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * Created by shrralis on 4/1/2016.
 */
public class PseudoMinesweeper {

    public static void main(String[] args) throws IOException {
        int[][] field = createField();
        showField(field);
    }

    private static int[][] createField() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x, y;
        String s;
        do {
            System.out.print("Введіть бажану кількість стовпців: ");
            s = reader.readLine();
            if (s.isEmpty() || Integer.parseInt(s) <= 0) System.out.println("Не коректний ввід!");
        } while (s.isEmpty() || Integer.parseInt(s) <= 0);
        x = Integer.parseInt(s);
        do {
            System.out.print("Введіть бажану кількість рядків: ");
            s = reader.readLine();
             if (s.isEmpty() || Integer.parseInt(s) <= 0) System.out.println("Не коректний ввід!");
        } while(s.isEmpty() || Integer.parseInt(s) <= 0);
        y = Integer.parseInt(s);
        int field[][] = new int[y][x];
        Random r = new Random();
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                field[i][j] = r.nextInt(2);
            }
        }
        return field;
    }

    private static void showField(int[][] field) throws IOException {
        System.out.print("\t");
        for (int i = 0; i < field[0].length; i++) {
            System.out.print(" " + (i + 1));
        }
        System.out.println();
        for (int i = 0; i < field.length; i++) {
            System.out.print((i + 1) + "\t");
            for (int j = 0; j < field[0].length; j++) {
                System.out.print(field[i][j] == -1 ? "□ " : "■ ");
            }
            System.out.println();
        }
        clickInField(field);
    }

    private static void clickInField(int[][] field) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x, y;
        String s;
        do {
            System.out.print("Стовпець: ");
            s = reader.readLine();
            if (s.isEmpty() || Integer.parseInt(s) > field[0].length || Integer.parseInt(s) <= 0) System.out.println("Такого стовпця не існує!");
        } while (s.isEmpty() || Integer.parseInt(s) > field[0].length || Integer.parseInt(s) <= 0);
        x = Integer.parseInt(s);
        do {
            System.out.print("Рядок: ");
            s = reader.readLine();
            if (s.isEmpty() || Integer.parseInt(s) > field[0].length || Integer.parseInt(s) <= 0) System.out.println("Такого рядка не існує!");
        } while (s.isEmpty() || Integer.parseInt(s) > field[0].length || Integer.parseInt(s) <= 0);
        y = Integer.parseInt(s);
        if (field[y - 1][x - 1] == 0) {
            field[y - 1][x - 1] = -1;
            if (isAllOpened(field)) gameOver(field);
            else showField(field);
        }
        else if (field[y - 1][x - 1] == 1) gameOver(field);
        else clickInField(field);
    }

    private static boolean isAllOpened(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                if (field[i][j] == 0) return false;
            }
        }
        return true;
    }

    private static void gameOver(int[][] field) throws IOException {
        if (!isAllOpened(field)) System.out.println("Програш!");
        else System.out.println("Вітання!");
        System.out.print("\t");
        for (int i = 0; i < field[0].length; i++) {
            System.out.print(" " + (i + 1));
        }
        System.out.println();
        for (int i = 0; i < field.length; i++) {
            System.out.print((i + 1) + "\t");
            for (int j = 0; j < field[0].length; j++) {
                System.out.print(field[i][j] == -1 ? "□ " : (field[i][j] == 0 ? "■ " : "● "));
            }
            System.out.println();
        }
    }
}
