package com.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.League;
import org.springframework.jdbc.core.RowMapper;
/**
 * Created by joschinc on 12/29/16.
 */
public class MapperLeague implements RowMapper {
    @Override
    public League mapRow(ResultSet resultSet, int i) throws SQLException {
        int idLeague = resultSet.getInt("id");
        String nameLeague = resultSet.getString("name");
        String descriptionLeague = resultSet.getString("description");
        League league = new League(idLeague, nameLeague, descriptionLeague);
        return league;
    }
}
