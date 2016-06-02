package lab_1_8.Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by shrralis on 5/30/16.
 */
public class MainForm extends JDialog {

    final Map<JButton, Integer> map = new HashMap<>();

    public MainForm() {
        setTitle("Головна форма");
        setSize(400, 300);
        setResizable(false);

        //adding a button
        JButton button = new JButton();
        button.setText("Button");
        map.put(button, 0);
        JPanel panel = new JPanel();
        panel.add(button);
        getContentPane().add(panel);

        //connecting an action for the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onButtonClick(e);
            }
        });

        //text field
        final JTextField textField = new JTextField(10);
        panel.add(textField);
        textField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (String.valueOf(e.getKeyChar()).matches("\\D")) {
                    e.consume();
                } else {
                    setTitle(textField.getText() + e.getKeyChar());
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        //second button
        JButton button1 = new JButton();
        button1.setText("Set title");
        panel.add(button1);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onButton1Click(e);
            }
        });

        //label
        JLabel label = new JLabel();
        label.setText("Жиравов Ярослав Олександрович ПІ-13-02");
        panel.add(label);

        //color
        Color myColor = new Color(0, 176, 240);
        panel.setBackground(myColor);

        //button popupMessage
        JButton popupMessage = new JButton();
        popupMessage.setText("Повідомлення");
        popupMessage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(MainForm.this, "Ярослав Жиравов");
            }
        });
        panel.add(popupMessage);

        //button popupYesNoMessage
        JButton popupYesNoMessage = new JButton();
        popupYesNoMessage.setText("Так/Ні Повідомлення");
        popupYesNoMessage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(MainForm.this, "Так/Ні Повідомлення");
            }
        });
        panel.add(popupYesNoMessage);
    }

    private void onButtonClick(ActionEvent e) {
        setTitle("Button is clicked");
        JButton button = (JButton) e.getSource();
        button.setText("Clicked" + (map.get(button) > 0 ? " " + map.get(button) : ""));
        map.put(button, map.get(button) + 1);
    }

    private void onButton1Click(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        JTextField textField = (JTextField) button.getParent().getComponent(1);
        setTitle(textField.getText());
        JLabel label = (JLabel) button.getParent().getComponent(3);
        label.setText(textField.getText());
    }
}
