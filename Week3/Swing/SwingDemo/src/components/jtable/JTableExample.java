package components.jtable;

import javax.swing.*;

/**
 * Created by joschinc on 11/15/16.
 */
public class JTableExample {
    public static void main(String[] args){
        JFrame frame = new JFrame("Example of JTable");


        String[] columns = {"ID","NAME","AGE"};
        String[][] data = {{"01","Josue Chinchilla","23"},{"02","Oscar Duran","33"},{"03","Leonardo Chacon","38"}};

        JTable table = new JTable(data,columns);
        JScrollPane sp = new JScrollPane(table);

        frame.add(sp);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
