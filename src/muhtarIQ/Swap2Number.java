package muhtarIQ;

public class Swap2Number {
    public static void main(String[] args) {
      //  Swap two variable' values without using a third variable



      //  Solution 1:

        int  a = 10;      int  b  = 20;

        a = a +b;

        b = a - b;

        a = a - b;



       // Solution 2:

        int  a1 = 10;      int  b1  = 20;

        a1 = a1^b1;

        b1 = a1^b1;

        a1 = a1^b1;
    }
}
