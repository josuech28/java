/**
 * Created by joschinc on 11/28/16.
 */
public class Oven {
    public int bake(OvenStatus ovenStatus){
        System.out.println("Bake....");
        if(ovenStatus.compareTo(OvenStatus.READY) == 0){
            return 1;
        }
        return 0;
    }
}
