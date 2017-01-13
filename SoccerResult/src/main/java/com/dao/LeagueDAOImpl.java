package com.dao;

import com.mapper.MapperLeague;
import com.model.League;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by joschinc on 12/29/16.
 */
public class LeagueDAOImpl implements DAO<League> {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;
    private final String addLeague = "INSERT INTO League (id,name,description) values (?,?,?)";
    private final String getLeague = "SELECT * FROM League where id = ?";
    private final String getAllLeague = "SELECT * FROM League";
    private final String deleteLeague = "delete from League where id = ?";
    private final String updateLeague = "UPDATE League set name = ? where id = ?";
    private final String getMaxIDLeague = "SELECT MAX(id) from League";

    public void setDataSource(DataSource dataSource){
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public boolean save(League object) {
        try {
            int rowAffected = 0;
            int idLeague = getMaxID() + 1;
            Object parameter[] = new Object[]{idLeague, object.getName(), object.getDescription()};
            rowAffected = jdbcTemplate.update(addLeague,parameter);
            if(rowAffected > 0){
                System.out.println("Created RECORD ID" + idLeague + " Name " + object.getName() + " Description " + object.getDescription());
                return true;
            } else {
                System.out.println("Can not add record!");
                return false;
            }

        } catch (Exception e)
        {
            System.out.println(e);
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public League get(League object) {
        League league = (League) jdbcTemplate.queryForObject(getLeague,new Object[]{object.getIdLeague()},new MapperLeague());
        return league;
    }

    @Override
    public List<League> list() {
        List<League> leagues = jdbcTemplate.query(getAllLeague,new MapperLeague());
        return leagues;
    }

    @Override
    public boolean delete(League object) {
        int rowAffected = 0;
        try
        {
            Object paramenter[] = new Object[]{object.getIdLeague()};
            rowAffected = jdbcTemplate.update(deleteLeague,paramenter);
            if(rowAffected > 0){
                System.out.println("Delete RECORD ID " + object.getIdLeague());
                return true;
            } else {
                System.out.println("Can NOT delete RECORD");
                return false;
            }
        } catch (Exception e){
            System.out.println(e);
            return false;
        }

    }

    @Override
    public void update(League object) {
        Object parameter[] = new Object[]{object.getIdLeague(),object.getName(),object.getDescription()};
        jdbcTemplate.update(updateLeague,parameter);
    }
    public int getMaxID(){
       return  jdbcTemplate.queryForInt(getMaxIDLeague);
    }
}
