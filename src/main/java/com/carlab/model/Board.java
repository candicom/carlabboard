package com.carlab.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by Jack Kim on 2017-03-03.
 *
 */

@Entity
public class Board implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    private String title;

    @OneToOne
    @JoinColumn(name = "BOARDDETAIL_ID", referencedColumnName = "id")
    private BoardDetail boardDetail;

    public Board() {}

    public Board(String title, BoardDetail boardDetail) {
        this.title = title;
        this.boardDetail = boardDetail;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BoardDetail getBoardDetail() {
        return boardDetail;
    }

    public void setBoardDetail(BoardDetail boardDetail) {
        this.boardDetail = boardDetail;
    }

    @Override
    public String toString() {
        return "Board{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", boardDetail=" + boardDetail +
                '}';
    }
}
