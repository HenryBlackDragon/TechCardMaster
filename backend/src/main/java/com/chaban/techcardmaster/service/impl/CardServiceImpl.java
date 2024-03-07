package com.chaban.techcardmaster.service.impl;

import com.chaban.techcardmaster.model.Card;
import com.chaban.techcardmaster.repository.CardRepository;
import com.chaban.techcardmaster.service.CardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CardServiceImpl implements CardService {

    private final CardRepository cardRepository;

    @Override
    public List<Card> getAllCards() {
        return cardRepository.findAll();
    }

    @Override
    public Card createCard(Card card) {
        return cardRepository.save(card);
    }

    @Override
    public Card getCardById(String id) {
        return cardRepository.findById(id).orElseThrow(null);
    }

    @Override
    public Card updateCard(String id, Card card) {
        var existingCard = cardRepository.findById(id).orElseThrow(null);
        return cardRepository.save(existingCard);
    }

    @Override
    public void deleteCard(String id) {
        cardRepository.deleteById(id);
    }
}
