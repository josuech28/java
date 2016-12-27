package com.dao;

import java.util.List;

/**
 * Created by joschinc on 12/26/16.
 */
public interface DAO<T> {
    void save(T object);

    List<T> list();
}
