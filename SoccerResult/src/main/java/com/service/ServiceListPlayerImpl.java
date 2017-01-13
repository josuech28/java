package com.service;

import com.action.player.ActionGetAllPlayer;
import com.model.Player;

import java.util.List;

/**
 * Created by joschinc on 1/9/17.
 */
public class ServiceListPlayerImpl implements ServiceList<Player> {
    @Override
    public List<Player> getList() {
        ActionGetAllPlayer action = new ActionGetAllPlayer();
        action.execute();
        return action.getPlayers();
    }
}
