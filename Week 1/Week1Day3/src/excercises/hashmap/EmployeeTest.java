package excercises.hashmap;

import java.util.*;
import java.util.Map.Entry;

/**
 * Created by joschinc on 11/3/16.
 */
public class EmployeeTest {
    private HashMap<Integer,String> employees;


    public EmployeeTest(){

        this.employees = new HashMap<Integer,String>();
    }

    public String addEmployee(int id, String name){

        return  employees.put(id,name);
    }

    public String removeEmployee(int id){

        return employees.remove(id);
    }

    public void clearEmployee(){

        employees.clear();
    }

    public void printEmployeeID(){
        Set<Integer> keySet = employees.keySet();
        for(Integer key: keySet){
            System.out.println(key.toString());
        }
    }
    public void printEmployeeName(){
        Collection<String> keySet = employees.values();
        for(String value: keySet){
            System.out.println(value.toString());
        }
    }

    public  void printEmployee(){
        Set<Entry<Integer,String>> keySet = employees.entrySet();
        for(Entry<Integer,String> value : keySet){
            System.out.println(value.toString());
        }
    }
}
