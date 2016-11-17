package exercises.jframe;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;

/**
 * Created by joschinc on 11/17/16.
 */
public class JFrameExample {
    public static void main(String[] args){
        JFrame frame = new JFrame("Mig Layaout Example");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createTitledBorder("Personal Information"));
        frame.add(panel);

        panel.setLayout(new MigLayout("","[]10[]","[][][]")); // 2 columns && 3 Rows
        JLabel name = new JLabel("Name:");
        JLabel lastName = new JLabel("Last Name:");

        JTextField nameInput = new JTextField(20);
        JTextField lastNameInput = new JTextField(20);

        JLabel description = new JLabel("Description:");
        JTextArea descriptionInput = new JTextArea(30,20);
        descriptionInput.setBorder(BorderFactory.createEtchedBorder());

        panel.add(name,"left, sg 1, split");
        panel.add(nameInput,"pushx, growx, span");  // grown in x with resize

        panel.add(lastName,"left, sg 1, split");
        panel.add(lastNameInput,"pushx, growx, wrap");

        panel.add(description,"left, wrap");
        panel.add(descriptionInput,"span 2, push, grow, wrap");

        frame.pack();
        frame.setVisible(true);



    }
}
