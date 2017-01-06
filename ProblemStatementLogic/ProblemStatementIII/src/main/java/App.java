import java.util.Scanner;

import com.model.Input;
import com.service.ServicePrintPermutation;
import com.service.ServicePrintPermutationImpl;

/**
 *
 * @author joschinc
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input;
        Scanner in = new Scanner(System.in);//create input object
        System.out.println("Type the word");
        input = in.nextLine();

        Input object = new Input(input);
        ServicePrintPermutation service = new ServicePrintPermutationImpl();
        service.printPermutation(object);
    }
}
    

   
    

