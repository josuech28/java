package excercises.user;

import excercises.connection.DB;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by joschinc on 11/7/16.
 */
public class UserDao {
    private DB db;

    public UserDao(){
        this.db = new DB();
    }

    public int addUser(User newUser){
        String query = "INSERT INTO \"Users\" VALUES(?,?,?)";
        int affectedRow = 0;
        try {
            PreparedStatement pst =  db.getConnection().prepareStatement(query);
            pst.setInt(1,newUser.getId());
            pst.setString(2,newUser.getName());
            pst.setString(3,newUser.getPassword());
            affectedRow = pst.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return affectedRow;
    }

    public int deleteUser(User user){
        String query = "DELETE FROM \"Users\" WHERE user_id=?";
        int affectedRow = 0;
        try{
            PreparedStatement pst = db.getConnection().prepareStatement(query);
            pst.setInt(1,user.getId());
            affectedRow = pst.executeUpdate();
        } catch (Exception e){
            System.out.println(e);
        }
        return affectedRow;
    }
    public User findUser(int id, String password){
        String query = "SELECT user_id, user_name, user_password FROM \"Users\" WHERE user_id=? AND user_password=?";
        boolean userFind = false;
        try {
            PreparedStatement pst = db.getConnection().prepareStatement(query);
            pst.setInt(1,id);
            pst.setString(2,password);
            ResultSet rs = pst.executeQuery();
            System.out.println(rs);
            if(rs.isBeforeFirst()){
                //String name = rs.getString("user_name");

                User user = new User();
                user = getUser(id, password);
               // user.setName(name);
                return user;

            }

        }catch (Exception e){
            System.out.println(e);
        }
        return null;
    }
    public User getUser(int id, String password){
        return new User(id,password);
    }



}
