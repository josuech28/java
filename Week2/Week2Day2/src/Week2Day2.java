import exercises.enums.citizens.IndiaCitizen;
import exercises.enums.directions.DirectionList;
import exercises.enums.directions.DirectionUser;
import exercises.enums.directions.User;

/**
 * Created by joschinc on 11/9/16.
 */
public class Week2Day2 {
    @SuppressWarnings("unused")
    public static void main(String[] args){
        /*
            Worker Override

            Worker worker = new Worker(1,"Josue");
            System.out.println(worker.toString());
            int i = 2;
         */

        /*
            Employee Deprecated

            Employee e1 = new Employee();
            e1.printEmployee();
         */
        /*
            Enums

        DirectionList directionList = new DirectionList();
        directionList.getDirections();
        directionList.printListDirection();

        User user = new User();
        user.setDirectionOne("north");
        user.setDirectionTwo("north");

        DirectionUser du = new DirectionUser();
        du.setUser(user);
        System.out.println(du.sameDirection(user));
        System.out.println(du.toString());

        */

        IndiaCitizen indian = new IndiaCitizen(25,"Shashank");
        //indian.setName("Shashank");
        //indian.setAge(25);
        System.out.println(indian.toString());


    }
}
