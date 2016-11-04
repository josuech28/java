package excercise.bicyclecontract;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by joschinc on 11/1/16.
 */
public class RaicingTest {
    private ArrayList<Bicycle> bicycles;

    public RaicingTest(){
        this.bicycles = new ArrayList<Bicycle>();
    }

    public boolean addBicycle(Bicycle b) {
        boolean flag = false;
        if (b != null) {
            bicycles.add(b);
            flag = true;
        }
        return flag;
    }

    public void getSpeeds(){
        Iterator<Bicycle> it = bicycles.iterator();
        while(it.hasNext()){
            Bicycle bicycleTemp = it.next();
            System.out.println(bicycleTemp.getVelocity());
        }
    }
}
