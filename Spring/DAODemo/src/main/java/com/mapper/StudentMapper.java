package com.mapper;



import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.Student;
import org.springframework.jdbc.core.RowMapper;
/**
 * Created by joschinc on 12/16/16.
 */
public class StudentMapper implements RowMapper {
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        int id = rs.getInt("id");
        String name = rs.getString("name");
        int age = rs.getInt("age");
        Student student = new Student(age,name,id);
        return student;
    }
}
