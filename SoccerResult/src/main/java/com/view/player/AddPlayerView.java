package com.view.player;

import com.action.*;
import com.action.player.ActionAddPlayer;
import com.model.Player;
import com.service.ServiceGet;
import com.service.ServiceGetPlayerImpl;
import com.sun.java.swing.plaf.motif.MotifInternalFrameTitlePane;
import com.util.ValidityTextField;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import javax.swing.Action;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by joschinc on 1/9/17.
 */
public class AddPlayerView {
    private JPanel panelAddPlayer;
    private JLabel nameLabel;
    private JTextField name;
    private JButton btnAddPlayer;
    private JButton btnClear;
    private final int defaultStatus = 0;

    public AddPlayerView(){
        initPanelAddPlayer();
    }

    private void initPanelAddPlayer(){
        panelAddPlayer = new JPanel();
        panelAddPlayer.setBorder(BorderFactory.createTitledBorder("Add Player"));
        panelAddPlayer.setLayout(new MigLayout("","[][]","[][]"));
        initComponent();
        addComponent();
        addPlayerEvent();
        clearEventBtn();
    }

    private void initComponent(){
        nameLabel = new JLabel("User");
        name = new JTextField(20);
        btnAddPlayer = new JButton("Add");
        btnClear = new JButton("Clear");
    }

    private void addComponent(){
        panelAddPlayer.add(nameLabel,"split");
        panelAddPlayer.add(name,"pushx,growx,wrap");

        panelAddPlayer.add(btnAddPlayer,"split");
        panelAddPlayer.add(btnClear,"wrap");
    }
    private void addPlayerEvent(){
        btnAddPlayer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(validityId()){
                    if(addPlayer()){
                        clearField();
                        createMessage("Player Sucess");
                    } else {
                        createMessage("User ID is register! Select other ID");
                    }
                } else {
                    createMessage("User ID need to have at least 5 character!");
                }

            }
        });
    }

    private void clearEventBtn(){
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearField();
            }
        });
    }
    private void clearField(){
        name.setText("");
    }

    private boolean addPlayer() {
        String  userId = name.getText().trim();
        if (isUserIdValid() == null) {
            Player newPlayer = new Player(userId, defaultStatus, defaultStatus, defaultStatus, defaultStatus, defaultStatus, defaultStatus);
            com.action.Action action = (com.action.Action) new ActionAddPlayer(newPlayer);
            action.execute();
            return true;
        } else {
            return false;
        }
    }

    private Player isUserIdValid(){
        String  userId = name.getText().trim();
        Player playerExist = new Player(userId,defaultStatus,defaultStatus,defaultStatus,defaultStatus,defaultStatus,defaultStatus);
        ServiceGet<Player> serviceGet = new ServiceGetPlayerImpl();
        playerExist = serviceGet.get(playerExist);
        return playerExist;
    }

    private boolean validityId(){
        ValidityTextField validator = new ValidityTextField();
        return validator.validityTextFieldLength(name,5);
    }

    private void createMessage(String message){
        JOptionPane.showMessageDialog(panelAddPlayer,message);
    }

    public JPanel getPanelAddPlayer(){
        return this.panelAddPlayer;
    }
}
