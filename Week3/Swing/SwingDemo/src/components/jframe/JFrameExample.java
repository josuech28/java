package components.jframe;

import javax.swing.*;

/**
 * Created by joschinc on 11/15/16.
 */
public class JFrameExample {
    public static void main(String[] args){
        JFrame myFrame = new JFrame("Hello User");
        myFrame.setVisible(true);
        myFrame.setSize(350,250);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel nameUser = new JLabel("Josue Chinchilla",JLabel.CENTER);


        JPanel panel = new JPanel();
        panel.add(nameUser);
        myFrame.add(panel);
    }
}
