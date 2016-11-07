package excercises.department;

import excercises.employee.Employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by joschinc on 11/7/16.
 */
public class DepartmentDAO {

    private final String url = "jdbc:postgresql://localhost/Week1Day4";
    private  final String user = "postgres";
    private final String password = "jCHINCHILLA7";
    Connection connection = null;

    public Connection connect() throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url,user,password);

        } catch (Exception e) {
            System.out.println(e);
        }
        return connection;
    }

    public void addDepartment(Department department){
        String query = "insert into \"Department\" values(?,?,?)";
        try {
            for(Employee e: department.getEmployees()){
                PreparedStatement pst = connection.prepareStatement(query);
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
