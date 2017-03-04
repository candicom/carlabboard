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

    /**
     * Instantiates a new Board detail.
     */
    public BoardDetail() {}

    /**
     * Instantiates a new Board detail.
     *
     * @param content the content
     * @param board   the board
     */
    public BoardDetail(String content, Board board) {
        this.content = content;
        this.board = board;
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
     * Gets content.
     *
     * @return the content
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets content.
     *
     * @param content the content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * Gets board.
     *
     * @return the board
     */
    public Board getBoard() {
        return board;
    }

    /**
     * Sets board.
     *
     * @param board the board
     */
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
