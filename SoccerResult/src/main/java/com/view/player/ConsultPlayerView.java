package com.view.player;

import com.action.*;
import com.action.player.ActionDeletePlayer;
import com.model.Player;
import com.service.ServiceGet;
import com.service.ServiceList;
import com.service.ServiceListPlayerImpl;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

/**
 * Created by joschinc on 1/9/17.
 */
public class ConsultPlayerView {
    private JPanel panelConsultPlayer;
    private JButton btnDeletePlayer;
    private JTable tablePlayer;
    private JScrollPane scrollPanePlayer;
    private DefaultTableModel model;

    public ConsultPlayerView(){
        initPanelConsultPlayer();
    }

    private void initPanelConsultPlayer(){
        panelConsultPlayer = new JPanel();
        panelConsultPlayer.setBorder(BorderFactory.createTitledBorder("Consult Players"));
        panelConsultPlayer.setLayout(new MigLayout("","[][]","[]"));
        initComponent();
        addComponent();
        addEventDeletePlayer();
    }

    private void initComponent(){
        String collumName[] = {"Player",""};
        btnDeletePlayer = new JButton("Delete");
        model = new DefaultTableModel();
        model.addColumn("Player");
        model.addColumn("Games");
        model.addColumn("Win");
        model.addColumn("Lost");
        model.addColumn("Tie");
        model.addColumn("GF");
        model.addColumn("GA");
        tablePlayer = new JTable(model);
        scrollPanePlayer = new JScrollPane(tablePlayer);
    }

    private void addComponent(){
        panelConsultPlayer.add(btnDeletePlayer,"pushx,growx,wrap");
        panelConsultPlayer.add(scrollPanePlayer,"grow,push,wrap");
        fillTablePlayer();
    }

    public void fillTablePlayer(){
        deleteRows();
        ServiceList<Player> service = new ServiceListPlayerImpl();
        List<Player> players = service.getList();
        for(Player player: players){
            Object object[] = new Object[]{player.getIdPlayer(),player.getMatchPlayed(),player.getMatchWon(),player.getMatchLost(),player.getMatchTied(),player.getGoalFavor(),player.getGoalAgainst()};
            model.addRow(object);
        }
    }

    private void addEventDeletePlayer(){
        btnDeletePlayer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deletePlayer();
            }
        });
    }

    private void deletePlayer(){
        int index = tablePlayer.getSelectedRow();
        int colmn = 0;
        if(index >= 0){
            String idPlayer = tablePlayer.getModel().getValueAt(index,colmn).toString();
            Player player = new Player(idPlayer,0,0,0,0,0,0);
            com.action.Action deletePlayer = new ActionDeletePlayer(player);
            deletePlayer.execute();
            model.removeRow(index);

        } else {
            createMessage("Select a row fisrt!");
        }
    }


    private void deleteRows(){
        int rows = model.getRowCount();
        for(int i = rows - 1; i >= 0; i--){
            model.removeRow(i);
        }
    }
    private void createMessage(String message){
        JOptionPane.showMessageDialog(panelConsultPlayer,message);
    }

    public JPanel getPanelConsultPlayer(){
        return  this.panelConsultPlayer;
    }
}
