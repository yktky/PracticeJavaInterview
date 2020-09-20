package muhtarIQ;

public class PrimeNumber {

   // Write a method that can check if a number is prime or not



  //  Solution:
  public static void main(String[] args) {
      int num1  = 20;
      System.out.println(primeNumber(num1));
  }

    public static boolean primeNumber(int num) {

        boolean result = false;

        if(num <= 1) {

            return result;

        }

        for(int i = 2; i < num; i++) {

            if(num % i == 0 ) {

                return true;

            }

        }



        return result;



    }
}
