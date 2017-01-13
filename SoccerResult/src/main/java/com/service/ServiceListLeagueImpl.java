package com.service;

import com.action.Action;
import com.action.league.ActionGetAllLeague;
import com.model.League;

import java.util.List;

/**
 * Created by joschinc on 1/3/17.
 */
public class ServiceListLeagueImpl implements ServiceList<League> {
    @Override
    public List<League> getList() {
        ActionGetAllLeague actionGetAllLeague = new ActionGetAllLeague();
        actionGetAllLeague.execute();
        List<League> leagues = actionGetAllLeague.getLeagues();
        return leagues;
    }
}
