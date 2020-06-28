package day21;

public class ExtractLowerCaseFromString {
    public static void main(String[] args) {

        String str = "5 Little Monkey Jumping on The Bed";
//         char eachChar = 'h';
//        System.out.println(eachChar>='a');
//        System.out.println(eachChar>='m');
//        if (eachChar>='a' && eachChar <='z'){
//            System.out.println("It is lowercase");
//
//        }
//        System.out.println("THE END");

        String allLowercaseStr = "";

        for (int x = 0; x <str.length(); x++) {
            // storing each character inside variable each iteration it will store that char
            char each = str.charAt(x);
            //checking whether this character at this iteration is within the range of a-z

            if (each>='a'&& each<='z'){
                allLowercaseStr +=each;  //add on top of each other
               // System.out.println("It is lowercase:  "+each);
            }
        }
        System.out.println(allLowercaseStr);

    }
}
