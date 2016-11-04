package excercise.financialinstrument;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by joschinc on 11/2/16.
 */
public class FinancialInstrumentTest {

    private ArrayList<FinancialInstrument> financialInstruments;

    public FinancialInstrumentTest(){
        this.financialInstruments = new ArrayList<FinancialInstrument>();
    }
    public boolean addIntrument(FinancialInstrument f){
        return financialInstruments.add(f);
    }
    public double getInterest(){
        double result = 0;
        try {

            Iterator<FinancialInstrument> it = financialInstruments.iterator();
            while (it.hasNext()) {
                Object object =  it.next();
                if (object instanceof Bond) {
                    result += ((Bond) object).interest;
                }
            }

        } catch(Exception e){
            String messageError = e.getMessage();
            System.out.println(messageError);
        }
        return result;
    }
}
