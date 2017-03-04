package com.carlab.dao;

import com.carlab.model.Board;
import com.carlab.model.BoardDetail;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Jack Kim on 2017-03-03.
 *
 */

@Transactional
public class BoardDaoTest {

//    @Autowired
//    private EntityManagerFactory entityManagerFactory;
//    private EntityManager entityManager;
//    @PersistenceContext
//    private EntityManager entityManager;

//    @Test
//    public void oneToOneTest() {
//        Board board = new Board();
//        board.setTitle("테스트 치킨");
//        entityManager.persist(board);
//
//        BoardDetail boardDetail = new BoardDetail();
//        boardDetail.setContent("테스트 치킨입니다. 글로벌 테스트 치킨 프랜차이즈 입니다.");
//        boardDetail.setBoard(board);
//        entityManager.persist(boardDetail);
//
//        Assert.assertEquals(board.getBoardDetail().getId(), boardDetail.getId());
//    }

//    @Before
//    public void setUp() throws Exception {
////        entityManager = entityManagerFactory.createEntityManager();
//        entityManager.getTransaction().begin();
//    }

//    @After
//    public void after() {
//        entityManager.getTransaction().commit();
//        entityManager.close();
//    }

}
