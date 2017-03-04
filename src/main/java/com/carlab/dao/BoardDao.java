package com.carlab.dao;

import com.carlab.model.Board;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Jack Kim on 2017-03-03.
 *
 */

@Repository
@Transactional
public class BoardDao extends BaseDao {

    @SuppressWarnings("unchecked")
    public List<Board> getBoards() {

//        return entityManager.createQuery("SELECT b FROM Board b").getResultList();
        return null;
    }

}
