package day21;

public class UniqueCharacter {
    public static void main(String[] args) {

        String str = "aaaaabbbcc";
        String uniqueStr ="";

        for (int x = 0; x <str.length() ; x++) {
            String eachChar = str.substring(x,x+1);
            if (!uniqueStr.contains(eachChar)){
                uniqueStr+=eachChar;
                System.out.println(eachChar);
            }



        }
    }
}
