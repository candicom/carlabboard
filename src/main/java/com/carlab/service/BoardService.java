package com.carlab.service;

import com.carlab.model.Board;
import org.springframework.data.domain.Sort;

import java.util.List;

/**
 * Created by Jack Kim on 2017-03-03.
 */
public interface BoardService {

    /**
     * findAll
     *
     * @return list list
     */
    List<Board> findAll();

    /**
     * Find all list.
     *
     * @param sort the sort
     * @return list list
     */
    List<Board> findAll(Sort sort);

    /**
     * Find all list.
     *
     * @param ids the ids
     * @return list list
     */
    List<Board> findAll(Iterable<Long> ids);

    /**
     * Saves an entity and flushes changes instantly.
     *
     * @param entity the entity
     * @return the saved entity
     */
    Board saveAndFlush(Board entity);


    /**
     * Delete in batch.
     *
     * @param entities the entities
     */
    void deleteInBatch(Iterable<Board> entities);

    /**
     * Deletes all entites in a batch call.
     */
    void deleteAllInBatch();


    /**
     * Gets one.
     *
     * @param id the id
     * @return the one
     */
    Board getOne(Long id);

    /**
     * delete
     *
     * @param id the id
     */
    void delete(Long id);
}
