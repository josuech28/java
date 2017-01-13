package com.view.match;

import com.action.*;
import com.action.match.ActionAddMatch;
import com.model.League;
import com.model.Match;
import com.model.Player;
import com.model.Team;
import com.service.*;
import net.miginfocom.swing.MigLayout;
import sun.security.krb5.internal.PAData;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by joschinc on 1/9/17.
 */
public class AddMatchView {
    private JPanel panelAddMatch;
    private JLabel labelHome;
    private JLabel labelAway;
    private JLabel labelHomePlayer;
    private JLabel labelAwayPlayer;
    private JLabel labelHomeLeague;
    private JLabel labelAwayLeague;
    private JLabel labelHomeTeam;
    private JLabel labelAwayTeam;
    private JLabel labelHomeGoal;
    private JLabel labelAwayGoal;
    private JComboBox homePlayer;
    private JComboBox awayPlayer;
    private JComboBox homeLeague;
    private JComboBox awayLeague;
    private JComboBox homeTeam;
    private JComboBox awayTeam;
    private JComboBox homeGoal;
    private JComboBox awayGoal;
    private JButton btnAddMatch;
    private JButton btnClearMatch;

    public AddMatchView(){
        initPanelAddMatch();
    }
    private void initPanelAddMatch(){
        panelAddMatch = new JPanel();
        panelAddMatch.setBorder(BorderFactory.createTitledBorder("Add Match"));
        panelAddMatch.setLayout(new MigLayout("",""));
        initComponent();
        addComponent();
        initComboBox();
        addEvent();
    }

    private void initComponent(){
        labelHome = new JLabel("Home");
        labelAway = new JLabel("Away");

        labelHomePlayer = new JLabel("Player");
        labelAwayPlayer = new JLabel("Player");

        labelHomeLeague = new JLabel("League");
        labelAwayLeague = new JLabel("League");

        labelHomeTeam = new JLabel("Team");
        labelAwayTeam = new JLabel("Team");

        labelHomeGoal = new JLabel("Goal");
        labelAwayGoal = new JLabel("Goal");

        homePlayer = new JComboBox();
        awayPlayer = new JComboBox();

        homeLeague = new JComboBox();
        awayLeague = new JComboBox();

        homeTeam = new JComboBox();
        awayTeam = new JComboBox();

        homeGoal = new JComboBox();
        awayGoal = new JComboBox();

        btnAddMatch = new JButton("Add");
        btnClearMatch = new JButton("Clear");
    }

    private void addComponent(){
        panelAddMatch.add(labelHome,"span 2,pushx,growx");
        panelAddMatch.add(labelAway,"span 2,pushx,growx,wrap");

        panelAddMatch.add(labelHomePlayer,"span 2,pushx,growx");
        panelAddMatch.add(labelAwayPlayer,"span 2,pushx,growx,wrap");

        panelAddMatch.add(homePlayer,"span 2,pushx,growx");
        panelAddMatch.add(awayPlayer,"span 2,pushx,growx,wrap");

        panelAddMatch.add(labelHomeLeague,"span 2,pushx,growx");
        panelAddMatch.add(labelAwayLeague,"span 2,pushx,growx,wrap");

        panelAddMatch.add(homeLeague,"span 2,pushx,growx");
        panelAddMatch.add(awayLeague,"span 2,pushx,growx,wrap");

        panelAddMatch.add(labelHomeTeam,"span 2,pushx,growx");
        panelAddMatch.add(labelAwayTeam,"span 2,pushx,growx,wrap");

        panelAddMatch.add(homeTeam,"span 2,pushx,growx");
        panelAddMatch.add(awayTeam,"span 2,pushx,growx,wrap");


        panelAddMatch.add(labelHomeGoal,"span 2, pushx,growx");
        panelAddMatch.add(labelAwayGoal,"span 2, pushx,growx,wrap");

        panelAddMatch.add(homeGoal,"span 2, pushx,growx");
        panelAddMatch.add(awayGoal,"span 2, pushx,growx,wrap");


        panelAddMatch.add(btnAddMatch,"span 2, pushx,growx");
        panelAddMatch.add(btnClearMatch,"span 2, pushx,growx,wrap");


    }

    private void initLeague(){
        ServiceList<League> serviceList = new ServiceListLeagueImpl();
        List<League> leagues = serviceList.getList();
        homeLeague.setModel(new DefaultComboBoxModel(leagues.toArray()));
        awayLeague.setModel(new DefaultComboBoxModel(leagues.toArray()));
    }

