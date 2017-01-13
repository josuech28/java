package com.view.team;

import com.action.*;
import com.action.Action;
import com.action.team.ActionDeleteTeam;
import com.model.League;
import com.model.Team;
import com.service.*;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

/**
 * Created by joschinc on 1/3/17.
 */
public class ConsultTeamView {
    private JPanel panelConsultTeam;
    private DefaultTableModel modelTeam;
    private JTable tableTeam;
    private JScrollPane scrollPane;
    private JButton btnDelete;
    private ServiceList<Team> serviceList;
    private ServiceGet<League> serviceGetLeague = new ServiceGetLeagueImpl();

    public ConsultTeamView(){
        initPanelConsultTeam();
    }
    private void initPanelConsultTeam(){
        panelConsultTeam = new JPanel();
        panelConsultTeam.setBorder(BorderFactory.createTitledBorder("Consult Teams"));
        panelConsultTeam.setLayout(new MigLayout("","[]","[][]"));
        initComponent();
        addComponent();
        addEventDelete();
    }

    private void initComponent(){
        modelTeam = new DefaultTableModel();
        modelTeam.addColumn("ID");
        modelTeam.addColumn("Team");
        modelTeam.addColumn("League");
        tableTeam = new JTable(modelTeam);
        scrollPane = new JScrollPane(tableTeam);
        btnDelete = new JButton("Delete");
        fillTable();
    }

    public void fillTable(){
        deleteRows();
        this.serviceList = new ServiceListTeamImpl();
        List<Team> teams = serviceList.getList();
        for(Team team: teams){
            League leagueTemp = new League(team.getLigue(),"DEFAULT","DEFAULT");
            League findLeague = null;
            findLeague = serviceGetLeague.get(leagueTemp);
            Object obj[] = new Object[]{team.getIdTeam(),team.getName(),findLeague.getName()};
            modelTeam.addRow(obj);
        }
    }

    private void addComponent(){
        panelConsultTeam.add(btnDelete,"pushx,growx,wrap");
        panelConsultTeam.add(scrollPane,"push,grow,wrap");
    }

    private void addEventDelete(){
        btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteTeam();
            }
        });
    }

    private void deleteTeam(){
        int index = tableTeam.getSelectedRow();
        int row = 0; // Id of team
        if(index >= 0){
            String idTeam = tableTeam.getModel().getValueAt(index,row).toString();
            Team tempTeam = new Team(Integer.parseInt(idTeam),"DEFAULT",0);
            Action action = new ActionDeleteTeam(tempTeam);
            action.execute();
            modelTeam.removeRow(index);
            createMessage("Remove Team success!");
            System.out.println("Removing id team..." + idTeam );
        } else {
            createMessage("Select a row first!");
        }
    }

    private void deleteRows(){
        int rows = modelTeam.getRowCount();
        for(int i = rows - 1; i >= 0; i--){
            modelTeam.removeRow(i);
        }
    }

    private void createMessage(String message){
        JOptionPane.showMessageDialog(panelConsultTeam,message);
    }

    public JPanel getPanelConsultTeam(){
        return this.panelConsultTeam;
    }

}