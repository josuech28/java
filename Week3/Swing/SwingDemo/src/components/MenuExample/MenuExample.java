package components.MenuExample;

import javax.swing.*;
import java.awt.*;

/**
 * Created by joschinc on 11/15/16.
 */
public class MenuExample {
    public static void main(String[] args){
        JFrame frame = new JFrame("Menu Example");
        JPanel panel = new JPanel();
        JTextArea textArea = new JTextArea();

        JMenuBar menuBar = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenu edit = new JMenu("Edit");
        JMenu help = new JMenu("Help");

        JMenuItem save = new JMenuItem("Save");
        JMenuItem quit = new JMenuItem("Quit");

        JMenuItem cut = new JMenuItem("Cut");
        JMenuItem copy = new JMenuItem("Copy");
        JMenuItem paste = new JMenuItem("Paste");

        JMenuItem helpItem = new JMenuItem("I cant support you now");

        file.add(save);
        file.add(quit);

        edit.add(cut);
        edit.add(copy);
        edit.add(paste);

        help.add(helpItem);

        menuBar.add(file);
        menuBar.add(edit);
        menuBar.add(help);

        JButton btn1 = new JButton("Add");
        JButton btn2 = new JButton("Delete");
        JButton btn3 = new JButton("Update");

        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);

        frame.setLayout(new GridLayout(3,1));
        frame.add(menuBar);
        frame.add(panel);
        frame.add(textArea);

        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);




    }
}
