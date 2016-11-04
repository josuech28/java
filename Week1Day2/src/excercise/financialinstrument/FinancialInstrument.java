package excercise.financialinstrument;

import java.math.BigDecimal;

/**
 * Created by joschinc on 11/2/16.
 */
public class FinancialInstrument {

    private final BigDecimal pay;

    public FinancialInstrument(BigDecimal pay){
        this.pay = pay;
    }

    public BigDecimal getPay() {
        return pay;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
