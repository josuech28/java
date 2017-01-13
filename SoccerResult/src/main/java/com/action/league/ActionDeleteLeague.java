package com.action.league;

import com.action.Action;
import com.dao.DAO;
import com.dao.LeagueDAOImpl;
import com.model.League;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by joschinc on 12/30/16.
 */
public class ActionDeleteLeague implements Action {
    private final ApplicationContext context;
    private final DAO<League> leagueDAO;
    private final League league;

    public ActionDeleteLeague(League league) {
        this.context = new FileSystemXmlApplicationContext("ApplicationContext.xml");
        this.leagueDAO = (LeagueDAOImpl) context.getBean("leagueDAO");
        this.league = league;
    }

    @Override
    public void execute() {
        leagueDAO.delete(league);
    }
}
