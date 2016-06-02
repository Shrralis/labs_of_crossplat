package lab_1_10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by shrralis on 6/3/16.
 */
public class TestFrame_1 extends JFrame {

    static int i = 0;

    public static void createGUI() {

        JFrame frame = new JFrame("Демонстрація головного меню");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        fileMenu.setFont(new Font("Verdana", Font.PLAIN, 11));
        fileMenu.setToolTipText("Work with files");

        JMenu newMenu = new JMenu("<html><font color=yellow>New");
        newMenu.setFont(new Font("Arial", Font.PLAIN, 11));
        fileMenu.add(newMenu);

        JMenuItem txtFileItem = new JMenuItem("Text file");
        txtFileItem.setFont(new Font("Verdana", Font.BOLD, 12));
        newMenu.add(txtFileItem);

        JMenuItem imgFileItem = new JMenuItem("<html><font color=purple>Image file");
        imgFileItem.setFont(new Font("Arial", Font.ITALIC, 13));
        newMenu.add(imgFileItem);

        JMenuItem folderItem = new JMenuItem("<html><font color=red>Folder");
        folderItem.setFont(new Font("Verdana", Font.ITALIC, 11));
        newMenu.add(folderItem);

        JMenuItem openItem = new JMenuItem("<html><font color=blue>Open");
        openItem.setFont(new Font("Arial", Font.BOLD, 10));
        fileMenu.add(openItem);

        JMenuItem closeItem = new JMenuItem("<html><font color=green>Close");
        closeItem.setFont(new Font("Verdana", Font.PLAIN, 10));
        fileMenu.add(closeItem);

        JMenuItem closeAllItem = new JMenuItem("<html><font color=white>Close all");
        closeAllItem.setFont(new Font("Arial", Font.PLAIN, 14));
        fileMenu.add(closeAllItem);

        fileMenu.addSeparator();

        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.setFont(new Font("Verdana", Font.PLAIN, 11));
        fileMenu.add(exitItem);

        Font font = new Font("Verdana", Font.PLAIN, 10);
        final JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.setFont(font);

        JMenu tabMenu = new JMenu("Tabs");
        tabMenu.setFont(font);

        JMenuItem addTab = new JMenuItem("Add");
        addTab.setFont(font);
        addTab.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tabbedPane.addTab("Вкладка " + i++, null);
            }
        });
        tabMenu.add(addTab);

        JMenuItem delTab = new JMenuItem("Delete");
        delTab.setFont(font);
        delTab.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int select = tabbedPane.getSelectedIndex();
                if (select >= 0) {
                    tabbedPane.removeTabAt(select);
                    i--;
                }
            }
        });
        tabMenu.add(delTab);

        exitItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        menuBar.add(fileMenu);
        menuBar.add(tabMenu);

        frame.setJMenuBar(menuBar);

        JPanel content = new JPanel();
        content.setLayout(new BorderLayout());
        content.add(tabbedPane, BorderLayout.CENTER);
        frame.add(content);

        frame.setPreferredSize(new Dimension(370, 225));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame.setDefaultLookAndFeelDecorated(true);
                createGUI();
            }
        });
    }
}
