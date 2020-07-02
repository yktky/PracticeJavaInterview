package day26;

import java.util.Arrays;

public class WarmUpB11SwapAndReverse {
    public static void main(String[] args) {

        String str = "Sunday Perfect Day to Start coding";
        //Reverse above Sentence to generate below
        //coding satart to Day Perfect Sunday

        //Optional:reverse word + reverse each char of the word

        //Solving:
       // How I do get each and every word to reserve ------>Use Split

        String [] showsArray = str.split(" ");
//        for (int i = showsArray.length-1; i >=0; i--) {
//          //  System.out.print(showsArray[i]+"-");
//        }
//        System.out.println();

        //2.way

        String strRev = "";
        for (int x =0;x<showsArray.length/2; x++) {
            //System.out.print(showsArray[x]);
            String temp = showsArray[x];
            showsArray[x] = showsArray[showsArray.length-1-x];
            showsArray[showsArray.length-1-x] = temp;

           // strRev +=

        }
        System.out.println(Arrays.toString(showsArray));



    }
}
