package com.service;

import com.action.match.ActionGetAllMatch;
import com.model.Match;

import java.util.List;

/**
 * Created by joschinc on 1/10/17.
 */
public class ServiceListMatchImpl implements ServiceList<Match> {
    @Override
    public List<Match> getList() {
        ActionGetAllMatch action = new ActionGetAllMatch();
        action.execute();
        return  action.getMatchs();
    }
}
