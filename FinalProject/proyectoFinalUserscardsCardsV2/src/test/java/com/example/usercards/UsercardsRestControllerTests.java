package com.example.usercards;

import com.example.usercards.entity.Userscards;
import com.example.usercards.rest.UsercardsRestController;
import com.example.usercards.service.UsercardsService;
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

class UsercardsRestControllerTests {

    @Mock
    private UsercardsService usercardsService; // Mock the service layer

    @InjectMocks
    private UsercardsRestController usercardsRestController; // Inject the mock into the controller

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this); // Initialize mocks
    }

    @Test
    void testFindAll() {
        // Arrange
        Userscards user1 = new Userscards(1, "Jose", "Villarreal", 22, "josevillarreal@cards.com", 33, 45, 4);
        Userscards user2 = new Userscards(2, "Jack", "Bauer", 44, "jackbauer@cards.com", 23, 42, 2);
        when(usercardsService.findAll()).thenReturn(Arrays.asList(user1, user2));

        // Act
        List<Userscards> result = usercardsRestController.findAll();

        // Assert
        assertNotNull(result, "Result should not be null");
        assertEquals(2, result.size(), "There should be 2 users in the list");
        verify(usercardsService, times(1)).findAll();
    }

    @Test
    void testFindById() {
        // Arrange
        Userscards user = new Userscards(1, "Jose", "Villarreal", 22, "josevillarreal@cards.com", 33, 45, 4);
        when(usercardsService.findById(1)).thenReturn(Optional.of(user));

        // Act
        Optional<Userscards> result = usercardsRestController.findById(1);

        // Assert
        assertTrue(result.isPresent(), "User should be present");
        assertEquals("Jose", result.get().getFirstName(), "User's first name should be Jose");
        verify(usercardsService, times(1)).findById(1);
    }

    @Test
    void testSave() {
        // Arrange
        Userscards user = new Userscards(1, "Jose", "Villarreal", 22, "josevillarreal@cards.com", 33, 45, 4);
        when(usercardsService.save(user)).thenReturn(user);

        // Act
        Userscards result = usercardsRestController.save(user);

        // Assert
        assertNotNull(result, "Saved user should not be null");
        assertEquals("Jose", result.getFirstName());
        verify(usercardsService, times(1)).save(user);
    }

    @Test
    void testDeleteById() {
        // Arrange
        doNothing().when(usercardsService).deleteById(1);

        // Act
        String result = usercardsRestController.deleteById(1);

        // Assert
        assertEquals("Deleted user card id - 1", result);
        verify(usercardsService, times(1)).deleteById(1);
    }

    @Test
    void testFindByNormalCards() {
        // Arrange
        Userscards user = new Userscards(1, "Jose", "Villarreal", 22, "josevillarreal@cards.com", 33, 45, 4);
        when(usercardsService.findByNormalCards(33)).thenReturn(Arrays.asList(user));

        // Act
        List<Userscards> result = usercardsRestController.findByNormalCards(33);

        // Assert
        assertNotNull(result, "Result should not be null");
        assertEquals(1, result.size(), "There should be 1 user with 33 normal cards");
        assertEquals(33, result.get(0).getNormalcards(), "The user should have 33 normal cards");
        verify(usercardsService, times(1)).findByNormalCards(33);
    }

    @Test
    void testFindByRareCards() {
        // Arrange
        Userscards user = new Userscards(1, "Jose", "Villarreal", 22, "josevillarreal@cards.com", 33, 45, 4);
        when(usercardsService.findByRareCards(45)).thenReturn(Arrays.asList(user));

        // Act
        List<Userscards> result = usercardsRestController.findByRareCards(45);

        // Assert
        assertNotNull(result, "Result should not be null");
        assertEquals(1, result.size(), "There should be 1 user with 45 rare cards");
        assertEquals(45, result.get(0).getRarecards(), "The user should have 45 rare cards");
        verify(usercardsService, times(1)).findByRareCards(45);
    }

    @Test
    void testFindBySuperRareCards() {
        // Arrange
        Userscards user = new Userscards(1, "Jose", "Villarreal", 22, "josevillarreal@cards.com", 33, 45, 4);
        when(usercardsService.findBySuperRareCards(4)).thenReturn(Arrays.asList(user));

        // Act
        List<Userscards> result = usercardsRestController.findBySuperRareCards(4);

        // Assert
        assertNotNull(result, "Result should not be null");
        assertEquals(1, result.size(), "There should be 1 user with 4 super rare cards");
        assertEquals(4, result.get(0).getSuperrarecards(), "The user should have 4 super rare cards");
        verify(usercardsService, times(1)).findBySuperRareCards(4);
    }
}
