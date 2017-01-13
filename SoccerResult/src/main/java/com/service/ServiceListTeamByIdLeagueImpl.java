package com.service;

import com.action.team.ActionGetAllTeam;
import com.action.team.ActionGetTeamByIdLeague;
import com.model.Team;

import java.util.List;

/**
 * Created by joschinc on 1/10/17.
 */
public class ServiceListTeamByIdLeagueImpl {

    public List<Team> get(int idLeague) {
        ActionGetTeamByIdLeague action = new ActionGetTeamByIdLeague(idLeague);
        action.execute();
        List<Team> teams = action.getTeams();
        return teams;
    }
}
