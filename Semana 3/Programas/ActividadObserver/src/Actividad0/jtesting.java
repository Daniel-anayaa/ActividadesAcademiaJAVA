package Actividad0;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class jtesting {

    private Product product;
    private Client client1;
    private Client client2;

    @BeforeEach
    void setUp() {
        // Inicializar el producto y los clientes antes de cada prueba
        product = new Product("Bread", 1.0);
        client1 = new Client("Alice", product);
        client2 = new Client("Bob", product);
    }

    @Test
    void testAttachObserver() {
        // Check the observers
        assertEquals(2, product.observers.size());
        assertTrue(product.observers.contains(client1));
        assertTrue(product.observers.contains(client2));
    }

    @Test
    void testDetachObserver() {
        // Eliminate a client and see if it worked
        product.detach(client1);
        assertEquals(1, product.observers.size());
        assertFalse(product.observers.contains(client1));
        assertTrue(product.observers.contains(client2));
    }

    @Test
    void testNotifyObservers() {
        // Test if clients receive information
        client1.update(); 
        client2.update();
        
        product.setPrice(1.2); // changes the prices
        
    }
    
}
