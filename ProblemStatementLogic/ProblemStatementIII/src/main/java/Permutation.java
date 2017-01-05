import java.util.List;
import java.util.Scanner;

import com.model.Input;
import com.model.Logic;

/**
 *
 * @author Josué Chinchilla H.
 */
public class Permutation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input;
        Scanner in = new Scanner(System.in);//create input object
        System.out.println("Type the word");
        input = in.nextLine();

        Input object = new Input();
        String string = input;
        object.setPermute(string);

        Logic logic = new Logic();
        //Get list of permutations
        if(string.length()>0){
        List<String> permutations  = logic.permutation("Word : ",object);  
        //Sort list
        logic.sort(permutations);

        String[] list_permutations  = new String[permutations .size()]; 
        //Assign content of array 
        logic.assignArray(list_permutations, permutations);
        
        //Print list of permutations
        System.out.println("***List of Permutations***");
        logic.printArray(list_permutations);
        
        //Print number of permutations
        int array_size = logic.arraySize(list_permutations); 
        System.out.println("Number of permutations: "+array_size);
        } else {
            System.out.println("Empty Word");
        }
    }
}
    

   
    

