package com.view;

import com.dao.DAO;
import com.dao.StudentDaoImpl;
import com.model.Student;
import net.miginfocom.swing.MigLayout;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.List;

/**
 * Created by joschinc on 12/19/16.
 */
public class PrincipalView {
    private JFrame principalFrame;
    private JPanel panelAddStudent;

    private JLabel labelName;
    private JLabel labelAge;

    private JTextField inputName;
    private JComboBox comboBoxAge;

    private JButton btnAddStudent;
    private JButton btnClear;
    private JButton btnDelete;
    private JButton btnUpdate;

    private JTable tableStudent;
    private DefaultTableModel studentModel;
    private JScrollPane scrollPaneStudent;

    private DAO student;

    public PrincipalView(){
        ApplicationContext context =
                new FileSystemXmlApplicationContext("applicationContext.xml");

         student =
                (StudentDaoImpl)context.getBean("studentDAO");

    }

    private void initPrincipalFrame(String title){
        principalFrame = new JFrame(title);
        principalFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        int screenHigh = screenSize.height;
        int screenWidth = screenSize.width;

        principalFrame.setSize(screenWidth /2 , screenHigh /2);
        principalFrame.setLocation(screenWidth / 4, screenHigh /4);
    }
    private void initPanelAddStudent(String title){
        panelAddStudent = new JPanel();
        panelAddStudent.setBorder(BorderFactory.createTitledBorder(title));
        panelAddStudent.setLayout(new MigLayout("","[][][]","[][]"));
        principalFrame.add(panelAddStudent);
    }

    private void initComponentAddStudent(){
        labelName = new JLabel("Name");
        labelAge = new JLabel("Age");

        inputName = new JTextField(20);
        comboBoxAge = new JComboBox();
        comboBoxAge.setModel(new DefaultComboBoxModel(loadAge().toArray()));

        btnAddStudent = new JButton("Add Student");
        btnClear = new JButton("Clear");
        btnDelete = new JButton("Delete");
        btnUpdate = new JButton("Update");

        setStudentModel();
        setModelStudent();
    }
    private void setStudentModel(){
        studentModel = new DefaultTableModel();
        studentModel.addColumn("ID");
        studentModel.addColumn("Name");
        studentModel.addColumn("Age");
        tableStudent = new JTable(studentModel);
        scrollPaneStudent = new JScrollPane(tableStudent);
        tableStudent.setBackground(Color.darkGray);
        tableStudent.setForeground(Color.white);
    }
    private void setModelStudent(){
        List<Student> students = student.list();
        for (Student record : students) {
            Object obj[] = {record.getId(), record.getName(), record.getAge()};
            studentModel.addRow(obj);
        }
    }
    private List<Integer> loadAge(){
        List<Integer> age = new ArrayList<Integer>();
        for(int i = 3; i < 18; i++){
            age.add(i+1);
        }
        Collections.sort(age);
        return age;
    }

    private void deleteRows(){
        int rowCount = studentModel.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
            studentModel.removeRow(i);
        }
    }

    private void addComponentAddStudent(){
        panelAddStudent.add(labelName);
        panelAddStudent.add(inputName,"pushx,growx, wrap");

        panelAddStudent.add(labelAge);
        panelAddStudent.add(comboBoxAge,"pushx,growx,wrap");

        panelAddStudent.add(btnAddStudent,"span,pushx,growx");
        panelAddStudent.add(btnUpdate,"span,pushx,growx");
        panelAddStudent.add(btnDelete,"span,pushx,growx");
        panelAddStudent.add(btnClear,"span, pushx,growx,center,wrap");

        panelAddStudent.add(scrollPaneStudent,"span 2, push,grow");
    }

    private void addStudentEvent(){
        btnAddStudent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(validity()){
                    String name = inputName.getText().trim();
                    String age = comboBoxAge.getSelectedItem().toString();
                    int ageStudent = Integer.parseInt(age);
                    int id = student.getMaxID() + 1;
                    Student newStudent = new Student(ageStudent,name,id);
                    student.create(newStudent);
                    deleteRows();
                    setModelStudent();
                    clearField();
                } else {
                    displayDialog("Name needs to have at least 5 character and less than 20");
                }
            }
        });
    }
    private void selectRow(){
        tableStudent.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
            public void valueChanged(ListSelectionEvent event) {
                // do some actions here, for example
                // print first column value from selected row
                String id = tableStudent.getValueAt(tableStudent.getSelectedRow(), 0).toString();
                String name = tableStudent.getValueAt(tableStudent.getSelectedRow(), 1).toString();
                String age =  tableStudent.getValueAt(tableStudent.getSelectedRow(), 2).toString();
                System.out.println(age);
                inputName.setText(name);
                comboBoxAge.setSelectedIndex(Integer.parseInt(age) - 4);
            }
        });
    }

    private void updateStutent(){
        btnUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(inputName.getText().isEmpty()){
                    displayDialog("Select a row first!");
                } else {
                    if (validity()) {
                        String name = inputName.getText().trim();
                        String age = comboBoxAge.getSelectedItem().toString();
                        int ageStudent = Integer.parseInt(age);
                        String id = tableStudent.getValueAt(tableStudent.getSelectedRow(), 0).toString();
                        int idStudent = Integer.parseInt(id);
                        Student updateStudent = new Student(ageStudent, name, idStudent);
                        student.update(updateStudent);
                        deleteRows();
                        setModelStudent();
                        clearField();
                    } else {
                        displayDialog("Name needs to have at least 5 character and less than 20");
                    }
                }
            }
        });
    }

    private void clearEvent(){
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearField();
            }
        });
    }
    private void deleteEvent(){
        btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteStudent();
            }
        });
    }
    private void deleteStudent(){
        int index = tableStudent.getSelectedRow();
        int column = 0;
        if(index >=  0){
            String value = tableStudent.getModel().getValueAt(index, column).toString();
            student.delete(Integer.parseInt(value));
            studentModel.removeRow(index);
        } else {
            System.out.println("Error on delete");
            displayDialog("Select a row!");
        }
    }
    private void clearField(){
        inputName.setText("");
        comboBoxAge.setSelectedIndex(0);
    }
    private void addEvents(){
        addStudentEvent();
        clearEvent();
        deleteEvent();
        selectRow();
        updateStutent();
    }
    private boolean validity(){
        return !inputName.getText().trim().isEmpty() && inputName.getText().trim().length() >= 5 && inputName.getText().trim().length() <=  20;
    }

    private void displayDialog(String message){
        JOptionPane.showMessageDialog(null,message);
    }

    public void start(){
        initPrincipalFrame("Register Student");
        initPanelAddStudent("Add Student");
        initComponentAddStudent();
        addComponentAddStudent();
        addEvents();
        principalFrame.setVisible(true);
    }
}
