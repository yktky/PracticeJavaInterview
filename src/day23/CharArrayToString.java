package day23;

import java.util.Arrays;

public class CharArrayToString {
    public static void main(String[] args) {

        String str1 = "Hayrullah Muattar";
        char [] nameChars = str1.toCharArray();  //return char
        System.out.println(Arrays.toString(nameChars));

        String str2 = "";  //  1. way : return string
        for (int i = 0; i < nameChars.length; i++) {
            char c =nameChars[i];
            str2 = str2 +c;

        }
        System.out.println(str2);

        // OR 3 way to create array object using a charArray
        String str3 = new String(nameChars);  // 2. simple way  return string
        System.out.println(str3);
    }
}
