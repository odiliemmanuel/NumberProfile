package NumberProfile;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NumberStatusTest {
    NumberStatus numberStatus;

    @BeforeEach
    public void setUp() {
        numberStatus = new NumberStatus();
    }

    @Test
    public void testThatMethodReturnsTrue_IfNumberIsEven(){
        assertTrue(numberStatus.isEvenNumber(6));
    }


    @Test
    public void testThatMethodReturnsTrue_IfNumberIsAPerfectNumber(){
        assertTrue(numberStatus.isAPerfectNumber(496));
    }

    @Test
    public void testThatMethodReturnsTheSquareOf_NumberPassedIn(){
        assertEquals(36, numberStatus.squareOfNumber(6));
    }

    @Test
    public void testThatMethodReturnsTheFactorialOfNumber(){
        assertEquals(120, numberStatus.factorial(5));
    }

    @Test
    public void testMethodReturnsTrueIfNumberIsAPalindrome(){
        assertTrue(numberStatus.checkIsPalindrome(121));
    }

    @Test
    public void testThatMethodReturnsTrueIfNumberIsAnArmstrongNumber(){
        assertTrue(numberStatus.checkArmStrongNumber(153));
    }

    @Test
    public void testThatMethodReturnsTrueIfNumberIsAPrimeNumber(){
        assertTrue(numberStatus.isPrime(29));
    }
}
