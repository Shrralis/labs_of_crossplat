package lab_1_10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Created by shrralis on 6/2/16.
 */
public class TestFrame_2 extends JFrame {

    public static String TEST_TEXT = "Test text";

    private JLabel label;

    private JCheckBox italicBox = new JCheckBox("Italic");
    private JCheckBox boldBox = new JCheckBox("Bold");
    private JCheckBox underlineBox = new JCheckBox("Underline");

    public TestFrame_2() {
        super("Test frame");
        createGUI();
    }

    public void createGUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        label = new JLabel(getText());
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setFont(new Font("Calibri", Font.PLAIN, 30));
        panel.add(label, BorderLayout.CENTER);

        JPanel boxesPanel = new JPanel();

        boxesPanel.add(italicBox);

        italicBox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                updateText();
            }
        });

        boxesPanel.add(boldBox);

        boldBox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                updateText();
            }
        });

        boxesPanel.add(underlineBox);

        underlineBox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                updateText();
            }
        });

        panel.add(boxesPanel, BorderLayout.SOUTH);
        setPreferredSize(new Dimension(250, 200));
        getContentPane().add(panel);
    }

    public void updateText() {
        label.setText(getText());
    }

    private String getText() {
        String text = checkItalic(TEST_TEXT);
        text = checkBold(text);
        text = checkUnderline(text);
        return "<html>" + text + "</html>";
    }

    private String checkItalic(String string) {
        if (italicBox.isSelected()) {
            return "<i>" + string + "</i>";
        }
        return string;
    }

    private String checkBold(String string) {
        if (boldBox.isSelected()) {
            return "<b>" + string + "</b>";
        }
        return string;
    }

    private String checkUnderline(String string) {
        if (underlineBox.isSelected()) {
            return "<u>" + string + "</u>";
        }
        return string;
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame.setDefaultLookAndFeelDecorated(true);
                TestFrame_2 frame = new TestFrame_2();
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }
}
