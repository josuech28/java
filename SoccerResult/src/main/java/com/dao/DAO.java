package com.dao;

import java.util.List;

/**
 * Created by joschinc on 12/29/16.
 */
public interface DAO<T> {
    boolean save(T object);
    T get(T object);
    List<T> list();
    boolean delete(T object);
    void update(T object);
}
