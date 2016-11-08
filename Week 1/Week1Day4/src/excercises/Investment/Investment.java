package excercises.Investment;

import java.math.BigDecimal;

/**
 * Created by joschinc on 11/8/16.
 */
public final class Investment {

    private final int idInvestment;
    private String stockName;
    private int sQTY;
    private BigDecimal price;
    private final int UserId;

    public Investment(int idInvestment, String stockName, int sQTY, BigDecimal price, int userId) {
        this.idInvestment = idInvestment;
        this.stockName = stockName;
        this.sQTY = sQTY;
        this.price = price;
        UserId = userId;
    }

    public int getIdInvestment() {
        return idInvestment;
    }

    public String getStockName() {
        return stockName;
    }

    public int getsQTY() {
        return sQTY;
    }

    public int getUserId() {
        return UserId;
    }
    public BigDecimal getPrice() {
        return price;
    }
    @Override
    public String toString() {
        return "ID: " + this.getIdInvestment() + "\n Name: " + this.getStockName() +
                "\n SQTY: " + this.getsQTY() +
                "\n Price: " + this.getPrice() +
                "\n User ID: " + this.getUserId();
    }
}
