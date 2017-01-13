package com.service;

import com.action.team.ActionGetTeam;
import com.model.Team;

/**
 * Created by joschinc on 1/3/17.
 */
public class ServiceGetTeamImpl implements ServiceGet<Team> {
    @Override
    public Team get(Team object) {
        ActionGetTeam findTeam = new ActionGetTeam(object);
        findTeam.execute();
        Team team =  findTeam.getTeam();
        return team;
    }
}
