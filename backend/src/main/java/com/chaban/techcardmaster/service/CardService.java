package com.chaban.techcardmaster.service;

import com.chaban.techcardmaster.model.Card;

import java.util.List;

public interface CardService {

    List<Card> getAllCards();

    Card getCardById(String id);

    Card createCard(Card techCard);

    Card updateCard(String id, Card card);

    void deleteCard(String id);
}
