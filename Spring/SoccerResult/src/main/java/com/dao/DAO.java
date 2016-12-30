package com.dao;

import java.util.List;

/**
 * Created by joschinc on 12/29/16.
 */
public interface DAO<T> {
    void save(T object);
    T get(T object);
    List<T> list();
    void delete(T object);
    void update(T object);
}
