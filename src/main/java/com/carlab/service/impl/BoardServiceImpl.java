package com.carlab.service.impl;

import com.carlab.dao.BoardRepository;
import com.carlab.model.Board;
import com.carlab.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Jack Kim on 2017-03-03.
 *
 */

@Service
public class BoardServiceImpl extends BaseService implements BoardService {

    @Autowired
    private BoardRepository boardRepository;

    @Override
    public List<Board> findAll() {
        return boardRepository.findAll();
    }

    @Override
    public List<Board> findAll(Sort sort) {
        return boardRepository.findAll(sort);
    }

    @Override
    public List<Board> findAll(Iterable<Long> ids) {
        return boardRepository.findAll(ids);
    }

    @Override
    public Board saveAndFlush(Board entity) {
        return boardRepository.saveAndFlush(entity);
    }

    @Override
    public void deleteInBatch(Iterable<Board> entities) {
        boardRepository.deleteInBatch(entities);
    }

    @Override
    public void deleteAllInBatch() {
        boardRepository.deleteAllInBatch();
    }

    @Override
    public Board getOne(Long id) {
        return boardRepository.getOne(id);
    }

    @Override
    public void delete(Long id) {
        boardRepository.delete(id);
    }
}
