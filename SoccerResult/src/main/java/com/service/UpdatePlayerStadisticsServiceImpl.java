package com.service;

import com.action.Action;
import com.action.player.ActionUpdatePlayer;
import com.model.Player;

/**
 * Created by joschinc on 12/30/16.
 */
public class UpdatePlayerStadisticsServiceImpl implements UpdatePlayerStadisticsService{

    @Override
    public void updatePlayer(Player[] players) {
        Action action;
        for(Player player: players){
            action = new ActionUpdatePlayer(player);
            action.execute();
        }
    }
}
