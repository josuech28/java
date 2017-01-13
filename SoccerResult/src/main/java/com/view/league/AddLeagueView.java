package com.view.league;

import com.action.*;
import com.action.league.ActionAddLeague;
import com.model.League;
import com.util.ValidityTextField;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by joschinc on 1/2/17.
 */
public class AddLeagueView {
    private JLabel nameLabel;
    private JLabel descriptionLabel;
    private JTextField name;
    private JTextArea description;
    private JButton btnAddLeague;
    private JButton btnClearLeague;
    private JPanel panelAddLeague;
    private com.action.Action action;

    public AddLeagueView(){

        initPanelAddLeague();
    }

    private void initPanelAddLeague(){
        panelAddLeague = new JPanel();
        panelAddLeague.setBorder(BorderFactory.createTitledBorder("Add League"));
        panelAddLeague.setLayout(new MigLayout("","[][]","[][][]"));
        initComponentAddLeague();
        addComponentAddLeague();
        addEvents();
    }
    private void initComponentAddLeague(){
        nameLabel = new JLabel("League     ");
        descriptionLabel = new JLabel("Description");
        name = new JTextField(20);
        description = new JTextArea(5,20);
        description.setBorder(BorderFactory.createEtchedBorder());

        btnAddLeague = new JButton("Add");
        btnClearLeague = new JButton("Clear");
    }

    private void addComponentAddLeague(){
        panelAddLeague.add(nameLabel,"split");
        panelAddLeague.add(name,"growx,pushx,wrap");

        panelAddLeague.add(descriptionLabel,"split");
        panelAddLeague.add(description,"grow,push,wrap");

        panelAddLeague.add(btnAddLeague,"split,center,pushx,growx");
        panelAddLeague.add(btnClearLeague,"center,pushx,growx,wrap");
    }

    private void addEventClear(){
        btnClearLeague.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearFields();
            }
        });
    }

    private void addEventAddLeague(){
        btnAddLeague.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(validityField()) {
                    action = new ActionAddLeague(createLeague());
                    action.execute();
                    clearFields();
                    createMessage("League created success!");
                } else
                {
                    createMessage("Name need to had al least 3 character!");
                    name.grabFocus();
                }
            }
        });
    }

    private void addEvents(){
        addEventAddLeague();
        addEventClear();
    }
    private League createLeague(){
        String nameLeague = name.getText().trim();
        String descriptionLeague = description.getText().trim();
        int tempId = 1;
        League league = new League(tempId,nameLeague,descriptionLeague);
        return league;
    }
    private void createMessage(String message){
        JOptionPane.showMessageDialog(panelAddLeague,message);
    }
    private boolean validityField(){
        ValidityTextField validator = new ValidityTextField();
        return validator.validityTextFieldGeneral(name) && validator.validityTextFieldLength(name,3);
    }
    private void clearFields(){
        name.setText("");
        description.setText("");
    }

    public JPanel getPanelAddLeague(){
        return this.panelAddLeague;
    }
}
