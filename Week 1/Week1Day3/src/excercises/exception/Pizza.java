package excercises.exception;

/**
 * Created by joschinc on 11/3/16.
 */
public class Pizza {

    private int timeToBake;

    public Pizza(int timeToBake) {
        this.timeToBake = timeToBake;
    }

    public int getTimeToBake() {
        return timeToBake;
    }

    public void setTimeToBake(int timeToBake) {
        this.timeToBake = timeToBake;
    }

    public void bakePizza(Pizza pizza) throws Exception{
        try {
            if (pizza.getTimeToBake() > 5) {
                throw new Exception("Bake time is more than 5 minutes");
            } else {
                System.out.println("Pizza is baking");
            }
        } catch(Exception e){
            System.out.println(e);
        } finally {
            System.out.println("Oven is going to turning off");
        }

    }

}
