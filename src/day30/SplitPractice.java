package day30;

import java.util.Arrays;

public class SplitPractice {
    public static void main(String[] args) {


        /*
         * What does split do ?
         *   it will split the string into multiple part a
         *
         * What do i need to provide when calling it ?
         *  We need to provide the separator
         *
         * What do i get out of it ?
         *  We get a String array out of it with each part splitted
         *
         * DOES IT ACTUALLY CHANGE YOUR ORIGINAL STRING ?
         *    NO!!!!!!!!!
         * */
        String car = "Lexus-IS-F";
        String[] carSPLITTED = car.split("-",2);
        System.out.println(Arrays.toString(carSPLITTED));
        System.out.println("car = " + car); //Pay Attention it is orginal String Doesn't change(because String Immutable)
        String model = carSPLITTED[1];
        System.out.println("model = " + model);
    }
}