    private void initPlayer(){

        ServiceList<Player> service = new ServiceListPlayerImpl();
        List<Player> players = service.getList();
        homePlayer.setModel(new DefaultComboBoxModel(players.toArray()));
        awayPlayer.setModel(new DefaultComboBoxModel(players.toArray()));
    }
    private void initTeam(){
        fillHomeTeam();
        fillAwayTeam();
    }
    private void fillHomeTeam(){
        ServiceListTeamByIdLeagueImpl service = new ServiceListTeamByIdLeagueImpl();
        League leagueId = (League) homeLeague.getModel().getSelectedItem();
        List<Team> teams = service.get(leagueId.getIdLeague());
        homeTeam.setModel(new DefaultComboBoxModel(teams.toArray()));
    }

    private void fillAwayTeam(){
        ServiceListTeamByIdLeagueImpl service = new ServiceListTeamByIdLeagueImpl();
        League leagueId = (League) awayLeague.getModel().getSelectedItem();
        List<Team> teams = service.get(leagueId.getIdLeague());
        awayTeam.setModel(new DefaultComboBoxModel(teams.toArray()));
    }

    private void initHomeGoal(){
        List<Integer> goal = new ArrayList<Integer>();
        for(int i = 0; i < 25; i++){
            goal.add(i);
        }
        Collections.sort(goal);
        homeGoal.setModel(new DefaultComboBoxModel(goal.toArray()));
        awayGoal.setModel(new DefaultComboBoxModel(goal.toArray()));
    }

    private void initComboBox(){
        initPlayer();
        initLeague();
        initTeam();
        initHomeGoal();
    }

    private void addEventOnChangeHomeLeague(){
        homeLeague.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fillHomeTeam();
            }
        });
    }

    private void addEventOnChangeAwayLeague(){
        awayLeague.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fillAwayTeam();
            }
        });
    }

    private void addEventClearField(){
        btnClearMatch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearField();
            }
        });
    }

    private void addEventSaveMatch(){
        btnAddMatch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Player homeUser = (Player) homePlayer.getModel().getSelectedItem();
                Player awayUser = (Player) awayPlayer.getModel().getSelectedItem();
                if(homeUser.getIdPlayer() == awayUser.getIdPlayer()){
                    createMessage("Select different players!");
                } else {
                    addMatch();
                    createMessage("Match Success");
                    clearField();

                }
            }
        });
    }
    private void clearField(){
        if(homePlayer.getItemCount() >= 0){
            homePlayer.setSelectedIndex(0);
        }

        if(awayPlayer.getItemCount() >= 0){
            awayPlayer.setSelectedIndex(0);
        }

        if(homeLeague.getItemCount() >= 0){
            homeLeague.setSelectedIndex(0);
        }

        if(awayLeague.getItemCount() >= 0){
            awayLeague.setSelectedIndex(0);
        }

        if(homeTeam.getItemCount() >= 0){
            homeTeam.setSelectedIndex(0);
        }

        if(awayTeam.getItemCount() >= 0){
            awayTeam.setSelectedIndex(0);
        }
        if(homeGoal.getItemCount() >= 0){
            homeGoal.setSelectedIndex(0);
        }

        if(awayGoal.getItemCount() >= 0){
            awayGoal.setSelectedIndex(0);
        }
    }

    private void addMatch(){
        Player homeUser = (Player) homePlayer.getModel().getSelectedItem();
        Player awayUser = (Player) awayPlayer.getModel().getSelectedItem();

        League homeLeagueSelect = (League) homeLeague.getModel().getSelectedItem();
        League awayLeagueSelect = (League) awayLeague.getModel().getSelectedItem();

        Team homeTeamSelect = (Team) homeTeam.getModel().getSelectedItem();
        Team awayTeamSelect = (Team) awayTeam.getModel().getSelectedItem();

        Object homeGoalSelect = homeGoal.getSelectedItem();
        Object awayGoalSelect = awayGoal.getSelectedItem();

        Match match = new Match(0,homeUser.getIdPlayer(),awayUser.getIdPlayer(),Integer.parseInt(homeGoalSelect.toString()),Integer.parseInt(awayGoalSelect.toString()),homeTeamSelect.getIdTeam(),awayTeamSelect.getIdTeam(),homeLeagueSelect.getIdLeague(),awayLeagueSelect.getIdLeague());
        com.action.Action action = new ActionAddMatch(match);
        action.execute();
        ResultService resultService = new ResultServiceImpl();
        UpdatePlayerStadisticsService serviceUpdatePlayer = new UpdatePlayerStadisticsServiceImpl();
        serviceUpdatePlayer.updatePlayer(resultService.getResult(match));

    }

    private void addEvent(){
        addEventOnChangeHomeLeague();
        addEventOnChangeAwayLeague();
        addEventClearField();
        addEventSaveMatch();
    }

    public JPanel getPanelAddMatch(){
        return panelAddMatch;
    }

    private void createMessage(String message){
        JOptionPane.showMessageDialog(panelAddMatch,message);
    }

}
