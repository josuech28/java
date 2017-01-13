package com.view.league;

import com.action.*;
import com.action.Action;
import com.action.league.ActionDeleteLeague;
import com.action.league.ActionGetAllLeague;
import com.model.League;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

/**
 * Created by joschinc on 1/2/17.
 */
public class ConsultLeagueView {
    private JPanel paneConsultLeague;
    private JTable tableLeague;
    private JScrollPane scrollPaneLeague;
    private DefaultTableModel defaultTableModelLeague;
    private JButton btnDelete;
    private com.action.league.ActionGetAllLeague action;

    public ConsultLeagueView(){
        initConsultLeagueView();
    }

    private  void initConsultLeagueView() {
        paneConsultLeague = new JPanel();
        paneConsultLeague.setLayout(new MigLayout("","[][]","[][]"));
        paneConsultLeague.setBorder(BorderFactory.createTitledBorder("List of Leagues"));
        initComponentConsultLeagueView();
    }
    private void initComponentConsultLeagueView(){
        btnDelete = new JButton("Delete");
        createModelConsultLeague();
        loadTableConsultLeague();
        addComponentConsultLeague();
        addEventDeleteLeague();
    }
    private void addComponentConsultLeague(){
        paneConsultLeague.add(btnDelete,"split 2,left,pushx,growx,wrap");
        paneConsultLeague.add(scrollPaneLeague,"push,grow,wrap");
    }
    private void createModelConsultLeague(){
        defaultTableModelLeague = new DefaultTableModel();
        defaultTableModelLeague.addColumn("ID");
        defaultTableModelLeague.addColumn("Name");
        defaultTableModelLeague.addColumn("Description");
        tableLeague = new JTable(defaultTableModelLeague);
        scrollPaneLeague = new JScrollPane(tableLeague);
    }
    private void addEventDeleteLeague(){
        btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteLeague();
            }
        });
    }

    private void deleteLeague(){
        int index = tableLeague.getSelectedRow();
        int column = 0;
        if(index >= 0){
            String idLeague = tableLeague.getModel().getValueAt(index,column).toString();
            League league = new League(Integer.parseInt(idLeague), "DEFAULT","DEFAULT");
            Action action = new ActionDeleteLeague(league);
            action.execute();
            System.out.println(idLeague + " id league");
            defaultTableModelLeague.removeRow(index);
        } else {
            createMessage("Please select a row first!");
        }
    }
    public void loadTableConsultLeague(){
        deleteRows();
        this.action = new ActionGetAllLeague();
        action.execute();
        List<League> leagues = action.getLeagues();
        for(League league: leagues){
            Object obj[] = new Object[]{league.getIdLeague(),league.getName(),league.getDescription()};
            defaultTableModelLeague.addRow(obj);
        }
    }
    public void deleteRows(){
        int rowCount = defaultTableModelLeague.getRowCount();
        for(int i = rowCount - 1; i >= 0; i--){
            defaultTableModelLeague.removeRow(i);
        }
    }
    private void createMessage(String message){
        JOptionPane.showMessageDialog(paneConsultLeague,message);
    }
    public void updateTable(){
        defaultTableModelLeague.fireTableDataChanged();
    }
    public JPanel getPaneConsultLeague(){
        return this.paneConsultLeague;
    }
}
