package com.dao;

import com.mapper.MapperTeam;
import com.model.Team;
import com.util.ValidityID;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by joschinc on 12/29/16.
 */
public class TeamDAOImpl implements DAO<Team> {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;
    private final String addTeam = "INSERT INTO Team (id,name,ligue) values(?,?,?)";
    private final String getTeam = "SELECT * FROM Team where id = ?";
    private final String getAllTeam = "SELECT * FROM Team";
    private final String deleteTeam = "DELETE FROM Team where id = ?";
    private final String updateTeam = "UPDATE Team set name = ? where id = ?";
    private final String getMaxIDTeam = "SELECT MAX(id) from Team";

    public void setDataSource(DataSource dataSource){
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void save(Team object) {
        ValidityID validator = new ValidityID();
        int idTeam = getMaxID() + 1;
        if(validator.isValidId(idTeam)){
            Object parameter[] = new Object[]{idTeam, object.getName(),object.getLigue()};
            jdbcTemplate.update(addTeam,parameter);
        }

    }

    @Override
    public Team get(Team object) {
        Team team = (Team) jdbcTemplate.queryForObject(getTeam,new Object[]{object.getIdTeam()},new MapperTeam());
        return team;
    }

    @Override
    public List<Team> list() {
        List<Team> teams = jdbcTemplate.query(getAllTeam,new MapperTeam());
        return teams;
    }

    @Override
    public void delete(Team object) {
        Object parameter[] = new Object[]{object.getIdTeam()};
        jdbcTemplate.update(deleteTeam,parameter);
    }

    @Override
    public void update(Team object) {
        Object parameter[] = new Object[]{object.getName(),object.getIdTeam()};
        jdbcTemplate.update(updateTeam,parameter);
    }
    public int getMaxID(){
        return jdbcTemplate.queryForInt(getMaxIDTeam);
    }
}
