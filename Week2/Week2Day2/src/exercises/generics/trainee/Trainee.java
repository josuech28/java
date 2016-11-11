package exercises.generics.trainee;

import java.util.*;

/**
 * Created by joschinc on 11/11/16.
 */
public final class Trainee {
    private Map<Integer,List<String>> trainees = new HashMap<Integer, List<String>>();

    public List<String> addTrainee(Integer id, List<String> trainee){
         return trainees.put(id,trainee);
    }
    public void printTrainee(){
        Set<Map.Entry<Integer,List<String>>> keySet = trainees.entrySet();
        for(Map.Entry<Integer,List<String>> elemetTrainee: trainees.entrySet()){
            System.out.println(elemetTrainee.getKey());
            System.out.println("List of Trainees");
            for(Object trainee: elemetTrainee.getValue()){
                System.out.println(trainee);
            }
        }
    }
}
