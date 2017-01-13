package com.dao;

import com.mapper.MapperMatch;
import com.mapper.MapperTeam;
import com.model.Team;
import com.util.ValidityID;
import org.omg.CORBA.OBJ_ADAPTER;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by joschinc on 12/29/16.
 */
public class TeamDAOImpl implements DAO<Team> {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;
    private final String addTeam = "INSERT INTO Team (id,name,league) values(?,?,?)";
    private final String getTeam = "SELECT * FROM Team where id = ?";
    private final String getAllTeam = "SELECT * FROM Team";
    private final String deleteTeam = "DELETE FROM Team where id = ?";
    private final String updateTeam = "UPDATE Team set name = ? where id = ?";
    private final String getMaxIDTeam = "SELECT MAX(id) from Team";
    private final String getTeamById = "SELECT * FROM Team where league = ?";

    public void setDataSource(DataSource dataSource){
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public boolean save(Team object) {
        int rowAffected = 0;
        ValidityID validator = new ValidityID();
        int idTeam = getMaxID() + 1;
        if(validator.isValidId(idTeam)){
            Object parameter[] = new Object[]{idTeam, object.getName(),object.getLigue()};
            rowAffected = jdbcTemplate.update(addTeam,parameter);
        } else {
            return false;
        }
        return rowAffected > 0 ? true : false;
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
    public boolean delete(Team object) {
        int rowAffected = 0;
        try {
            Object parameter[] = new Object[]{object.getIdTeam()};
            rowAffected = jdbcTemplate.update(deleteTeam, parameter);
            if(rowAffected > 0){
                System.out.println("DELETE RECORD ID: " + object.getIdTeam());
                return true;
            } else {
                System.out.println("CAN NOT DELETE RECORD");
                return false;
            }
        } catch (Exception e){
            System.out.println(e.toString());
            return false;
        }
    }

    @Override
    public void update(Team object) {
        Object parameter[] = new Object[]{object.getName(),object.getIdTeam()};
        jdbcTemplate.update(updateTeam,parameter);
    }
    public int getMaxID(){
        return jdbcTemplate.queryForInt(getMaxIDTeam);
    }

    public List<Team> getTeamByLeague(int idLeague){
        List<Team> teams;
        try {
            Object parameter[] = new Object[]{idLeague};
            teams = (List<Team>) jdbcTemplate.query(getTeamById,parameter,new MapperTeam());
            if(teams != null) {
                return teams;
            }
        }catch (Exception e){
            System.out.println(e.toString());
            return null;
        }
        return teams;
    }
}
