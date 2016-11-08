package excercises.Investment;

import excercises.connection.DB;
import excercises.user.User;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by joschinc on 11/8/16.
 */
public class InvestmentDao {
    private DB db;

    public InvestmentDao(){
        this.db = new DB();
    }

    public int addInvestment(Investment investment){
        String query = "INSERT INTO \"Investments\" VALUES(?,?,?,?,?)";
        int affectedRow = 0;
        try{
            PreparedStatement pst = db.getConnection().prepareStatement(query);
            pst.setInt(1,investment.getIdInvestment());
            pst.setString(2,investment.getStockName());
            pst.setInt(3,investment.getsQTY());
            pst.setBigDecimal(4,investment.getPrice());
            pst.setInt(5,investment.getUserId());
            affectedRow = pst.executeUpdate();
        }catch (Exception e){
            System.out.println(e);
        }
        return affectedRow;
    }

    public int deleteInvestment(Investment investment){
        String query = "DELETE FROM \"Investments\" WHERE i_id";
        int affectedRow = 0;
        try{
            PreparedStatement pst = db.getConnection().prepareStatement(query);
            pst.setInt(1,investment.getIdInvestment());
            affectedRow = pst.executeUpdate();
        } catch (Exception e){
            System.out.println(e);
        }
        return  affectedRow;
    }

    public void getInvestmentByUser(User user){
        String query = "SELECT i_id, stock_name, s_qty, price, user_id FROM \"Investments\" WHERE user_id=?";
        try {
            PreparedStatement pst = db.getConnection().prepareStatement(query);
            pst.setInt(1,user.getId());
            ResultSet rs = pst.executeQuery();
            printInvestment(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void printInvestment(ResultSet resultSet) throws SQLException{
        while (resultSet.next()){
            System.out.println("ID: " + resultSet.getString("i_id") + "\n Name: " + resultSet.getString("stock_name") +
                    "\n SQTY: " + resultSet.getString("s_qty") +
                    "\n Price: " + resultSet.getString("price") +
                    "\n User ID: " + resultSet.getString("user_id"));
        }
    }
}
