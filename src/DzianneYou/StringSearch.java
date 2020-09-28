package DzianneYou;

public class StringSearch {
    public static void main(String[] args) {

        /*
        * CONTAINS
        * STARTWITH
        * ENDWITH
        * INDEXOF
        * LASTINDEXOf
        * */


        String str1 = "I love Java love and Selenium";
        String str2 = "java";
        System.out.println(str1.contains(str2));

        System.out.println(str1.toLowerCase().contains(str2.toLowerCase()));
        System.out.println(str1.startsWith("I"));
        System.out.println(str1.endsWith("Selenium1"));

        System.out.println(str1.indexOf("love")); //here default starts from 0
       System.out.println(str1.indexOf("love",6)); //here we identify
        System.out.println(str1.lastIndexOf("and"));

    }
}
