package day30;

import java.util.Arrays;

public class SplitAndDefinesize {
    public static void main(String[] args) {

        // split method has two version :
        // first split by some separator and get whatever the count of item we get from the result

        // second version : accept 2 external data ,
        // one is the separator another is the limit of your array size
        // so if you have 5 word in a sentence if you split by space and put the limit for 2
        // then you will get an array with size 2 -->> { first word , the rest of the sentence }


        String  senetences = "I love java java java";
       // String[] wordsArray = senetences.split(" ");
        String[] wordsArray = senetences.split(" ",2); //limit how many pieces you want
        System.out.println("wordsArray  = " + Arrays.toString(wordsArray));
        System.out.println("wordsArray Size " + wordsArray.length);
      //  System.out.println("wordsArray = " + wordsArray);


    }
}
