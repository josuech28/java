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
    private final String addMatch = "INSERT INTO SoccrerResult.`Match` (id,homePlayer,awayPlayer,homeGoal,awayGoal,homeTeam,awayTeam,homeLeague,awayLeague) values(?,?,?,?,?,?,?,?,?)";
    private final String getMatch = "SELECT * FROM SoccrerResult.`Match` where id = ?";
    private final String getAllMatch = "SELECT * FROM SoccrerResult.`Match`";
    private final String deleteMatch = "DELETE FROM SoccrerResult.`Match` where id = ?";
    private final String updateMatch = "UPDATE SoccrerResult.`Match` set homeGoal = ?, awayGoal = ? where id = ?";
    private final String getMaxIDMatch = "SELECT MAX(id) from SoccrerResult.`Match`";

    public void setDataSource(DataSource resultSet){
        this.dataSource = resultSet;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
    @Override
    public boolean save(Match object) {
        ValidityID validityID = new ValidityID();
        int rowAffected = 0;
        int idMatch = getMaxId() + 1;
        if(validityID.isValidId(idMatch)){

            Object parameters[] = new Object[]{idMatch, object.getHomePlayer(), object.getAwayPlayer(), object.getGolHomePlayer(), object.getGoalAwayPlayer(),object.getHomeTeam(),object.getAwayTeam(),object.getHomeLeague(),object.getAwayLeague()};
            rowAffected = jdbcTemplate.update(addMatch,parameters);
        } else {
            return false;
        }
        if(rowAffected > 0){
            System.out.println("Match save ID " + object.getIdMatch());
            return true;
        } else {
            System.out.println("Match can NOT be add!");
            return false;
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
    public boolean delete(Match object) {
        int rowAffected = 0;
        try{
            Object parameter[] = new Object[]{object.getIdMatch()};
            rowAffected = jdbcTemplate.update(deleteMatch, parameter);
            if (rowAffected > 0){
                System.out.println("DELETE RECORD ID: " + object.getIdMatch());
                return true;
            } else {
                System.out.println("CAN NOT DELETE");
                return false;
            }
        } catch (Exception e){
            System.out.println(e);
            return false;
        }
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
