package FirstTopicsPractice;

import java.util.Scanner;

public class SmartLockOpener {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String password = scan.next();
        while (!password.equals("B15")){
            System.out.println("Wrong Password  TRY AGAIN");
            password = scan.next();  //Pay Attention it work like x++ otherwise it will be infinite loop
        }
        System.out.println("OPEN SESEAME");
    }
}
