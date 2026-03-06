package NumberProfile;

import java.util.ArrayList;
import java.util.List;

public class NumberStatus {


    public boolean isEvenNumber(int number) {

        if(number % 2 == 0){
            System.out.println(number + " is an Even Number");
            return true;
        }

        else{
            System.out.println(number + " is an Odd Number");
            return false;
        }

    }


    public boolean isAPerfectNumber(int number) {
        int factor = 0;
        for(int count = 1; count <= number/2; count ++){
            if(number % count == 0){
                factor +=  count;
            }
        }

        if(factor == number){
            System.out.println(number + " is a perfect Number");
            return true;
        }

        else{
            return false;
        }
    }


    public int squareOfNumber(int number) {
        int result = number * number;
        System.out.println("square of " + number + " is " + result);


        return result;
    }


    public int factorial(int number){
        int factorial = 1;

        for(int count = 1; count <= number; count ++){
            factorial *= count;
        }
        System.out.println("factorial of " + number + " is " + factorial);

        return factorial;
    }

    public boolean checkIsPalindrome(int number) {

        int value = number;
        int reversedNumber = 0;
        int digit = 0;

        while(value > 0){
            digit = value % 10;
            reversedNumber = reversedNumber * 10 + digit;
            value /= 10;

        }
        if(reversedNumber == number){
            System.out.println(number + " is a palindrome number");
            return true;
        }
        else{
            return false;
        }
    }

    public boolean checkArmStrongNumber(int number) {
        String length = Integer.toString(number);
        int value = length.length();


        int digit = 0;
        int result = 0;
        int tempNumber = number;


        while(tempNumber > 0){
            digit = tempNumber % 10;
            result += (int)Math.pow(digit, value);
            tempNumber /= 10;

        }

        if(result == number){
            System.out.println(number + " is an Armstrong number");
            return true;
        }

        else{
            return false;
        }

    }


    public boolean isPrime(int number) {

        int counter = 0;
        for(int count = 1; count <= number; count ++){
            if(number % count == 0){
                counter++;
            }
        }
        if(counter == 2){
            System.out.println(number + " is a prime number");
            return true;
        }
        return false;
    }

    public void getProfile(int number) {

        isEvenNumber(number);
        isAPerfectNumber(number);
        squareOfNumber(number);
        factorial(number);
        checkIsPalindrome(number);
        checkArmStrongNumber(number);
        isPrime(number);



    }
}
