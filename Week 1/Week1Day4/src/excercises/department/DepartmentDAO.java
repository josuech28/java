package excercises.department;

import excercises.connection.DB;
import excercises.employee.Employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by joschinc on 11/7/16.
 */
public class DepartmentDAO {

    private DB db;

    public DepartmentDAO(){
        this.db = new DB();
    }

    public void addDepartment(Department department){
        String query = "insert into \"Department\" values(?,?,?)";
        try {
            for(Employee e: department.getEmployees()){
                PreparedStatement pst = db.getConnection().prepareStatement(query);
                pst.setInt(1,department.getIdDepartement());
                pst.setInt(2,e.getEmployeeId());
                pst.setString(3,department.getName());
                pst.executeUpdate();
            }


        } catch (Exception ex) {
            System.out.println(ex);
            ex.printStackTrace();
        }
    }
}
