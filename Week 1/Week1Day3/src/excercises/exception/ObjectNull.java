package excercises.exception;

/**
 * Created by joschinc on 11/3/16.
 */
public class ObjectNull {

    private Object object;

    public ObjectNull(){
        this.object = null;
    }

    public void waitMethod() throws NullPointerException{
        try {
            if(this.object == null){
                throw new NullPointerException("Object is null");
            } else {
                System.out.println("I am waiting for " + this.object.getAge());
            }
        } catch (NullPointerException e){
            System.out.println(e);
        }

    }

    public int linch() {
        int a = 0;
        try{
            a = 1;
            System.out.println("I am in the try statement and a = 1");
            return a;

        }catch(Exception e){
            a = 2;
            return a;
        }
        finally {
             a = 3;
            System.out.println("I am in the finally  statement and a = 3");
            return a;
        }
    }
}
