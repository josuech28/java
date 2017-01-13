package com.action.match;

import com.action.Action;
import com.dao.DAO;
import com.dao.MatchDAOImpl;
import com.model.Match;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.List;

/**
 * Created by joschinc on 1/10/17.
 */
public class ActionGetAllMatch implements Action {
    private final ApplicationContext context;
    private final DAO<Match> matchDAO;
    private List<Match> matchs;

    public ActionGetAllMatch() {
        this.context = new FileSystemXmlApplicationContext("ApplicationContext.xml");
        this.matchDAO = (MatchDAOImpl) context.getBean("matchDAO");
    }

    public List<Match> getMatchs(){
        return this.matchs;
    }

    @Override
    public void execute() {
        matchs = matchDAO.list();
    }
}
