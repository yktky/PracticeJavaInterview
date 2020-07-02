package day29;

import java.util.Arrays;

public class StringParactice {
    public static void main(String[] args) {

        String hero1 = "Superman-Clark J Kent";
        // Task :
        // Hero code is Superman and Identity is Clark Kent
        // The initial of the Hero is CK

        // PLAIN ENGLISH LOGIC :
        // LOGIC 1 : split this String by dash -
        //  to get 2 pieces of String into a String array

        String[] splitted = hero1.split("-"); //we cut at - now it is  gone

        System.out.println(Arrays.toString(splitted));
        String initialGet = splitted[0];
        String initialgetSec = splitted[1];
        System.out.println("Hero code is :"+initialGet+"  " +"identity is :" +initialgetSec);

        // The initial of the Hero is CK
        // I can just use fullName variable to finish this task

        // LOGIC 1  :  get the first letter of full name
        //          then get first letter after the space
        //          concatenate them
        //          downside is what if we have middle name
        //          solution , instead of looking for the letter after first space
        //                      look for last index of the space then get next Character


        // LOGIC 2  : We already have full name stored in fullName variable
        //      split by space -->> we will get firstName (middle name) lastName
        //      get the first letter of full name
        //      then get the last name using last item index
        //      get the first character then concatenate
        //      Clark Kent -->> [  Clark , Kent ]   Clark->C   Kent-K  --->> CK

        String fullName = splitted[1];
        String heroCode = splitted[0];

        String [] fulNameSplitted  = fullName.split(" ");
        System.out.println("fulNameSplitted = " + Arrays.toString(fulNameSplitted));
        String lastName = fulNameSplitted[fulNameSplitted.length-1];
        System.out.println("lastName = " + lastName);
        //get only initial letter
        System.out.println("initial of hero is :"+fullName.charAt(0)+lastName.charAt(0));

    }
}
