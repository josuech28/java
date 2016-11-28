import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by joschinc on 11/28/16.
 */

public class OvenTest {

    @BeforeClass
    public static void setUp(){
        oven = new Oven();
        ovenStatus = OvenStatus.READY;
    }
    @Before
    public void turnOnOven(){
        System.out.println("Oven is on");
    }

    @After
    public void turnOffOven(){
        System.out.println("Oven is off");
    }

    @Test
    public void bakeReadyTest(){
        int result = oven.bake(ovenStatus);
        int expectted = 1;
        assertEquals("Fail no ready", result,expectted);

    }
    @Test
    public void bakeInProgressTest(){
        int result = oven.bake(OvenStatus.INPROGRESS);
        int expectted = 0;
        assertEquals("Fail no in Progress", result,expectted);

    }

    private static Oven oven;
    private static OvenStatus ovenStatus;
}
