package com.carlab.controller;

import com.carlab.model.Board;
import com.carlab.service.BoardService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Response;
import java.util.List;

/**
 * Created by Jack Kim on 2017-03-03.
 *
 */


@RestController
@RequestMapping("/api/board")
public class ApiBoardController {
    private final Logger logger = LoggerFactory.getLogger("ApiBoardController");

    @Autowired
    private BoardService boardService;

    @RequestMapping("/")
    public ResponseEntity<String> home() {

        return ResponseEntity.ok("Hello Api Board");
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Iterable<Board>> list() {
        Iterable<Board> boards = boardService.findAll();
//        logger.debug(boards.toString());
        return new ResponseEntity<Iterable<Board>>(boards, HttpStatus.OK);
    }
}
