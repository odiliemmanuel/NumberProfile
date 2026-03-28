import NumberProfile.NumberStatus;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

//        NumberStatus number = new NumberStatus();
//
//        number.getProfile("25");

        String input = "101101";
        String [] numbers =  input.split("");
        int [] array = new int[numbers.length];
            int index = 0;
            while(index < numbers.length){
                array[index] = Integer.parseInt(numbers[index]);

                if(array[index] == 1 || array[index] == 0){
                    continue;
                }
                else if (array[index] != 1 &&  array[index] != 0){
                    System.out.println(input + " is not binary number ");
                    break;
                }
                if(index == numbers.length - 1){
                    System.out.println(input + " is a binary number ");
                    break;
                }
                index++;

            }


        System.out.println(Arrays.toString(array));

    }










}

//    public static boolean fibonacci(int number){
//      int firstNumber = 0;
//      int secondNumber = 1;
//      int next =  firstNumber + secondNumber;
//
//      while(number > next){
//          firstNumber = secondNumber;
//          secondNumber = next;
//          next = firstNumber + secondNumber;
//          if(number == next) return true;
//      }
//      return false;
//    }

// https://github.com/odiliemmanuel/NumberProfile.git