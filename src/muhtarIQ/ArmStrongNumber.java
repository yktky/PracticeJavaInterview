package muhtarIQ;

public class ArmStrongNumber {

  //  Write a method that can check if a number is Armstrong  number



  //  Solution:
  public static void main(String[] args) {
      int nums = 371;
      System.out.println(ArmStrongNumber(nums));
  }

    public  static  boolean ArmStrongNumber (int  num) {

        int a = 0,    b =0,    c= num;

        while(num>0){

            a=num%10;

            num/=10;

            b=b+(a*a*a);

        }



        if(c==b) {

            return true;

        }

        return false;

    }
}
