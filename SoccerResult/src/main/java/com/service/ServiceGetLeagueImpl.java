package com.service;

import com.action.league.ActionGetLeague;
import com.model.League;

/**
 * Created by joschinc on 1/3/17.
 */
public class ServiceGetLeagueImpl implements ServiceGet<League> {

    @Override
    public League get(League object) {
        ActionGetLeague findLeague = new ActionGetLeague(object);
        findLeague.execute();
        League league = findLeague.getLeague();
        return league;
    }
}
