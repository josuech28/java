import net.miginfocom.swing.MigLayout;

import javax.jws.soap.SOAPBinding;
import javax.swing.*;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

/**
 * Created by joschinc on 12/8/16.
 */
public class EmployeeRegister {
    private JFrame employeeRegisterFrame;
    private JPanel principalPanel;
    private JTextField name;
    private JTextField lastName;
    private JTextField email;
    private JLabel nameLabel;
    private JLabel lastNameLabel;
    private JLabel emailLabel;
    private JLabel genreLabel;
    private JRadioButton male;
    private JRadioButton female;
    private ButtonGroup genre;
    private JButton btnAdd;
    private JButton btnClear;
    private JTable employeeTable;
    private JScrollPane employeeScroll;
    private EmployeeModel employeeModel = new EmployeeModel();
    private DefaultTableModel tempModel;

    public void setEmployeeRegisterFrame(String title){
        employeeRegisterFrame = new JFrame(title);

        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension screenSize = tk.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        employeeRegisterFrame.setSize(screenWidth / 2 , screenHeight / 2 );
        employeeRegisterFrame.setLocation(screenWidth / 4, screenHeight / 4);

    }

    public void startemployeeRegisterFrame(){
        //employeeRegisterFrame.pack();
        employeeRegisterFrame.setVisible(true);
    }

    public void setPrincipalPanel(String description){
        principalPanel = new JPanel();
        principalPanel.setBorder(BorderFactory.createTitledBorder(description));
        principalPanel.setLayout(new MigLayout("","[][]", "grow"));
        employeeRegisterFrame.add(principalPanel);
    }

    public void initComponents(){
        nameLabel = new JLabel("Name");
        lastNameLabel = new JLabel("Last Name");
        emailLabel = new JLabel("Email");
        genreLabel = new JLabel("Genre");

        name = new JTextField(20);
        lastName = new JTextField(20);
        email = new JTextField(20);

        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        genre = new ButtonGroup();


        btnAdd = new JButton("Add");
        btnClear = new JButton("Clear");

        employeeModel = new EmployeeModel();
        tempModel = new DefaultTableModel();
        tempModel.addColumn("Name");
        tempModel.addColumn("Last Name");
        tempModel.addColumn("Email");
        tempModel.addColumn("Genre");
        //employeeTable = new JTable(new EmployeeModel());
        employeeTable = new JTable(tempModel);
        employeeScroll = new JScrollPane(employeeTable);

    }

    public void addComponents(){
        principalPanel.add(nameLabel,"left, sg 1, split");
        principalPanel.add(name,"pushx, growx, wrap");

        principalPanel.add(lastNameLabel,"left, sg 1, split");
        principalPanel.add(lastName,"pushx, growx, wrap");

        principalPanel.add(emailLabel,"left, sg 1, split");
        principalPanel.add(email,"push, grow,wrap");

        principalPanel.add(genreLabel,"left, sg 1, split");
        genre.add(male);
        genre.add(female);

        principalPanel.add(male,"pushx,growx");
        principalPanel.add(female,"pushx,growx, wrap");



        principalPanel.add(btnAdd,"center, split");
        principalPanel.add(btnClear,"center, wrap");

        principalPanel.add(employeeScroll,"push, grow, wrap");

    }
    private void addEvents(){
        addButtonEvent();
        clearButtonEvent();
    }

    private void addButtonEvent(){
        btnAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addRow();

            }
        });
    }

    private void clearButtonEvent(){
        btnClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clearFields();
            }
        });
    }
    private void clearFields(){
        name.setText("");
        lastName.setText("");
        email.setText("");
        if(male.isSelected()){
            male.setSelected(false);
        } else {
            if(female.isSelected()){
                female.setSelected(false);
            }
        }
    }
    private Employee getEmployee(){
        String name = this.name.getText().trim();
        String lastName = this.lastName.getText().trim();
        String email = this.email.getText().trim();
        String genre = getGenre();
        Employee newEmployee = new Employee(name,lastName,email,genre);
        return newEmployee;
    }

    private String getGenre(){
        if(male.isSelected()){
            return male.getText();
        } else {
            if(female.isSelected()){
                return  female.getText();
            }
        }
        return "No selected";
    }

    public boolean validityName(){
        return name.isValid() && name.getText().length() >= 5 && name.getText().length() <= 20;
    }

    public boolean validityLastName(){
        return lastName.isValid() && lastName.getText().length() >= 5 && lastName.getText().length() <= 20;
    }

    public void validityShowMessage(String message){
        JOptionPane.showMessageDialog(null, message);
    }

    private void addRow(){
        if(!validityName()){
            validityShowMessage("Need to complete  Name (5-20 characters)");
            name.grabFocus();
            return;

        }
        else {
            if(!validityLastName()){
                validityShowMessage("Need to complete Last Name (5-20 characters)");
                lastName.grabFocus();
                return;
            } else {
                Employee employee = getEmployee();
                /*
                employeeModel.addEmployee(employee);
                employeeModel.fireTableDataChanged();
                */
                String obj[] = {employee.getName(),employee.getLastName(), employee.getEmail(), employee.getGenre()};
                tempModel.addRow(obj);
                clearFields();
            }
        }
    }



    public void start(){
        setEmployeeRegisterFrame("Employee Form");
        setPrincipalPanel("Principal Information");
        initComponents();
        addComponents();
        addEvents();
        startemployeeRegisterFrame();

    }
}
