package com.mapper;

import com.model.Match;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by joschinc on 12/29/16.
 */
public class MapperMatch implements RowMapper {
    @Override
    public Match mapRow(ResultSet resultSet, int i) throws SQLException {
        int idMatch = resultSet.getInt("id");
        String idHomePlayer = resultSet.getString("homePlayer");
        String idAwayPlayer = resultSet.getString("awayPlayer");
        int homeGoal = resultSet.getInt("homeGoal");
        int awayGoal = resultSet.getInt("awayGoal");
        Match match = new Match(idMatch,idHomePlayer,idAwayPlayer,homeGoal,awayGoal);
        return match;
    }
}
