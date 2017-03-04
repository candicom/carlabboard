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

    /**
     * Instantiates a new Board.
     */
    public Board() {}

    /**
     * Instantiates a new Board.
     *
     * @param title       the title
     * @param boardDetail the board detail
     */
    public Board(String title, BoardDetail boardDetail) {
        this.title = title;
        this.boardDetail = boardDetail;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Gets title.
     *
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets title.
     *
     * @param title the title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Gets board detail.
     *
     * @return the board detail
     */
    public BoardDetail getBoardDetail() {
        return boardDetail;
    }

    /**
     * Sets board detail.
     *
     * @param boardDetail the board detail
     */
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
