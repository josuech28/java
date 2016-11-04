package excercise.taxtest;

/**
 * Created by joschinc on 11/1/16.
 */
public class TaxTest {

    private int grossIncome;
    private String country;
    private int dependents;

    public TaxTest(int grossIncome, String country, int dependents){
        this.grossIncome = grossIncome;
        this.country = country;
        this.dependents = dependents;
    }
    public TaxTest(int grossIncome, String country){
        this.grossIncome = grossIncome;
        this.country = country;
        this.dependents = 1;
    }

    @Override
    public String toString() {
        return "TaxTest{" +
                "grossIncome=" + grossIncome +
                ", country='" + country + '\'' +
                ", dependents=" + dependents +
                '}';
    }

}
