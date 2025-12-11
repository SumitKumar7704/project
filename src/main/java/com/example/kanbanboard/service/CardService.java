package com.example.kanbanboard.service;

import com.example.kanbanboard.domain.Card;

import java.util.List;

public interface CardService {
    Card createCard(Card card);
    List<Card> getCardsByBoard(String boardId);
    Card updateCard(String cardId, Card card);
    void deleteCard(String cardId);
}
