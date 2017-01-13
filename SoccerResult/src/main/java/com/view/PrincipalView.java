package com.view;

import com.model.League;
import com.view.league.LeagueView;
import com.view.match.ConsultMatchView;
import com.view.match.MatchView;
import com.view.player.PlayerView;
import com.view.team.TeamView;
import net.miginfocom.swing.MigLayout;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

/**
 * Created by joschinc on 1/2/17.
 */
public class PrincipalView extends JFrame {
    private JButton btnLeague;
    private JButton btnTeam;
    private JButton btnPlayer;
    private JButton btnMatch;
    private ConsultMatchView matchView;
    private JPanel container;
    private JPanel panelButton;
    public PrincipalView(){
        super("Soccer Result");
        this.setVisible(true);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        this.setLocation(screenWidth / 4, screenHeight / 4);
        matchView = new ConsultMatchView();
        container = new JPanel();
        container.setLayout(new BoxLayout(container,BoxLayout.Y_AXIS));
        addPanels();
        this.add(container);
        addEvent();
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.pack();
    }

    private void addPanels(){
        initPanelButton();
        container.add(matchView.getPanelConsultMatch());
        container.add(panelButton);
    }

    private void initPanelButton(){
        panelButton = new JPanel();
        panelButton.setBorder(BorderFactory.createTitledBorder("Options"));
        panelButton.setLayout(new MigLayout("","[]30[]30[]30[]30","[]"));
        initComponent();
        addComponent();
    }
    private void initComponent(){
        btnLeague = new JButton("Leagues");
        btnMatch = new JButton("Matches");
        btnTeam = new JButton("Teams");
        btnPlayer = new JButton("Players");
        setButton();
    }
    private void setButton(){
        try {
            Image imgMatch = ImageIO.read(getClass().getResource("/images/soccer.png"));
            btnMatch.setBorderPainted(false);
            btnMatch.setBorder(null);
            btnMatch.setMargin(new Insets(0, 0, 0, 0));
            btnMatch.setContentAreaFilled(false);
            btnMatch.setIcon(new ImageIcon(imgMatch));


            Image imgTeam = ImageIO.read(getClass().getResourceAsStream("/images/flag.png"));
            btnTeam.setBorderPainted(false);
            btnTeam.setBorder(null);
            btnTeam.setMargin(new Insets(0, 0, 0, 0));
            btnTeam.setContentAreaFilled(false);
            btnTeam.setIcon(new ImageIcon(imgTeam));


            Image imgLeague = ImageIO.read(getClass().getResourceAsStream("/images/trophy.png"));
            btnLeague.setBorderPainted(false);
            btnLeague.setBorder(null);
            btnLeague.setMargin(new Insets(0, 0, 0, 0));
            btnLeague.setContentAreaFilled(false);
            btnLeague.setIcon(new ImageIcon(imgLeague));


            Image imgUser = ImageIO.read(getClass().getResourceAsStream("/images/user.png"));
            btnPlayer.setBorderPainted(false);
            btnPlayer.setBorder(null);
            btnPlayer.setMargin(new Insets(0, 0, 0, 0));
            btnPlayer.setContentAreaFilled(false);
            btnPlayer.setIcon(new ImageIcon(imgUser));

        } catch (Exception ex) {
            System.out.println("Exeption in loading image: " + ex);
        }
    }
    private void addComponent(){
        panelButton.add(btnMatch,"span 2");
        panelButton.add(btnTeam,"span 2");
        panelButton.add(btnLeague,"span 2");
        panelButton.add(btnPlayer,"span 2");
    }
    private void addEventMatch(){
        btnMatch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MatchView matchView = new MatchView();
            }
        });
    }
    private void addEventTeam(){
        btnTeam.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TeamView teamView = new TeamView();
            }
        });
    }
    private void  addEventLeague(){
        btnLeague.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LeagueView leagueView = new LeagueView();
            }
        });
    }
    private void addEventPlayer(){
        btnPlayer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PlayerView playerView = new PlayerView();
            }
        });
    }
    private void addEvent(){
        addEventLeague();
        addEventMatch();
        addEventPlayer();
        addEventTeam();
    }
}
