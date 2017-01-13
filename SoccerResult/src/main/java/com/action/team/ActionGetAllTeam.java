package com.action.team;

import com.action.Action;
import com.dao.DAO;
import com.dao.TeamDAOImpl;
import com.model.Team;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.List;

/**
 * Created by joschinc on 1/3/17.
 */
public class ActionGetAllTeam implements Action {
    private final ApplicationContext context;
    private final DAO<Team> teamDAO;
    private List<Team> teams;

    public ActionGetAllTeam() {
        this.context = new FileSystemXmlApplicationContext("ApplicationContext.xml");
        this.teamDAO = (TeamDAOImpl) context.getBean("teamDAO");
    }

    @Override
    public void execute() {
        teams = teamDAO.list();
    }
    public List<Team> getTeams(){
        return teams;
    }
}
