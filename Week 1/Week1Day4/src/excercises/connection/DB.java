package excercises.connection;
import java.sql.Connection;
import java.sql.Connection.*;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by joschinc on 11/7/16.
 */
public class DB {
    private final String url = "jdbc:postgresql://localhost/Week1Day4";
    private  final String user = "postgres";
    private final String password = "jCHINCHILLA7";
    Connection connection = null;


    public DB(){
        try {
            connect();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection connect() throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url,user,password);

        } catch (Exception e) {
            System.out.println(e);
        }
        return connection;
    }

    public void closeConnection(){
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
