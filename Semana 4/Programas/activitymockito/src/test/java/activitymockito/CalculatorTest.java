package activitymockito;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class CalculatorTest {

    @Test
    public void testAdd() {
        // Create a mock for AdditionService
        AdditionService additionServiceMock = mock(AdditionService.class);

        // Define the behavior of the mock
        when(additionServiceMock.add(2, 3)).thenReturn(5);

        // Create an instance of Calculator with the mock
        Calculator calculator = new Calculator(additionServiceMock);

        // Call the add method and verify the result
        int result = calculator.add(2, 3);
        assertEquals(5, result);

        // Verify that the add method of the mock was called once with the expected parameters
        verify(additionServiceMock, times(1)).add(2, 3);
    }
}
