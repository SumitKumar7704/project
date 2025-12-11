package com.example.kanbanboard.service;

import com.example.kanbanboard.domain.Board;

import java.util.List;

public interface BoardService {
    Board createBoard(Board board);
    List<Board> getBoardsForUser(Long userId);
    Board getBoardById(String boardId);
    Board updateBoard(String boardId, Board board);
    void deleteBoard(String boardId);
}
