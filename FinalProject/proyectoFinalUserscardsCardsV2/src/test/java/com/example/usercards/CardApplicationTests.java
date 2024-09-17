package com.example.usercards;

import com.example.usercards.entity.Card;
import com.example.usercards.entity.Userscards;
import com.example.usercards.service.CardService;
import com.example.usercards.service.UsercardsService;
import com.example.usercards.rest.CardRestController;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class CardApplicationTests {

    @Mock
    private CardService cardService;

    @Mock
    private UsercardsService usercardsService;

    @InjectMocks
    private CardRestController cardRestController;


    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this); // Initialize mocks
    }



    @Test
    void testFindAll() {
        // Arrange
        Card card1 = new Card(1, "Dragon", "Rare", 25, "A powerful dragon card"); 
        Card card2 = new Card(2, "Phoenix", "Rare",50, "A mythical phoenix card"); 
        when(cardService.findAll()).thenReturn(Arrays.asList(card1, card2));

        // Act
        List<Card> result = cardRestController.findAll();

        // Assert
        assertNotNull(result, "Result should not be null");
        assertEquals(2, result.size(), "There should be 2 cards in the list");
        verify(cardService, times(1)).findAll();
    }

    @Test
    void testFindById() {
        // Arrange
        Card card = new Card(1, "Dragon", "Normal", 25, "A powerful dragon card"); 
        when(cardService.findById(1)).thenReturn(Optional.of(card));

        // Act
        Optional<Card> result = cardRestController.findById(1);

        // Assert
        assertTrue(result.isPresent(), "Card should be present");
        assertEquals("Dragon", result.get().getName(), "Card's name should be Dragon");
        verify(cardService, times(1)).findById(1);
    }

    @Test
    void testSave() {
        // Arrange
        Card card = new Card(1, "Dragon", "Normal", 25, "A powerful dragon card"); 
        when(cardService.save(card)).thenReturn(card);

        // Act
        Card result = cardRestController.save(card);

        // Assert
        assertNotNull(result, "Saved card should not be null");
        assertEquals("Dragon", result.getName(), "Card's name should be Dragon");
        verify(cardService, times(1)).save(card);
    }

    @Test
    void testDeleteById() {
        // Act
        String result = cardRestController.deleteById(1);

        // Assert
        assertEquals("Deleted card id - 1", result);
        verify(cardService, times(1)).deleteById(1);
    }

    @Test
    void testGetUserCardsSummary_UserExists() {
        // Arrange
        Userscards user = new Userscards(1, "Jose", "Villarreal", 22, "josevillarreal@cards.com", 33, 45, 4);
        when(usercardsService.findById(1)).thenReturn(Optional.of(user));
        Card card1 = new Card(1, "Dragon", "Normal", 25, "A powerful dragon card"); 
        Card card2 = new Card(2, "Phoenix", "Rare", 50, "A mythical phoenix card"); 
        when(cardService.findAll()).thenReturn(Arrays.asList(card1, card2));

        // Act
        String result = cardRestController.getUserCardsSummary(1);

        // Assert
        assertTrue(result.contains("Jose Villarreal"), "user's name");
        assertTrue(result.contains("33 normal cards"), "normal cards count");
        assertTrue(result.contains("2 cards in total"), "total number of cards");
        verify(usercardsService, times(1)).findById(1);
        verify(cardService, times(1)).findAll();
    }

    @Test
    void testGetUserCardsSummary_UserNotFound() {
        // Arrange
        when(usercardsService.findById(1)).thenReturn(Optional.empty());

        // Act
        String result = cardRestController.getUserCardsSummary(1);

        // Assert
        assertEquals("User not found.", result);
        verify(usercardsService, times(1)).findById(1);
        verify(cardService, never()).findAll(); // Verify findAll is never called when user is not found
    }
}