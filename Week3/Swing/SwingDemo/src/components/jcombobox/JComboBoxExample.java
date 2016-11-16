package components.jcombobox;

import javax.swing.*;

/**
 * Created by joschinc on 11/15/16.
 */
public class JComboBoxExample {


    public static void main(String[] args){
        JFrame frame = new JFrame("Example Using ComboBox");

        String[] countries = {"Costa Rica","India", "Rusia","Arabia Saudita"};
        JComboBox options = new JComboBox(countries);

        frame.add(options);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(250,350);
        frame.setVisible(true);

    }
}
