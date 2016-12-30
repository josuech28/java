package com.dao;

import com.model.Student;

import java.util.List;
import javax.sql.DataSource;
/**
 * Created by joschinc on 12/16/16.
 */
public interface DAO<T> {
    /**
     * This is the method to be used to create
     * a record in the Student table.
     */
     void create(T object);
    /**
     * This is the method to be used to list down
     * a record from the Student table corresponding
     * to a passed student id.
     */
     Student get(int id);
    /**
     * This is the method to be used to list down
     * all the records from the Student table.
     */
     List<T> list();
    /**
     * This is the method to be used to delete
     * a record from the Student table corresponding
     * to a passed student id.
     */
     void delete(int id);
    /**
     * This is the method to be used to update
     * a record into the Student table.
     */
     void update(T object);
    /**
     * This is the method to be used to get
     * number of rows from Student Table
     */
    int getMaxID();
}
