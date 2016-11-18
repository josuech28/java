import com.exercise.Employee;

/**
 * Created by joschinc on 11/17/16.
 */
public class GBExample {
    public static void main(String [] args){
        System.out.println("Hello World");
        Employee employee = new Employee(1,"Josue");
        System.out.println(employee.toString());

        //Option One to call finalize
        //employee = new Employee();

        // Option Two to call finalize put the instance in null value
        //employee = null;

        // Option 3 reference
        Employee e2 = new Employee();
        e2 = employee;
        System.gc();
    }
}
