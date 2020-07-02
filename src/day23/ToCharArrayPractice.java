package day23;

import java.util.Arrays;
import java.util.Scanner;

public class ToCharArrayPractice {
    public static void main(String[] args) {
        //
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        char[] nameChars = name.toCharArray();
        System.out.println(Arrays.toString(nameChars));
        int count = 0;
        for (int x = 0; x < nameChars.length; x++) {
            if (nameChars[x]=='a'){
                count++;

            }
        }
        System.out.println("The count is : "+count);

    }
}
