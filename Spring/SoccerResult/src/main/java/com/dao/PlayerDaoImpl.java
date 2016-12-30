package com.dao;

import com.mapper.MapperPlayer;
import com.model.Player;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by joschinc on 12/29/16.
 */
public class PlayerDaoImpl implements DAO<Player> {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;
    private final String addPlayer = "INSERT INTO Player (id, matchPlayed, matchWon,matchLost, matchTied, goalFavor,goalAgainst) values (?,?,?,?,?,?,?)";
    private final String getPlayer = "SELECT * FROM Player where id = ?";
    private final String getAllPlayer = "SELECT * FROM Player ";
    private final String deletePlayer = "DELETE FROM Player where id = ?";
    private final String updatePlayer = "UPDATE Player set matchPlayed = ?, matchWon = ?, matchLost = ?, matchTied = ?, goalFavor = ?, goalAgainst = ? where id = ?";


    public void setDataSource(DataSource dataSource){
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
    @Override
    public void save(Player object) {
        Object parameter[] = new Object[]{object.getIdPlayer(),object.getMatchPlayed(),object.getMatchWon(), object.getMatchLost(), object.getMatchTied(), object.getGoalFavor(), object.getGoalAgainst()};
        jdbcTemplate.update(addPlayer,parameter);
    }

    @Override
    public Player get(Player object) {
        Player player = (Player) jdbcTemplate.queryForObject(getPlayer,new Object[]{object.getIdPlayer()},new MapperPlayer());
        return player;
    }

    @Override
    public List<Player> list() {
        List<Player> players = jdbcTemplate.query(getAllPlayer,new MapperPlayer());
        return players;
    }

    @Override
    public void delete(Player object) {
        Object parameter[] = new Object[]{object.getIdPlayer()};
        jdbcTemplate.update(deletePlayer,parameter);
    }

    @Override
    public void update(Player object) {
        Object parameter[] = new Object[]{object.getMatchPlayed(),object.getMatchWon(), object.getMatchLost(), object.getMatchTied(), object.getGoalFavor(), object.getGoalAgainst(),object.getIdPlayer()};
        jdbcTemplate.update(updatePlayer,parameter);
    }
}
