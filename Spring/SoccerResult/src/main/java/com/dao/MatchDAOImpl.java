package com.dao;

import com.mapper.MapperMatch;
import com.model.Match;
import com.util.ValidityID;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.util.List;

/**
 * Created by joschinc on 12/29/16.
 */
public class MatchDAOImpl implements DAO<Match> {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;
    private final String addMatch = "INSERT INTO Match (id,idHomePlayer,idAwayPlayer,homeGoal,awayGoal) values(?,?,?,?,?)";
    private final String getMatch = "SELECT * FROM Match where id = ?";
    private final String getAllMatch = "SELECT * FROM Match";
    private final String deleteMatch = "DELETE FROM Match where id = ?";
    private final String updateMatch = "UPDATE Match set homeGoal = ?, awayGoal = ? where id = ?";
    private final String getMaxIDMatch = "SELECT MAX(id) FROM Match";

    public void setDataSource(DataSource resultSet){
        this.dataSource = resultSet;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
    @Override
    public void save(Match object) {
        ValidityID validityID = new ValidityID();
        int idMatch = getMaxId() + 1;
        if(validityID.isValidId(idMatch)){
            Object parameters[] = new Object[]{idMatch, object.getHomePlayer(), object.getAwayPlayer(), object.getGolHomePlayer(), object.getGoalAwayPlayer()};
            jdbcTemplate.update(addMatch,parameters);
        }

    }

    @Override
    public Match get(Match object) {
        Object parameter[] = new Object[]{object.getIdMatch()};
        Match match = (Match) jdbcTemplate.queryForObject(getMatch,parameter,new MapperMatch());
        return match;
    }

    @Override
    public List<Match> list() {
        List<Match> matches = jdbcTemplate.query(getAllMatch, new MapperMatch());
        return matches;
    }

    @Override
    public void delete(Match object) {
        Object parameter[] = new Object[]{object.getIdMatch()};
        jdbcTemplate.update(deleteMatch, parameter);

    }

    @Override
    public void update(Match object) {
        Object parameters[] = new Object[]{object.getGolHomePlayer(), object.getGoalAwayPlayer(), object.getIdMatch()};
        jdbcTemplate.update(updateMatch,parameters);
    }

    public int getMaxId(){
        return jdbcTemplate.queryForInt(getMaxIDMatch);
    }

}
