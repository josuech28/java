package com.dao;

import java.util.List;
import javax.sql.DataSource;

import com.mapper.StudentMapper;
import com.model.Student;
import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDaoImpl  implements DAO<Student> {
   private DataSource dataSource;
   private JdbcTemplate jdbcTemplateObject;
   private final String addStudent = "insert into \"Student\" (\"ID\", \"NAME\", \"AGE\") values (?,?,?)";
   private final String getStudent = "select * from \"Student\" where \"ID\" = ?";
   private final String getAllStudent = "select * from \"Student\"";
   private final String deleteStudent = "delete from \"Student\" where \"ID\" = ?";
   private final String getMaxID = "Select MAX(\"ID\")  from \"Student\"";
   private final String updateStudent = "update \"Student\" set \"AGE\" = ? where \"ID\" = ?";
   
   public void setDataSource(DataSource dataSource) {
      this.dataSource = dataSource;
      this.jdbcTemplateObject = new JdbcTemplate(dataSource);
   }

   @Override
   public void create(Student student) {
       int numID = getMaxID() + 1;
      Object parameters[] = new Object[]{numID,student.getName(),student.getAge()};
      jdbcTemplateObject.update(addStudent,parameters);

      System.out.println("Created Record ID = " + numID +  " Name = " + student.getName() + " Age = " + student.getAge());

   }

   @Override
   public Student get(int id) {
      Student student = (Student) jdbcTemplateObject.queryForObject(getStudent,
                        new Object[]{id}, new StudentMapper());
      return student;
   }

   @Override
   public List<Student> list() {
      List <Student> students = jdbcTemplateObject.query(getAllStudent,
                                new StudentMapper());
      return students;
   }
   @Override
   public void delete(int id){
      Object parameter[] = new Object[]{id};
      jdbcTemplateObject.update(deleteStudent, parameter);
      System.out.println("Deleted Record with ID = " + id );
   }

   @Override
   public void update(Student student){
      Object parameter[] = new Object[]{student.getAge(),student.getId()};
      jdbcTemplateObject.update(updateStudent,parameter);
      System.out.println("Updated Record with ID = " + student.getId() );
   }

   @Override
   public int getMaxID(){
       return jdbcTemplateObject.queryForInt(getMaxID);
   }

}