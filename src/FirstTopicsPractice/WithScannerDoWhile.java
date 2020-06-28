package FirstTopicsPractice;

import java.util.Scanner;

public class WithScannerDoWhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("KNOCK KNOCK !!");
        String password;

        do {
            System.out.println("What is your password");
            password = scanner.next();
        }while (!password.equals("B15"));
        System.out.println("OPEN DOOR");
    }
}
