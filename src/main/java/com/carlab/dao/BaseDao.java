package com.carlab.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by Jack Kim on 2017-03-03.
 *
 */

public abstract class BaseDao {

    // ------------------------
    // PRIVATE FIELDS
    // ------------------------

    // An EntityManager will be automatically injected from entityManagerFactory
    // setup on DatabaseConfig class.
    @PersistenceContext
    protected EntityManager entityManager;

}
