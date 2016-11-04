package excercise.financialinstrument;

import java.math.BigDecimal;

/**
 * Created by joschinc on 11/2/16.
 */
public class Bond extends FinancialInstrument {

    protected double interest;

    public Bond(BigDecimal b){
        super(b);
    }
}
