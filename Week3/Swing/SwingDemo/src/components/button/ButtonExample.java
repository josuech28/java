package components.button;

import oracle.jrockit.jfr.JFR;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

/**
 * Created by joschinc on 11/15/16.
 */
public class ButtonExample {
    public static void main(String[] args){
        JFrame frame = new JFrame("Button Example");
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Example using Buttons",JLabel.CENTER);

        BoxLayout boxLayout = new BoxLayout(panel, BoxLayout.Y_AXIS);
        panel.setLayout(boxLayout);
        panel.setBorder(new EmptyBorder(new Insets(45,70,45,70)));

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);

        frame.setLayout(new GridLayout(2,1));
        frame.add(label);
        frame.add(panel);

        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
