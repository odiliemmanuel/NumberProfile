import NumberProfile.NumberStatus;


public class Main {
    public static void main(String[] args) {
//
//        NumberStatus number = new NumberStatus();
//
//        number.getProfile("-5");
        int number = 4;
         boolean result = fibonacci(100);
        System.out.println(result);


    }

    public static boolean fibonacci(int number){
      int firstNumber = 0;
      int secondNumber = 1;
      int next =  firstNumber + secondNumber;

      while(number > next){
          firstNumber = secondNumber;
          secondNumber = next;
          next = firstNumber + secondNumber;
          if(number == next) return true;
      }
      return false;
    }
}
// https://github.com/odiliemmanuel/NumberProfile.git