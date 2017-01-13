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
public class ActionGetTeam implements Action {
    private final ApplicationContext context;
    private final DAO<Team> teamDAO;
    private Team team;

    public ActionGetTeam(Team team) {
        this.context = new FileSystemXmlApplicationContext("ApplicationContext.xml");
        this.teamDAO = (TeamDAOImpl) context.getBean("teamDAO");
        this.team = team;
    }

    @Override
    public void execute() {

        team = teamDAO.get(team);
    }
    public Team getTeam(){
        return team;
    }
}
