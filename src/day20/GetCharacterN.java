package day20;

public class GetCharacterN {
    public static void main(String[] args) {
        //I want to get 4 character from This String
        // This formula x <= charcount -n

        String abc = "Hello World";
        for (int x = 0; x <abc.length()-4 ; x++) {
            System.out.println(abc.substring(x,x+5));
        }

    }
}
