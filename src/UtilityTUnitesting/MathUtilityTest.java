package UtilityTUnitesting;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MathUtilityTest {
    
    @Test
    public void testAdd1(){
        int num1 = 5;
        int num2 = 10;
        int sum = MathUtility.add(num1, num2);
        assertEquals(15, sum);
    }

    @Test
    public void testAdd2() {
        int num1 = 6;
        int num2 = 12;
        int sum = MathUtility.add(num1, num2);
        assertEquals(18, sum);
    }
}
