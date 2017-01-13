package com.action.match;

import com.action.Action;
import com.dao.DAO;
import com.dao.LeagueDAOImpl;
import com.dao.MatchDAOImpl;
import com.model.League;
import com.model.Match;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by joschinc on 1/10/17.
 */
public class ActionAddMatch implements Action {
    private final ApplicationContext context;
    private final DAO<Match> matchDAO;
    private final Match match;

    public ActionAddMatch(Match match) {
        this.context = new FileSystemXmlApplicationContext("ApplicationContext.xml");
        this.matchDAO = (MatchDAOImpl) context.getBean("matchDAO");
        this.match = match;
    }

    @Override
    public void execute() {
        matchDAO.save(match);
    }
}
