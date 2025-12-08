package com.example.kanbanboard.repository;

import com.example.kanbanboard.model.Board;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface BoardRepository extends MongoRepository<Board, String> {
    List<Board> findByCreatedByUserId(String userId);
}


