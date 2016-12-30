package com.service;

import com.dao.DAO;
import com.dao.PlayerDaoImpl;
import com.model.Match;
import com.model.Player;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by joschinc on 12/29/16.
 */
public class ResultServiceImpl implements ResultService {
    private final ApplicationContext context;
    private final DAO<Player>  playerDAO;

    public ResultServiceImpl(){
        this.context = new FileSystemXmlApplicationContext("ApplicationContext.xml");
        this.playerDAO = (PlayerDaoImpl) context.getBean("playerDAO");
    }
    @Override
    public Player[] getResult(Match match){
        Player[] players = new Player[2];
        try {

            String homeID = match.getHomePlayer();
            String awayID = match.getAwayPlayer();

            Player homePlayer = playerDAO.get(new Player(homeID, 0, 0, 0, 0, 0, 0));
            Player awayPlayer = playerDAO.get(new Player(awayID, 0, 0, 0, 0, 0, 0));

            if(homePlayer != null && awayPlayer != null) {

                int homeMatchPlayed = homePlayer.getMatchPlayed();
                int awayMatchPlayed = awayPlayer.getMatchPlayed();

                int homeMatchWon = homePlayer.getMatchWon();
                int awayMatchWon = awayPlayer.getMatchWon();

                int homeMatchLoost = homePlayer.getMatchLost();
                int awayMatchLoost = awayPlayer.getMatchLost();

                int homeMatchTied = homePlayer.getMatchTied();
                int awayMatchTied = awayPlayer.getMatchTied();


                int homeCurrentGoal = homePlayer.getGoalFavor();
                int awayCurrentGoal = awayPlayer.getGoalFavor();

                int homeCurrentGoalAgainst = homePlayer.getGoalAgainst();
                int awayCurrentGoalAgainst = awayPlayer.getGoalAgainst();

                int homeGoal = match.getGolHomePlayer();
                int awayGoal = match.getGoalAwayPlayer();

                if (getWinner(match) == 1) {
                    // home player won
                    Player home = new Player(homeID, homeMatchPlayed + 1, homeMatchWon + 1, homeMatchLoost, homeMatchTied, homeCurrentGoal + homeGoal, homeCurrentGoalAgainst + awayGoal);
                    Player away = new Player(awayID, awayMatchPlayed + 1, awayMatchWon, awayMatchLoost + 1, awayMatchTied, awayCurrentGoal + awayGoal, awayCurrentGoalAgainst + homeGoal);
                    players[0] = home;
                    players[1] = away;
                } else {
                    if (homeGoal < awayGoal) {
                        // away player won
                        Player home = new Player(homeID, homeMatchPlayed + 1, homeMatchWon, homeMatchLoost + 1, homeMatchTied, homeCurrentGoal + homeGoal, homeCurrentGoalAgainst + awayGoal);
                        Player away = new Player(awayID, awayMatchPlayed + 1, awayMatchWon + 1, awayMatchLoost, awayMatchTied, awayCurrentGoal + awayGoal, awayCurrentGoalAgainst + homeGoal);
                        players[0] = home;
                        players[1] = away;
                    } else {
                        //tie
                        Player home = new Player(homeID, homeMatchPlayed + 1, homeMatchWon, homeMatchLoost, homeMatchTied + 1, homeCurrentGoal + homeGoal, homeCurrentGoalAgainst + awayGoal);
                        Player away = new Player(awayID, awayMatchPlayed + 1, awayMatchWon, awayMatchLoost, awayMatchTied + 1, awayCurrentGoal + awayGoal, awayCurrentGoalAgainst + homeGoal);
                        players[0] = home;
                        players[1] = away;
                    }
                }
            }

        } catch(Exception e){
            e.printStackTrace();

        }

        return players;

    }

    @Override
    public int getWinner(Match match){
         if(match.getGolHomePlayer() > match.getGoalAwayPlayer()){
             return 1;
        } else {
             if(match.getGolHomePlayer() < match.getGoalAwayPlayer()){
                 return -1;
             } else {
                 return 0;
             }
         }
    }
}
