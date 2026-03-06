package NumberProfile;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NumberStatusTest {
    NumberStatus numberStatus;

    @BeforeEach
    public void setUp() {
        numberStatus = new NumberStatus();
    }

    @Test
    public void testThatMethodReturnsTrue_IfNumberIsEven(){
        assertTrue(numberStatus.isEvenNumber("6"));
    }


    @Test
    public void testThatMethodReturnsTrue_IfNumberIsAPerfectNumber(){
        assertTrue(numberStatus.isAPerfectNumber("496"));
    }

    @Test
    public void testThatMethodReturnsTheSquareOf_NumberPassedIn(){

        assertEquals(36, numberStatus.squareOfNumber("6"));
    }

    @Test
    public void testThatMethodReturnsTheFactorialOfNumber(){
        assertEquals(120, numberStatus.factorial("5"));
    }

    @Test
    public void testMethodReturnsTrueIfNumberIsAPalindrome(){
        assertTrue(numberStatus.isPalindrome("121"));
    }

    @Test
    public void testThatMethodReturnsTrueIfNumberIsAnArmstrongNumber(){
        assertTrue(numberStatus.isArmStrongNumber("153"));
    }

    @Test
    public void testThatMethodReturnsTrueIfNumberIsAPrimeNumber(){
        assertTrue(numberStatus.isPrime("29"));
    }

    @Test
    public void testThatMethodReturnsTrueIfNumberIsAnInteger(){
        assertTrue(numberStatus.isInteger("2"));
    }

    @Test
    public void testThatMethodReturnsTrueIfNumberIsANaturalNumber() {
        assertFalse(numberStatus.isNaturalNumber("0"));
        assertTrue(numberStatus.isNaturalNumber("1"));
    }

    @Test
    public void testThatNumberIsAWholeNumber(){
        assertTrue(numberStatus.isWholeNumber("0"));
        assertFalse(numberStatus.isWholeNumber("-1"));
    }

    @Test
    public void testThatNumberIsACompositeNumber(){
        assertTrue(numberStatus.isCompositeNumber("4"));
        assertTrue(numberStatus.isCompositeNumber("9"));
    }

    @Test
    public void testThatNumberIsADeficientNumber(){
        assertTrue(numberStatus.isDeficientNumber("8"));
        assertFalse(numberStatus.isDeficientNumber("20"));
    }

    @Test
    public void testThatNumberIsAAbundantNumber(){
        assertTrue(numberStatus.isAbundantNumber("12"));
        assertFalse(numberStatus.isAbundantNumber("5"));
    }


    @Test
    public void testThatANumberIsASquareNumber(){
        assertTrue(numberStatus.isSquareNumber("9"));
        assertFalse(numberStatus.isSquareNumber("8"));
        //1, 4, 9, 16, 25, 36, 49, 64, 81, and 100.
    }

    @Test
    public void testThatNumberIsACubeNumber(){
        assertTrue(numberStatus.isCubeNumber("216"));
        assertFalse(numberStatus.isCubeNumber("9"));
//      1, 8, 27, 64, 125, 216, 343, 512, 729, 1000
    }

    @Test
    public void testThatNumberIsAFibonacciNumber(){
        assertTrue(numberStatus.isFibonacciNumber("2"));
        assertFalse(numberStatus.isFibonacciNumber("4"));
//        0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
    }
}
