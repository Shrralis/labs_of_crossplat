package lab_1_8.Swing;

import javax.swing.*;

/**
 * Created by shrralis on 5/30/16.
 */
public class Main {

    public static void main(String[] args) {
        // Створюється об'єкт основної візуальної форми програми
        // та встановлюється флажок, що вона є видима.
        MainForm mainForm = new MainForm();
        mainForm.setVisible(true);
        // при закритті форми, повиннен відбуватися вихід із програми
        mainForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
