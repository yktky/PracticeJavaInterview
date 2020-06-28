package FirstTopicsPractice;

public class TrimPrac {
    public static void main(String[] args) {

        String mesage = " REPL IS COMING                      ";
        System.out.println(mesage.length());  //Akbar 2.35minute 14 day
        mesage = mesage.trim();  //String immutable now we modified and we sored original variable  new String. so old one went to garbage collection
        // Trim method is used to take out spaces on two side not between word or sentence
        System.out.println(mesage.length());
        String str = "Hello";

        int charCount = str.length();
        System.out.println(charCount);

        // how do you find out last character of any String
        String str2 = "Gulay";
        int last = str2.length()-1;
        str2 = str2.charAt(last)+"";
        System.out.println(str2);
        //or

        String name = "Abdullah";
        int caharacterCount= name.length();
           int lastcharIndex = caharacterCount-1;
           char lastChar = name.charAt(lastcharIndex);
        System.out.println(lastChar);
        System.out.println("last char one shot "+name.charAt(name.length()-1));

    }
}
