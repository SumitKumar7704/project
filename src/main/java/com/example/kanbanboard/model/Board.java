package com.example.kanbanboard.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.Instant;
import java.util.Date;
import java.util.List;

@Document(collection = "boards")
public class Board {

    @Id
    private String boardId;
    private String boardName;
    private String boardDescription;
    private List<Column> columns;
    private List<String> memberIds;   // user IDs part of the board
    private Date createdAt;
    private Date  updatedAt;

    public Board() {
    }

    public Board(String boardId, String boardName, String boardDescription, List<Column> columns, List<String> memberIds, Date  createdAt, Date  updatedAt) {
        this.boardId = boardId;
        this.boardName = boardName;
        this.boardDescription = boardDescription;
        this.columns = columns;
        this.memberIds = memberIds;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public String getBoardId() {
        return boardId;
    }

    public void setBoardId(String boardId) {
        this.boardId = boardId;
    }

    public String getBoardName() {
        return boardName;
    }

    public void setBoardName(String boardName) {
        this.boardName = boardName;
    }

    public String getBoardDescription() {
        return boardDescription;
    }

    public void setBoardDescription(String boardDescription) {
        this.boardDescription = boardDescription;
    }

    public List<Column> getColumns() {
        return columns;
    }

    public void setColumns(List<Column> columns) {
        this.columns = columns;
    }

    public List<String> getMemberIds() {
        return memberIds;
    }

    public void setMemberIds(List<String> memberIds) {
        this.memberIds = memberIds;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date  createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date  updatedAt) {
        this.updatedAt = updatedAt;
    }
}
