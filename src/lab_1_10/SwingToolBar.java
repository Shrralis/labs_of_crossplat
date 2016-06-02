package lab_1_10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by shrralis on 6/3/16.
 */
public class SwingToolBar extends JFrame implements ActionListener {

    JMenuItem openfile,savefile;
    JButton bnew, bopen, bsave, bpreview, bprint;
    JFileChooser ch;

    public void actionPerformed(ActionEvent e) {
        if ((e.getSource() == openfile) | (e.getSource() == bopen)) {
            ch = new JFileChooser();
            ch.showOpenDialog(this);
        } else if ((e.getSource() == savefile) | (e.getSource() == bsave)) {
            ch = new JFileChooser();
            ch.showOpenDialog(this);
        }
    }

    void createMenu() {
        JMenuBar bar = new JMenuBar();
        JMenu file = new JMenu("File");
        file.add(new JMenuItem("New"));
        openfile = new JMenuItem("Open");
        openfile.addActionListener(this);
        file.add(openfile);
        savefile = new JMenuItem("Save");
        savefile.addActionListener(this);
        file.add(savefile);
        file.add(new JMenuItem("Preview"));
        file.add(new JMenuItem("Print"));
        bar.add(file);
        setJMenuBar(bar);
    }

    public SwingToolBar() {
        super("Tool bar");
        createMenu();
        getContentPane().setLayout(new BorderLayout());
        JToolBar tools = new JToolBar();

        bnew=new JButton(new ImageIcon("new.jpg"));
        bnew.setToolTipText("New File");
        tools.add(bnew);

        bopen=new JButton(new ImageIcon("open.jpg"));
        bopen.setToolTipText("Open File");
        tools.add(bopen);

        bsave=new JButton(new ImageIcon("SAVE.jpg"));
        bsave.setToolTipText("Save File");
        tools.add(bsave);

        bpreview=new JButton(new ImageIcon("preview.jpg"));
        bpreview.setToolTipText("Pring Preview");
        tools.add(bpreview);

        bprint=new JButton(new ImageIcon("print.jpg"));
        bprint.setToolTipText("Print File");
        tools.add(bprint);

        tools.setOrientation(SwingConstants.VERTICAL);

        getContentPane().add(tools,BorderLayout.NORTH);
        getContentPane().add(new JTextArea(), BorderLayout.CENTER);
        setSize(300,300);
        show();
    }

    public static void main(String[] args) {

        new SwingToolBar();

    }
}
