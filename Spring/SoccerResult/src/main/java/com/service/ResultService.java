package com.service;

import com.model.Match;
import com.model.Player;

/**
 * Created by joschinc on 12/29/16.
 */
public interface ResultService {
    Player[] getResult(Match match);
    int getWinner(Match match);
}
