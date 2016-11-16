package components.radiobutton;

import javafx.scene.control.RadioButton;

import javax.swing.*;

/**
 * Created by joschinc on 11/15/16.
 */
public class RadioButtonExample {
    public static void main(String[] args){
        JFrame frame = new JFrame("Radio Frame Example");
        JPanel panel = new JPanel();

        ButtonGroup radioGroup = new ButtonGroup();
        JRadioButton rb1 = new JRadioButton("male",true);
        JRadioButton rb2 = new JRadioButton("female",false);
        JRadioButton rb3 = new JRadioButton("not specificed", false);

        radioGroup.add(rb1);
        radioGroup.add(rb2);
        radioGroup.add(rb3);

        panel.add(rb1);
        panel.add(rb2);
        panel.add(rb3);

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}
