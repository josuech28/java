import com.model.Input;
import com.service.ServiceCheck;
import com.service.ServiceCheckImpl;
import com.sun.tools.internal.ws.wsdl.document.Service;
import com.sun.tools.internal.ws.wsdl.document.soap.SOAPUse;

import java.util.Scanner;


/**
 * Created by joschinc on 1/5/17.
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Digit your expression");
        Scanner sc = new Scanner(System.in);
        String expression = sc.nextLine();
        Input text = new Input(expression);
        ServiceCheckImpl service = new ServiceCheckImpl();
        if(service.checkExpression(text)){
            System.out.println("Expression is correct! (true)");
        } else {
            System.out.println("Invalid expression! (false))");
        }

    }
}
