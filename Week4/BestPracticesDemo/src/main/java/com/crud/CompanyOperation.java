package com.crud;

import com.Employee.Employee;

/**
 * Created by joschinc on 11/25/16.
 */
public interface CompanyOperation {
    public boolean addEmployee(Employee employee);

    public boolean deleteEmployee(Employee employee);

}
