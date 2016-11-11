import exercises.generics.trainee.Trainee;

import java.util.ArrayList;
import java.util.List;

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


        IndiaCitizen indian = new IndiaCitizen(25,"Shashank");
        System.out.println(indian.toString());

       // Solar System

        NewSolarsSystemTest solarSystem = new NewSolarsSystemTest();
        solarSystem.getPlanets();

        ExistingSolarSystemTest existingSolarSystemTest = new ExistingSolarSystemTest();
        existingSolarSystemTest.getPlanets();

        Cards anf Game 28

         RankTest rank = new RankTest();
        rank.printValue();
        System.out.println(rank.getPoints());
        */
        /*

         */
        Trainee trainee = new Trainee();
        List<String> traineeList = new ArrayList<String>();
        traineeList.add("Maikol Zumbado");
        traineeList.add("Esteban Brenes");
        traineeList.add("Victor Montero");
        traineeList.add("Jose Pablo Granados");

        List<String> traineeList2 = new ArrayList<String>();
        traineeList2.add("Aljenadro Castillo");
        traineeList2.add("Esteban Brenes");
        traineeList2.add("Victor Montero");
        traineeList2.add("Jose Pablo Granados");


        trainee.addTrainee(115400450,traineeList);
        trainee.printTrainee();

    }
}
