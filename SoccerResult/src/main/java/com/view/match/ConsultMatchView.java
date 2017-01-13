package com.view.match;

import com.model.Match;
import com.model.Team;
import com.service.*;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.List;

/**
 * Created by joschinc on 1/9/17.
 */
public class ConsultMatchView {
    private JPanel panelConsultMatch;
    private DefaultTableModel model;
    private JTable tableMatch;
    private JScrollPane scrollPaneMatch;

    public ConsultMatchView(){
        initPanelConsultMatch();

    }

    private void initPanelConsultMatch(){
        panelConsultMatch = new JPanel();
        panelConsultMatch.setBorder(BorderFactory.createTitledBorder("Consult Match"));
        panelConsultMatch.setLayout(new MigLayout("","[]","[]"));
        initComponent();
        fillTable();
        addComponent();
    }

    private void initComponent(){
        model = new DefaultTableModel();
        tableMatch = new JTable(model);
        scrollPaneMatch = new JScrollPane(tableMatch);
        model.addColumn("Match");
        model.addColumn("Home Player");
        model.addColumn("Away Player");
        model.addColumn("Home");
        model.addColumn("Away");
        model.addColumn("Home Goals");
        model.addColumn("Away Goal");
    }

    public void fillTable(){
        deleteRows();
        ServiceList<Match> serviceList = new ServiceListMatchImpl();
        ServiceGet<Team> serviceGetTeam = new ServiceGetTeamImpl();
        List<Match> matches =serviceList.getList();
        for(Match match: matches){
            Team home = new Team(match.getHomeTeam(),"DEFAULT",1);
            Team homeTeam = serviceGetTeam.get(home);
            Team away = new Team(match.getAwayTeam(),"DEFAULT",1);
            Team awayTeam = serviceGetTeam.get(away);
            Object row[] = new Object[]{match.getIdMatch(), match.getHomePlayer(),match.getAwayPlayer(),homeTeam.getName(),awayTeam.getName(),match.getGolHomePlayer(),match.getGoalAwayPlayer()};
            model.addRow(row);
        }
    }

    private void deleteRows(){
        try {
            model.getDataVector().removeAllElements();
            model.fireTableDataChanged();
            /*
            int countRows = tableMatch.getRowCount();
            if(countRows > 0) {
                for (int i = countRows - 1; i >= 0; i--) {
                    if(tableMatch.getModel().getValueAt(i,0).toString() != null){
                        tableMatch.remove(i);
                    }

                }
            }
            */
        }catch (Exception e){
            System.out.println("Exception in  deleteRows " + e.toString());
        }
    }

    private void addComponent(){
        panelConsultMatch.add(scrollPaneMatch,"push,grow,wrap");
    }

    public JPanel getPanelConsultMatch(){
        return panelConsultMatch;
    }
}
