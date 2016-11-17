package exercises.jframe.exercises.form;

import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;
import net.miginfocom.swing.MigLayout;
import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;

import javax.swing.*;
import java.awt.*;

/**
 * Created by joschinc on 11/17/16.
 */
public class FormDemo {
    public static void main(String[] args){
        JFrame frame = new JFrame("Demo Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,800);
        frame.setMinimumSize(new Dimension(400,600));
        JPanel panel = new JPanel();
        panel.setLayout(new MigLayout("","",""));
        panel.setBorder(BorderFactory.createTitledBorder("Register"));
        frame.add(panel);

        JLabel nameLabel =  new JLabel("First Name:");
        JTextField nameField = new JTextField();

        JLabel lastNameLabel = new JLabel("Last Name:");
        JTextField lastNameField = new JTextField();

        JLabel dateLabel = new JLabel("Date:");

        UtilDateModel model = new UtilDateModel();

        JDatePanelImpl datePanel = new JDatePanelImpl(model);
        datePanel.setVisible(true);
        JDatePickerImpl datePicker = new JDatePickerImpl(datePanel);

        JLabel addressLabel = new JLabel("Address:");
        JTextField addressField = new JTextField();

        JLabel mobilLabel = new JLabel("Mobile Phone:");
        JTextField mobilField = new JTextField();
        JCheckBox textCheck = new JCheckBox();
        JCheckBox emailCheck = new JCheckBox();

        JLabel additionalInfoLabel = new JLabel("Additional Information:");
        JTextArea additionalInfoArea = new JTextArea(30,20);
        additionalInfoArea.setBorder(BorderFactory.createEtchedBorder());

        //Row 1
        panel.add(nameLabel,"split 2, sg a");
        panel.add(nameField,"growx, pushx, wrap");

        //Row2
        panel.add(lastNameLabel,"split 2, sg a");
        panel.add(lastNameField, "pushx, growx, wrap");

        // Row 3
        panel.add(dateLabel,"split 3, sg a");
        panel.add(datePicker,"pushx, growx, wrap");

        //Row 4
        panel.add(addressLabel, "split 2, sg a");
        panel.add(addressField, "growx, pushx, wrap");

        //Row 5
        panel.add(mobilLabel, "split 6, sg a");
        panel.add(mobilField, "pushx, growx");
        panel.add(new JLabel("Text:"),"");
        panel.add(textCheck);
        panel.add(new JLabel("Email:"),"");
        panel.add(emailCheck,"wrap");

        //Row 6
        panel.add(additionalInfoLabel,"sg a, wrap");
        panel.add(additionalInfoArea,"span, grow, push");



        //frame.pack();
        frame.setLocation(300,300);
        frame.setVisible(true);


    }
}
