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
public class ActionGetAllLeague implements Action {
    private final ApplicationContext context;
    private final DAO<League> leagueDAO;
    private List<League> leagues;

    public ActionGetAllLeague() {
        this.context = new FileSystemXmlApplicationContext("ApplicationContext.xml");
        this.leagueDAO = (LeagueDAOImpl) context.getBean("leagueDAO");
        this.leagues = new ArrayList<League>();
    }

    public List<League> getLeagues() {
        return leagues;
    }

    @Override
    public void execute() {

        leagues = leagueDAO.list();
    }
}
