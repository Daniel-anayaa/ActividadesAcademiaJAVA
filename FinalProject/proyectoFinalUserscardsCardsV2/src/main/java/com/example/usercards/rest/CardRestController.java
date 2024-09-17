package com.example.usercards.rest;

import com.example.usercards.entity.Card;
import com.example.usercards.entity.Userscards;
import com.example.usercards.service.CardService;
import com.example.usercards.service.UsercardsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cards")
public class CardRestController {

    @Autowired
    private CardService cardService;

    @Autowired
    private UsercardsService usercardsService;

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/all")
    public List<Card> findAll() {
        return cardService.findAll();
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/{id}")
    public Optional<Card> findById(@PathVariable int id) {
        return cardService.findById(id);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/save")
    public Card save(@RequestBody Card card) {
        return cardService.save(card);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/{id}")
    public String deleteById(@PathVariable int id) {
        cardService.deleteById(id);
        return "Deleted card id - " + id;
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/user-cards-summary/{userId}")
    public String getUserCardsSummary(@PathVariable int userId) {
        Optional<Userscards> user = usercardsService.findById(userId);

        if (user.isPresent()) {
            Userscards userInfo = user.get();
            List<Card> cards = cardService.findAll();
            String summary = "User: " + userInfo.getFirstName() + " " + userInfo.getLastName() +
                    " (ID: " + userInfo.getId() + ") owns " +
                    userInfo.getNormalcards() + " normal cards, " +
                    userInfo.getRarecards() + " rare cards, and " +
                    userInfo.getSuperrarecards() + " super rare cards.";

            return summary + " Available card types: " + cards.size() + " cards in total.";
        } else {
            return "User not found.";
        }
    }
}
