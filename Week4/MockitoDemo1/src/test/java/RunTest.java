/**
 * Created by joschinc on 11/23/16.
 */
public class RunTest {
    public static void main(String[] args) {
        PortafolioTester tester = new PortafolioTester();
        tester.setUp();
        System.out.println(tester.testMarketValue()?"PASS":"FAIL");
    }

}
