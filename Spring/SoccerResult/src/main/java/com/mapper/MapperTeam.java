package com.mapper;

import com.model.League;
import com.model.Team;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by joschinc on 12/29/16.
 */
public class MapperTeam implements RowMapper {
    @Override
    public Team mapRow(ResultSet resultSet, int i) throws SQLException {
        int idTeam = resultSet.getInt("id");
        String name = resultSet.getString("name");
        int idLeague = resultSet.getInt("league");
        Team team = new Team(idTeam,name,idLeague);
        return team;
    }
}
