package com.action.team;

import com.action.Action;
import com.dao.DAO;
import com.dao.TeamDAOImpl;
import com.model.Team;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.List;

/**
 * Created by joschinc on 1/10/17.
 */
public class ActionGetTeamByIdLeague implements Action {
    private final ApplicationContext context;
    private final TeamDAOImpl teamDAO;
    private List<Team> teams;
    private int idLeague;

    public ActionGetTeamByIdLeague(int idLeague) {
        this.context = new FileSystemXmlApplicationContext("ApplicationContext.xml");
        this.teamDAO = (TeamDAOImpl) context.getBean("teamDAO");
        this.idLeague = idLeague;
    }

    @Override
    public void execute() {
        teams = teamDAO.getTeamByLeague(idLeague);
    }
    public List<Team> getTeams(){
        return teams;
    }
}
