package NumberProfile;


public class NumberStatus {


    public boolean isEvenNumber(String input) {
        int number = Integer.parseInt(input);
        if(number % 2 == 0){
            System.out.println(number + " is an Even Number");
            return true;
        }

        else{
            System.out.println(number + " is an Odd Number");
            return false;
        }

    }


    public boolean isAPerfectNumber(String input) {
        int number = Integer.parseInt(input);
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


    public int squareOfNumber(String input) {
        int number = Integer.parseInt(input);
        int result = number * number;
        System.out.println("square of " + number + " is " + result);


        return result;
    }


    public int factorial(String input){
        int number = Integer.parseInt(input);
        int factorial = 1;

        for(int count = 1; count <= number; count ++){
            factorial *= count;
        }
        System.out.println("factorial of " + number + " is " + factorial);

        return factorial;
    }



    public boolean isPalindrome(String input){
        int number = Integer.parseInt(input);
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



    public boolean isArmStrongNumber(String input) {
        int number = Integer.parseInt(input);
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


    public boolean isPrime(String input) {
        int number = Integer.parseInt(input);
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



    public boolean isInteger(String number){
      if(number != null == number.matches("[-?\\d]+")){
          System.out.println(number + " is an Integer");
          return true;
      }
      else{
          return false;
      }
    }



    public boolean isNaturalNumber(String input){
        int number = Integer.parseInt(input);
        if(Math.floor(number) == number && number > 0){
            System.out.println(number + " is a natural number");
            return true;
        }
        else{
            return false;
        }
    }




    public boolean isWholeNumber(String input){
        int number = Integer.parseInt(input);
        if(Math.floor(number) == number && number >= 0){
            System.out.println(number + " is a whole number");
            return true;
        }
        else{
            return false;
        }
    }



    public boolean isCompositeNumber(String input) {
        int number = Integer.parseInt(input);
        int factorCount = 0;
        for(int count = 1; count <= number; count ++){
            if(number % count == 0){
                factorCount++;
            }
        }
        if(factorCount > 2){
            System.out.println(number + " is a composite number");
            return true;
        }
        return false;
    }


    public boolean isDeficientNumber(String input){
        int number = Integer.parseInt(input);
        int sum = 0;
        for(int count = 1; count < number; count ++){
            if(number % count == 0){
                sum += count;
            }
        }

        if(sum < number){
            System.out.println(number + " is a deficient number");
            return true;
        }
        else{
            return false;
        }
    }


    public boolean isAbundantNumber(String input) {
        int number = Integer.parseInt(input);
        int sum = 0;
        for(int count = 1; count < number; count ++){
            if(number % count == 0){
                sum += count;
            }
        }

        if(sum > number){
            System.out.println(number + " is an abundant number");
            return true;
        }
        else{
            return false;
        }
    }


    public boolean isSquareNumber(String input) {
        int number = Integer.parseInt(input);
        for(int count = 1; count <= number; count ++){
            if(count * count == number){
                System.out.println(number + " is a square number");
                return true;
            }

        }
        return false;
    }


    public boolean isCubeNumber(String input) {
        int number = Integer.parseInt(input);
        for(int count = 1; count <= number; count ++){
            if(count * count * count == number){
                System.out.println(number + " is a cube number");
                return true;
            }
        }
        return false;
    }

//    public boolean isFibonacciNumber(String input) {
//        int number = Integer.parseInt(input);
//
//
//    }



    public void getProfile (String number){

        isEvenNumber(number);
        isAPerfectNumber(number);
        squareOfNumber(number);
        factorial(number);
        isPalindrome(number);
        isArmStrongNumber(number);
        isPrime(number);
        isInteger(number);
        isNaturalNumber(number);
        isWholeNumber(number);
        isCompositeNumber(number);
        isDeficientNumber(number);
        isAbundantNumber(number);
        isSquareNumber(number);
        isCubeNumber(number);


    }
}
