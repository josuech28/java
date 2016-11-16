package com.view;

import com.model.Calculator;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.text.Document;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.geom.Arc2D;
import java.math.BigDecimal;
import java.util.EventListener;

/**
 * Created by joschinc on 11/16/16.
 */
public class CalculatorView {
    private   JFrame frame;
    private  static JTextField field;
    private  JPanel contentPanel;
    private  JPanel displayPanel;
    private  JPanel buttonPanel;
    private static boolean start = true;
    private static BigDecimal result = new BigDecimal("0");
    private static String lastCommand = "=";
    private static Calculator  calculator = new Calculator();
    private static ActionListener insert = new Insert();
    private static ActionListener deleteCommand = new Delete();
    private static ActionListener command = new OperationCommand();
    private static ActionListener dothCommand = new Doth();


    public CalculatorView(){
        this.frame = new JFrame("Calculator App");
        this.field = new JTextField();
        this.contentPanel = new JPanel();
        this.displayPanel = new JPanel();
        this.buttonPanel = new JPanel();
        this.initializeComponents();
    }

    private void setContentPanel(){
        this.contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        this.contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.X_AXIS));
        this.contentPanel.add(displayPanel,BorderLayout.WEST);
        this.contentPanel.add(buttonPanel,BorderLayout.EAST);

    }

    private void setField(){
        this.field.setText("0");
        this.field.setHorizontalAlignment(SwingConstants.RIGHT);
        this.field.setEditable(false);
        this.field.setColumns(13);
        displayPanel.add(field);

    }
    private void setButtonPanel(){
        this.buttonPanel.setLayout(new GridLayout(5,5,5,5));
    }

    private void setButtons(){

        //First Row
        JButton number7 = new JButton("7");
        number7.addActionListener(insert);

        JButton number8 = new JButton("8");
        number8.addActionListener(insert);

        JButton number9 = new JButton("9");
        number9.addActionListener(insert);

        JButton divide = new JButton("/");
	    divide.addActionListener(command);

        //Second Row
        JButton number4 = new JButton("4");
	    number4.addActionListener(insert);

        JButton number5 = new JButton("5");
	    number5.addActionListener(insert);

	    JButton number6 = new JButton("6");
        number6.addActionListener(insert);

        JButton multiply = new JButton("*");
        multiply.addActionListener(command);

        //Third Rown
        JButton number1 = new JButton("1");
	    number1.addActionListener(insert);

        JButton number2 = new JButton("2");
	    number2.addActionListener(insert);

	    JButton number3 = new JButton("3");
	    number3.addActionListener(insert);

	    JButton subtract = new JButton("-");
	    subtract.addActionListener(command);

        //Four Row
        JButton number0 = new JButton("0");
	    number0.addActionListener(insert);

	    JButton dot = new JButton(".");
        dot.addActionListener(dothCommand);

	    JButton equal = new JButton("=");
	    equal.addActionListener(command);

        JButton add = new JButton("+");
	    add.addActionListener(command);

        JButton module = new JButton("%");
        module.addActionListener(command);

        JButton delete = new JButton("C");
        delete.addActionListener(deleteCommand);

        addButton(number7,buttonPanel);
        addButton(number8,buttonPanel);
        addButton(number9,buttonPanel);
        addButton(divide,buttonPanel);

        addButton(number4,buttonPanel);
        addButton(number5,buttonPanel);
        addButton(number6,buttonPanel);
        addButton(multiply,buttonPanel);

        addButton(number1,buttonPanel);
        addButton(number2,buttonPanel);
        addButton(number3,buttonPanel);
        addButton(subtract,buttonPanel);

        addButton(number0,buttonPanel);
        addButton(dot,buttonPanel);
        addButton(equal,buttonPanel);
        addButton(add,buttonPanel);

        addButton(module,buttonPanel);
        addButton(delete,buttonPanel);
    }

    private void addButton(JButton button,JPanel panel){
        panel.add(button);
    }

    private void setFrame(){
        frame.setLayout(new GridLayout(2,1));

        frame.add(contentPanel,BorderLayout.CENTER);
        frame.pack();
        frame.setMaximumSize(new Dimension(900, 400));
        frame.setMinimumSize(new Dimension(600, 300));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private void initializeComponents(){
        this.setContentPanel();
        this.setField();
        this.setButtonPanel();
        this.setButtons();
        this.setFrame();
    }


    private static class Insert implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String input = e.getActionCommand();

            String text = field.getText();
            if (start) {

                field.setText("");

                start = false;
            }
            if (text.startsWith(".")) {

                field.setText("0" + field.getText() + input);

            } else if (text.startsWith("-0.") || text.startsWith("0.")) {

                field.setText(field.getText() + input);

            } else if (text.startsWith("-0")) {

                field.setText("-" + input);

            } else if (text.startsWith("0")) {
                field.setText(input);
            } else {
                field.setText(field.getText() + input);
            }
        }

    }

    public static void calculate(BigDecimal x) {
        char operator = lastCommand.charAt(0);
        switch (operator) {
            case '+':
                result = calculator.add(result,x);
                break;
            case '-':
                result = calculator.subtract(result,x);
                break;
            case '*':
                result = calculator.multiply(result,x);
                break;
            case '/':
                result = calculator.divide(result,x);
                break;
            case '%':
                result = calculator.module(result,x);
            case '=':
                result = x;
                break;
        }
        field.setText("" + result);
    }
    private static class Delete implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            field.setText("0");
            result= result.ZERO;
            start = true;
        }
    }

    private static class Doth implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String text = field.getText();
            if(!start){
                if(!text.contains(".")) {
                    text += ".";
                    field.setText(text);
                    start = false;
                }
            }
        }
    }

    private static class OperationCommand implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String operation = e.getActionCommand();
            // First number or commands start of line
            if(start){
                if(operation.equals("-")){
                    field.setText(operation);
                    start = false; // contains - and not first element
                } else {
                    lastCommand = operation;
                }
            } else {
                calculate(new BigDecimal(field.getText()));
                lastCommand = operation;
                start = true;
            }
        }
    }
    private static class ResizeFrame implements ComponentListener{
        public void componentResized(ComponentEvent e){

        }

        public void componentMoved(ComponentEvent e){

        }

        public void componentHidden(ComponentEvent e){

        }
        public void componentShown(ComponentEvent e){

        }
    }
}
