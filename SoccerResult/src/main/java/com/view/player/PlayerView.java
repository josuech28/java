package com.view.player;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

/**
 * Created by joschinc on 1/9/17.
 */
public class PlayerView extends JFrame{
    private AddPlayerView addPlayerView;
    private ConsultPlayerView consultPlayerView;
    private JTabbedPane tab;

    public PlayerView(){
        super("Module Player");
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dimension = tk.getScreenSize();
        int height = dimension.height;
        int width = dimension.width;
        this.setSize(width / 2, height / 2);
        this.setLocation(width / 4, height / 4);
        tab = new JTabbedPane();
        addPlayerView = new AddPlayerView();
        consultPlayerView = new ConsultPlayerView();
        addTabs();
        this.add(tab);
        addEventOnTab();
        this.setVisible(true);
    }

    private void addTabs(){
        tab.addTab("Add",addPlayerView.getPanelAddPlayer());
        tab.addTab("Consult",consultPlayerView.getPanelConsultPlayer());
    }

    private void addEventOnTab(){
        tab.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if(tab.getSelectedIndex() == 1){
                    consultPlayerView.fillTablePlayer();
                }
            }
        });
    }
}
