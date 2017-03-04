package com.carlab.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by Jack Kim on 2017-03-03.
 *
 */

@Entity
public class BoardDetail implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    private String content;

    @JsonIgnore
    @OneToOne(mappedBy = "boardDetail")
    private Board board;

    public BoardDetail() {}

    public BoardDetail(String content, Board board) {
        this.content = content;
        this.board = board;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    @Override
    public String toString() {
        return "BoardDetail{" +
                "id=" + id +
                ", content='" + content + '\'' +
                '}';
    }
}
