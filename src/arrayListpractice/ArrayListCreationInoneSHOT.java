package arrayListpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListCreationInoneSHOT {
    public static void main(String[] args) {

        List<Integer> lst = Arrays.asList(3,5,6,7,5,4,3);
     //   lst.add(20);   //UnsupportedOperationException --> we can not use
      //  lst.remove(2); //UnsupportedOperationException
        lst.set(0,100);
        System.out.println("lst = " + lst);

        //We want to copy everything from the list into the new that we can modify
        ArrayList<Integer>  mycoolList = new ArrayList<>(lst); /* pay attention in Arraylist we can add and remove only Arras.asList we can not add and remove*/
        mycoolList.add(100);
        mycoolList.remove(Integer.valueOf(3));
        System.out.println("mycoolList = " + mycoolList);
        List<String>  klm = Arrays.asList("Superman","Batman","Wonder Woman");
        System.out.println("klm = " + klm);

        //Pay Attention we got copy
        ArrayList<String> klmCopy = new ArrayList<>(Arrays.asList("Superman","Batman","Wonder Woman"));

        klmCopy.add("Flash"); // We can add right now
        klmCopy.remove("Batman");  // look we can
        System.out.println("klmCopy = " + klmCopy);

         //ArrayList<String> klmCopy2 = Arrays.asList("Superman","Batman","Wonder Woman"); //IT IS WRONG IT NEVER WORK
        //Because it return list not Arraylist


    }
}
