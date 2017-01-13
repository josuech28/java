package com.service;

import com.action.player.ActionGetPlayer;
import com.model.Player;

/**
 * Created by joschinc on 1/9/17.
 */
public class ServiceGetPlayerImpl implements ServiceGet<Player> {
    @Override
    public Player get(Player object) {
        ActionGetPlayer player = new ActionGetPlayer(object);
        player.execute();
        return player.getPlayer();
    }
}
