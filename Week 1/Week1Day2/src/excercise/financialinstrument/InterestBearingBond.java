package excercise.financialinstrument;

import java.math.BigDecimal;

/**
 * Created by joschinc on 11/2/16.
 */
public class InterestBearingBond extends Bond{

    public InterestBearingBond(BigDecimal b){
        super(b);
    }

    public void addInterest(double interest){
        this.interest +=  (interest / 100.0);
    }
}
