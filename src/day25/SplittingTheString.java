package day25;

import java.util.Arrays;

public class SplittingTheString {
    public static void main(String[] args) {

        String str = "Java is Fun, Java is challenger";
        String[] splitWords = str.split(" ");
        System.out.println(Arrays.toString(splitWords));


        String[] parts = str.split("a");
        System.out.println(Arrays.toString(parts));

        String[] parts2 = str.split("is");
        System.out.println(Arrays.toString(parts2));
    }
}
