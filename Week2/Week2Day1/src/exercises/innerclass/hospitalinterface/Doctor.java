package exercises.innerclass.hospitalinterface;

/**
 * Created by joschinc on 11/8/16.
 */
public abstract class Doctor implements IDoctor {

    protected  void medice(){
        System.out.println("Prescribe medice...");
    }
    protected void ultrasonid(Person person){
        System.out.println("Doing a ultrasonid to.." + person.getName());
    }

}
