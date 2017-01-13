package com.view.team;

import com.action.*;
import com.action.Action;
import com.action.team.ActionAddTeam;
import com.model.League;
import com.model.Team;
import com.service.ServiceGet;
import com.service.ServiceList;
import com.service.ServiceListLeagueImpl;
import com.service.ServiceListTeamImpl;
import com.util.ValidityTextField;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by joschinc on 1/3/17.
 */
public class AddTeamView {
    private JPanel panelAddTeam;
    private JLabel nameLabel;
    private JTextField name;
    private JLabel leagueLabel;
    private JComboBox  league;
    private JButton btnAddTeam;
    private JButton btnClearField;


    public AddTeamView(){
        initPanelAddTeam();
    }

    private void initPanelAddTeam(){
        panelAddTeam = new JPanel();
        panelAddTeam.setBorder(BorderFactory.createTitledBorder("Add Teams"));
        panelAddTeam.setLayout(new MigLayout("","[][]","[][][]"));
        initComponent();
        initLeague();
        addComponent();
        addEvents();
    }

    private void initComponent(){
        nameLabel = new JLabel("Team");
        name = new JTextField(20);

        btnAddTeam = new JButton("Add");
        btnClearField = new JButton("Cancel");

        leagueLabel = new JLabel("League");
        initLeague();
    }

    private void addComponent(){
        panelAddTeam.add(leagueLabel,"");
        panelAddTeam.add(league,",growx,pushx,wrap");

        panelAddTeam.add(nameLabel,"");
        panelAddTeam.add(name,"pushx,growx,wrap");

        panelAddTeam.add(btnAddTeam,"pushx,growx,center");
        panelAddTeam.add(btnClearField,"pushx,growx,center,wrap");
    }

    private void initLeague(){
        league = new JComboBox();
        ServiceList<League> serviceList = new ServiceListLeagueImpl();
        List<League> leagues = serviceList.getList();
        league.setModel(new DefaultComboBoxModel(leagues.toArray()));
    }

    private void addEventAddTeam(){
        btnAddTeam.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(validityField()){
                    if(createTeam() != null) {
                        Action action = new ActionAddTeam(createTeam());
                        action.execute();
                        clearField();
                        createMessage("Team success!");
                    } else {
                        createMessage("Error on save Team, Needs a League first!");
                    }
                } else {
                    createMessage("Name needs to have at least 3 characters!");
                }
            }
        });
    }

    private void addEventClearField(){
        btnClearField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearField();
            }
        });
    }

    private void addEvents(){
        addEventAddTeam();
        addEventClearField();
    }

    private Team createTeam(){
        try {
            int idTemp = 0;
            String nameTeam = name.getText().trim();
            League leagueId = (League) league.getModel().getSelectedItem();
            if (leagueId != null) {
                Team newTeam = new Team(idTemp, nameTeam, leagueId.getIdLeague());
                return newTeam;
            } else {
                return null;
            }
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }

    private void createMessage(String message){
        JOptionPane.showMessageDialog(panelAddTeam,message);
    }
    private boolean validityField(){
        ValidityTextField validator = new ValidityTextField();
        return validator.validityTextFieldGeneral(name) && validator.validityTextFieldLength(name,3);
    }

    private void clearField(){
        name.setText("");
        if(league.getItemCount() > 0 ){
            league.setSelectedIndex(0);
        }

    }

    public JPanel getPanelAddTeam(){
        return this.panelAddTeam;
    }
}
