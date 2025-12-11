package com.example.kanbanboard.repository;

import com.example.kanbanboard.domain.Card;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CardRepository extends MongoRepository<Card, String> {
    List<Card> findByBoardId(String boardId);
    List<Card> findByColumnId(String columnId);
    int countByAssignedToAndColumnId(Long assignedTo, String columnId);
}
