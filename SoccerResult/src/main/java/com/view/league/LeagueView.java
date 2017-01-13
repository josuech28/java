package com.view.league;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

/**
 * Created by joschinc on 1/2/17.
 */
public class LeagueView extends JFrame {
    private AddLeagueView addLeagueView;
    private ConsultLeagueView consultLeagueView;
    private JTabbedPane flage;

    public LeagueView(){
        super("Module League");
        this.setVisible(true);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        this.setSize(screenWidth / 2, screenHeight / 2);
        this.setLocation(screenWidth / 4, screenHeight / 4);
        flage = new JTabbedPane();
        addLeagueView = new AddLeagueView();
        consultLeagueView = new ConsultLeagueView();
        addFlange();
        addEventOnTab();
        this.add(flage);

    }

    private void addFlange(){
        flage.addTab("Add League",addLeagueView.getPanelAddLeague());
        flage.addTab("Consult League",consultLeagueView.getPaneConsultLeague());
    }

    private void addEventOnTab(){
        flage.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if(flage.getSelectedIndex() == 1){
                    consultLeagueView.loadTableConsultLeague();

                }
            }
        });
    }
}
