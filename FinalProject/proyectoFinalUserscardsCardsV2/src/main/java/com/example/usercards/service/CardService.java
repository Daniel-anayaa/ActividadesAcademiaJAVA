package com.example.usercards.service;
import com.example.usercards.dao.CardRepository;
import com.example.usercards.entity.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CardService {

    @Autowired
    private CardRepository cardRepository;

    // Method to get all the cards
    public List<Card> findAll() {
        return cardRepository.findAll();
    }

    // Method to get a card by its id
    public Optional<Card> findById(int id) {
        return cardRepository.findById(id);
    }

    // Method to save or update an existing card
    public Card save(Card card) {
        return cardRepository.save(card);
    }

    // Method to eliminate a card by its id
    public void deleteById(int id) {
        cardRepository.deleteById(id);
    }
}
