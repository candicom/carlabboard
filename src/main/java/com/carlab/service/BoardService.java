package com.carlab.service;

import com.carlab.model.Board;
import org.springframework.data.domain.Sort;

import java.util.List;

/**
 * Created by Jack Kim on 2017-03-03.
 *
 */

public interface BoardService {

    /**
     * findAll
     * @return
     */
    List<Board> findAll();

    /**
     * @param sort
     * @return
     */
    List<Board> findAll(Sort sort);

    /**
     *
     * @param ids
     * @return
     */
    List<Board> findAll(Iterable<Long> ids);

    /**
     * Saves an entity and flushes changes instantly.
     * @param entity
     * @return the saved entity
     */
    Board saveAndFlush(Board entity);

    /**
     * Deletes the given entities in a batch which means it will create a single {@link Query}. Assume that we will clear
     * the {@link javax.persistence.EntityManager} after the call.
     *
     * @param entities
     */
    void deleteInBatch(Iterable<Board> entities);

    /**
     * Deletes all entites in a batch call.
     */
    void deleteAllInBatch();

    /**
     * Returns a reference to the entity with the given identifier.
     * @param id must not be {@literal null}.
     * @return a reference to the entity with the given identifier.
     * @see EntityManager#getReference(Class, Object)
     */
    Board getOne(Long id);

    /**
     * delete
     * @param id
     */
    void delete(Long id);
}
