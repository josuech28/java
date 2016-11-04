package excercises.hashmap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.*;
import java.util.Map.Entry;

/**
 * Created by joschinc on 11/3/16.
 */
public class EmployeeTestLinkedMap {
    private Map<Integer,String> employees;

    public EmployeeTestLinkedMap(){
        this.employees = new TreeMap<>();
    }

    public String addEmployee(Employee e) {
        return employees.put(e.getId(),e.getName());
    }
    public void printEmployee(){
        Set<Entry<Integer,String>> keySet = employees.entrySet();
        for(Entry<Integer,String> value: keySet){
            System.out.println(value.toString());
        }
    }
}
