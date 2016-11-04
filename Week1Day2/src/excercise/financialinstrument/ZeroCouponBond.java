package excercise.financialinstrument;

import java.math.BigDecimal;

/**
 * Created by joschinc on 11/2/16.
 */
public class ZeroCouponBond extends  Bond {

    public ZeroCouponBond(BigDecimal b){
        super(b);
    }

    public void addInterest(double interest){
        this.interest +=  (interest / 100.0);
    }
}
