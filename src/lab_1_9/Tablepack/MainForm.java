package lab_1_9.Tablepack;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by shrralis on 5/31/16.
 */
public class MainForm extends JDialog {

    DefaultTableModel model;
    JTable table;
    JButton button, button1, button2, button3;
    JComboBox comboBox = new JComboBox();

    public MainForm() {
        setTitle("Розробка програм із графічним інтерфейсом");
        setSize(500, 600);

        model = new DefaultTableModel();

        button = new JButton();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object[] objects = new Object[model.getColumnCount()];
                for (int i = 0; i < objects.length; i++) {
                    objects[i] = (i == 0 ? model.getRowCount() + 1 : model.getColumnCount());
                }
                model.addRow(objects);
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (comboBox.getSelectedIndex() != -1) {
                    String columnName = comboBox.getSelectedItem() +
                            (comboBox.getSelectedIndex() % 2 == 0 ? " - " + comboBox.getSelectedIndex() : "");

                    model.addColumn(columnName);
                } else {
                    model.addColumn("");
                }
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow();

                if (selectedRow != -1) {
                    model.removeRow(selectedRow);
                }
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setTitle(comboBox.getSelectedItem().toString());
            }
        });

        button.setText("Додати рядок");
        button1.setText("Додати стовпець");
        button2.setText("Видалити рядок");
        button3.setText("Встановити заголовок вікна");

        model.addColumn("Перша колонка");
        model.addColumn("Друга колонка");
        model.addColumn("Третя колонка");
        model.addColumn("Четверта колонка");
        model.addColumn("П'ята колонка");

        model.addRow(new Object[]{1, 2, 3, 4, 5});
        model.addRow(new Object[]{2, 3, 4, 5, 1});
        model.addRow(new Object[]{3, 4, 5, 1, 2});

        table = new JTable(model);
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        JScrollPane scrollPane = new JScrollPane(table);
        JPanel panel = new JPanel();

        comboBox.addItem("Пункт вибору 1");
        comboBox.addItem("Пункт вибору 2");
        comboBox.addItem("Пункт вибору 3");

        panel.add(scrollPane);
        panel.add(button);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(comboBox);

        getContentPane().add(panel);
    }
}
