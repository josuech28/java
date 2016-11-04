package excercises.employee;

import java.security.KeyStore;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Created by joschinc on 11/3/16.
 */
public class EmployeeTest {
    private Map<String, Department> departments;

    public EmployeeTest(){
        this.departments = new HashMap<String,Department>();
    }

    public Department getValue(String key){
        return departments.get(key);
    }

    public Department addDepartment(Department department){
        if (departments.containsKey(department.getIdDepartment())) {
            return department;
        } else {
            return departments.put(department.getIdDepartment(), department);
        }
    }

    public String  printDepartment(){
        String departmensInfo = "";
        Set<Entry<String,Department>> keySet = departments.entrySet();
        for(Entry<String,Department> obj : keySet){
            departmensInfo += obj.getValue().toString();
        }

        return departmensInfo;

    }

}
