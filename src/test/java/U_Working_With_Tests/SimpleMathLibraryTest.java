package U_Working_With_Tests;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SimpleMathLibraryTest {

    @Test
    public void mustBeSum() {
        double result = SimpleMathLibrary.add(3.49, 5.27);
        Assertions.assertEquals(8.76, result, 0.00001);
    }

    @Test
    public void mustBeDifference() {
        double result = SimpleMathLibrary.minus(9.48, 4.299);
        Assertions.assertEquals(5.181, result, 0.00001);
    }
}
