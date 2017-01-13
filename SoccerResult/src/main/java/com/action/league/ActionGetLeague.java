package com.action.league;

import com.action.Action;
import com.dao.DAO;
import com.dao.LeagueDAOImpl;
import com.model.League;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by joschinc on 12/30/16.
 */
public class ActionGetLeague implements Action {
    private final ApplicationContext context;
    private final DAO<League> leagueDAO;
    private League league;
    private League tempLeague;

    public ActionGetLeague(League league) {
        this.context = new FileSystemXmlApplicationContext("ApplicationContext.xml");
        this.leagueDAO = (LeagueDAOImpl) context.getBean("leagueDAO");
        this.tempLeague = new League(0,"default","default");
        this.league = league;
    }

    public League getLeague() {
        return tempLeague;
    }

    @Override
    public void execute() {

        tempLeague = leagueDAO.get(league);
    }
}
