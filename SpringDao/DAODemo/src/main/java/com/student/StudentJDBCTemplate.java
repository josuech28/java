package com.student;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class StudentJDBCTemplate implements StudentDao {
   private DataSource dataSource;
   private JdbcTemplate jdbcTemplateObject;
   
   public void setDataSource(DataSource dataSource) {
      this.dataSource = dataSource;
      this.jdbcTemplateObject = new JdbcTemplate(dataSource);
   }

   public void create(String name, Integer age) {
      String SQL = "insert into \"Student\" (\"ID\", \"NAME\", \"AGE\") values (?,?,?)";
       int numID = getNumberRecord() + 1;
      Object parameters[] = new Object[]{numID,name,age};
      jdbcTemplateObject.update(SQL,parameters);

      System.out.println("Created Record ID = " + numID +  " Name = " + name + " Age = " + age);
      return;
   }

   public Student getStudent(Integer id) {
      String SQL = "select * from \"Student\" where \"ID\" = ?";
      Student student = (Student) jdbcTemplateObject.queryForObject(SQL,
                        new Object[]{id}, new StudentMapper());
      return student;
   }

   public List<Student> listStudents() {
      String SQL = "select * from \"Student\"";
      List <Student> students = jdbcTemplateObject.query(SQL, 
                                new StudentMapper());
      return students;
   }

   public void delete(Integer id){
      String SQL = "delete from \"Student\" where \"ID\" = ?";
      Object parameter[] = new Object[]{id};
      jdbcTemplateObject.update(SQL, parameter);
      System.out.println("Deleted Record with ID = " + id );
      return;
   }

   public void update(Integer id, Integer age){
      String SQL = "update \"Student\" set \"AGE\" = ? where \"ID\" = ?";
      Object parameter[] = new Object[]{age,id};
      jdbcTemplateObject.update(SQL,parameter);
      System.out.println("Updated Record with ID = " + id );
      return;
   }

   public int getNumberRecord(){
       String SQL = "SELECT COUNT(*) FROM \"Student\"";
       return jdbcTemplateObject.queryForInt(SQL);
   }

}