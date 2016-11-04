package excercises.exception;

import java.math.BigDecimal;

/**
 * Created by joschinc on 11/3/16.
 */
public class Principal {

    private BigDecimal interest;
    private BigDecimal time;
    private BigDecimal rate;


    public Principal(BigDecimal interest, BigDecimal time, BigDecimal rate) {
        this.interest = interest;
        this.time = time;
        this.rate = rate;
    }

    public BigDecimal getPrincipal(){
        try{
            BigDecimal porcent = new BigDecimal("100");
            BigDecimal result = new BigDecimal("0");
            BigDecimal tempResult = new BigDecimal("0");
            result = interest;
            result.multiply(porcent);
            tempResult = rate;
            tempResult.multiply(time);
            result.divide(tempResult);
            int a = 100 / 0;
            return result;
        } catch (ArithmeticException e){
            System.out.println(e);
        }
        return null;
    }

}
