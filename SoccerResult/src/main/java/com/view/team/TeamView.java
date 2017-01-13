package com.view.team;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

/**
 * Created by joschinc on 1/3/17.
 */
public class TeamView extends JFrame {
    private AddTeamView panelAddTeamView;
    private ConsultTeamView panelConsultTeamView;
    private JTabbedPane tab;

    public TeamView() {
        super("Module Team");
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension screenSize = tk.getScreenSize();
        int height = screenSize.height;
        int width = screenSize.width;
        this.setSize(width / 2, height / 2);
        this.setLocation(width / 4, height / 4);
        panelAddTeamView = new AddTeamView();
        panelConsultTeamView = new ConsultTeamView();
        tab = new JTabbedPane();
        addTab();
        this.add(tab);
        addEventOnTab();
        this.setVisible(true);
    }

    private void addTab() {

        tab.addTab("Add Team", panelAddTeamView.getPanelAddTeam());
        tab.addTab("Consult Team", panelConsultTeamView.getPanelConsultTeam());
    }

    private void addEventOnTab() {
        tab.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if (tab.getSelectedIndex() == 1) {
                    panelConsultTeamView.fillTable();

                }
            }
        });
    }
}
