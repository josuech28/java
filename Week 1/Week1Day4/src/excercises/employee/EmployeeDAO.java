package excercises.employee;
import java.math.BigDecimal;
import java.sql.*;
import java.util.ConcurrentModificationException;
import java.util.Properties;

/**
 * Created by joschinc on 11/7/16.
 */
public class EmployeeDAO {
    private final String url = "jdbc:postgresql://localhost/Week1Day4";
    private  final String user = "postgres";
    private final String password = "jCHINCHILLA7";
    Connection connection = null;

    public Connection connect() throws  SQLException{
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url,user,password);

        } catch (Exception e) {
            System.out.println(e);
        }
        return connection;
    }

    public void addEmployee(Employee e){
        String query = "insert into \"Employee\" values(?,?,?)";
        try {
            PreparedStatement pst = connection.prepareStatement(query);
            pst.setInt(1,e.getEmployeeId());
            pst.setString(2,e.getName());
            pst.setBigDecimal(3,e.getSalary());
            pst.executeUpdate();

        } catch (Exception ex) {
            System.out.println(ex);
            ex.printStackTrace();
        }
    }

    public int deleteEmployee(int id_employee){
        String query = "DELETE FROM \"Employee\" WHERE emp_id=?";
        int affectRow = 0;
        try {
            PreparedStatement pst = connection.prepareStatement(query);
            pst.setInt(1,id_employee);
            affectRow = pst.executeUpdate();
        } catch (Exception e){
            System.out.println(e);
        }
        return affectRow;
    }

    public int getAccountEmployee(){
        String query = "SELECT count(*) FROM \"Employee\"";
        int count = 0;
        try{
            Statement stm = connection.createStatement();
            ResultSet rs = stm.executeQuery(query);
            rs.next();
            count = rs.getInt(1);
        } catch (Exception e){
            System.out.println(e);
        }
        System.out.println("Cantidad de registros:" + count);
        return count;
    }

    public  int updateEmployeeSalary(int id_employee, BigDecimal emp_salary){
        String query = "UPDATE \"Employee\" set emp_salary=? where emp_id="+id_employee;
        int affectedRow = 0;
        try {
            PreparedStatement pst = connection.prepareStatement(query);
            pst.setBigDecimal(1,emp_salary);
             affectedRow = pst.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return affectedRow;
    }

    public void increaseSalary(Employee e1, BigDecimal increment){
        BigDecimal newSalary = e1.increaseSalary(increment);
        updateEmployeeSalary(e1.getEmployeeId(),newSalary);
    }

    public void closeConnection(){
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void getEmployees(){
        String query = "SELECT \"emp_id\", \"emp_name\", \"emp_salary\" from \"Employee\"";
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);
            displayEmployee(rs);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void getEmployee(int id_employee){
        String query = "SELECT \"emp_id\", \"emp_name\", \"emp_salary\" from \"Employee\" WHERE \"emp_id\"=?";

        try {
            PreparedStatement pst = connection.prepareStatement(query);
            pst.setInt(1,id_employee);
            ResultSet rs = pst.executeQuery();
            displayEmployee(rs);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    private void displayEmployee(ResultSet rs) throws SQLException {
        while(rs.next()){
            System.out.println("ID employee: " + rs.getString("emp_id") +
                               "\n Name: " + rs.getString("emp_name") +
                                "\n Salary: " + rs.getString("emp_salary"));

        }
    }
}
