package FirstTopicsPractice;

import java.util.Scanner;

public class Count1To10WhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
  //      System.out.println("Give me five");
 //       int userNumber = scanner.nextInt();
//        if(userNumber!=5){
//            System.out.println("Hey you did not give me 5!!!");
//        }

        int userNumber =0;

        while (userNumber!=5){
            System.out.println("give me five");
            userNumber = scanner.nextInt();
        }
        System.out.println("end of program");


    }
}
