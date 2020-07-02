package day25;

import java.util.Arrays;

public class ReverseStringToCharArray {
    public static void main(String[] args) {



    String str = "Spartan";
    int size = str.length();
    char[] myChars = new char[size];
        for (int i = 0; i < size; i++) {
           // myChars[0] = 'A';
            myChars[i] = str.charAt(i);
        }
        System.out.println(Arrays.toString(myChars));
        System.out.println();

        // 2.Way one shot same result
        char [] myChars2 = str.toCharArray();  //toCharArray() is coming from String class
        //it will return character array that have each char of String object
        System.out.println(Arrays.toString(myChars2));


    }
}
