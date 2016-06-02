package lab_1_10;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by shrralis on 6/2/16.
 */
public class TestFrame extends JFrame {

    static int i = 0;
    public TestFrame() {
        super("Вікно інтерфейсу Swing");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Font font = new Font("Verdana", Font.PLAIN, 10);
        final JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.setFont(font);

        JPanel content = new JPanel();
        content.setLayout(new BorderLayout());
        JPanel buttons = new JPanel();
        content.add(buttons, BorderLayout.NORTH);
        JButton add = new JButton("Додати");
        add.setFont(font);
        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JPanel tempPanel = new JPanel();
                DefaultTableModel model = new DefaultTableModel();

                model.addColumn("Ім'я");
                model.addColumn("Прізвище");

                model.addRow(new Object[] {"Михайло-Максим", "Бойчук"});
                model.addRow(new Object[] {"Василь", "Боринець"});
                model.addRow(new Object[] {"Ігор", "Волошенюк"});
                model.addRow(new Object[] {"Владислав", "Гаврилаш"});
                model.addRow(new Object[] {"Дмитро", "Гойсан"});

                JTable table = new JTable(model);
                JScrollPane scrollPane = new JScrollPane(table);

                scrollPane.setPreferredSize(new Dimension(
                        getWidth() - 32,
                        getHeight() - 16
                ));

                tempPanel.add(scrollPane);

                tabbedPane.addTab("Вкладка " + i++, tempPanel);
            }
        });
        buttons.add(add);
        JButton remove = new JButton("Видалити");
        remove.setFont(font);
        remove.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int select = tabbedPane.getSelectedIndex();
                if (select >= 0) {
                    tabbedPane.removeTabAt(select);
                }
            }
        });
        buttons.add(remove);
        content.add(tabbedPane, BorderLayout.CENTER);
        getContentPane().add(content);
        setPreferredSize(new Dimension(260, 220));
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame.setDefaultLookAndFeelDecorated(true);
                new TestFrame();
            }
        });
    }
}
