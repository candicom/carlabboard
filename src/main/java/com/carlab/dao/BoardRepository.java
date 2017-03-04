package com.carlab.dao;

import com.carlab.model.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Jack Kim on 2017-03-04.
 */
public interface BoardRepository extends JpaRepository<Board, Long> {

    // List<T> findAll()
    // List<T> findAll(Sort sort)
    // List<T> findAll(Iterable<ID> ids)
    // <S extends T> List<S> save(Iterable<S> entities)
    // void flush()
    // <S extends T> S saveAndFlush(S entity)
    // void deleteInBatch(Iterable<T> entities)
    // void deleteAllInBatch()
    // T getOne(ID id)
    // <S extends T> List<S> findAll(Example<S> example)
    // <S extends T> List<S> findAll(Example<S> example, Sort sort)

}
