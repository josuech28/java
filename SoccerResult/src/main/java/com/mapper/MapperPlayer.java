package com.mapper;

import com.model.Player;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by joschinc on 12/29/16.
 */
public class MapperPlayer implements RowMapper {
    @Override
    public Player mapRow(ResultSet resultSet, int i) throws SQLException {
        String id = resultSet.getString("id");
        int matchPlayed = resultSet.getInt("matchPlayed");
        int matchWon= resultSet.getInt("matchWon");
        int matchLost = resultSet.getInt("matchLost");
        int matchTied = resultSet.getInt("matchTied");
        int goalFavor = resultSet.getInt("goalFavor");
        int goalAgainst = resultSet.getInt("goalAgainst");
        return new Player(id,matchPlayed,matchWon,matchLost,matchTied,goalFavor,goalAgainst);
    }
}
