package DzianneYou;

public class String_Slice {
    public static void main(String[] args) {

        /* charAt
        * Substring
        * Split*/

        String str1 = "ABCDEFG";
        System.out.println(str1.charAt(3));
       // System.out.println(str1.charAt(8)); // it give outofboundexceptions
        //reverse String
        String a = "";
        for (int i = 0; i <=str1.length()-1; i++) {
           a = str1.charAt(i)+a;
           // System.out.print(str1.charAt(i));
        }
       System.out.println(a);
    }
}
