import org.junit.Test;

/**
 * Created by joschinc on 11/28/16.
 */
public class TimeTest {
    // Fail 
    @Test(timeout = 100)
    public void timeTest(){
        while (true)
            ;
    }
}
