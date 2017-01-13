package com.service;

import com.action.Action;
import com.action.team.ActionGetAllTeam;
import com.model.Team;

import java.util.List;

/**
 * Created by joschinc on 1/3/17.
 */
public class ServiceListTeamImpl implements ServiceList<Team> {

    @Override
    public List<Team> getList() {
        ActionGetAllTeam action = new ActionGetAllTeam();
        action.execute();
        List<Team> teams = action.getTeams();
        return teams;
    }
}
