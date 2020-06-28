package day21;

public class DecidingWhenStop {
    public static void main(String[] args) {
        String twoCharacter = "Hello World";
        int charCount = twoCharacter.length();
        System.out.println(charCount);
        for (int x = 0; x < twoCharacter.length() - 1; x++) {
            System.out.println(twoCharacter.substring(x,x+2));
        }

        System.out.println("*************************");
        //Formula
           int n =5; // ====>charCount
        for (int i = 0; i <=charCount-n; i++) {
            System.out.println(twoCharacter.substring(i,i+n));

        }
    }
}
