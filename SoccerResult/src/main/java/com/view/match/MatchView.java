package com.view.match;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

/**
 * Created by joschinc on 1/9/17.
 */
public class MatchView extends JFrame{
    private AddMatchView addMatchView;
    private ConsultMatchView consultMatchView;
    private JTabbedPane tab;

    public MatchView(){
        super("Match Module");
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dimension = tk.getScreenSize();
        int height = dimension.height;
        int width = dimension.width;
        this.setSize(width / 2, height / 2);
        this.setLocation(width / 4, height / 4);
        tab = new JTabbedPane();
        addMatchView = new AddMatchView();
        consultMatchView = new ConsultMatchView();
        addTabs();
        this.add(tab);
        addEventOnChangeTab();
        this.setVisible(true);
    }

    private void addTabs(){
        tab.add("Add",addMatchView.getPanelAddMatch());
        tab.add("Consult",consultMatchView.getPanelConsultMatch());
    }
    private void addEventOnChangeTab(){
        tab.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if(tab.getSelectedIndex() == 1){
                    consultMatchView.fillTable();
                }
            }
        });
    }
}
