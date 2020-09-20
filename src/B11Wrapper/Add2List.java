package B11Wrapper;

import java.util.ArrayList;

public class Add2List {
    public static void main(String[] args) {
        ArrayList<String> lst1 = new ArrayList<>();
        lst1.add("Superman");
        lst1.add("cat");
        lst1.add("dog");
        ArrayList<String> lst2 = new ArrayList<>();
        lst2.add("Wonder woman");
        lst2.add("Flash");
        lst2.add("Cyborg");
        lst1.addAll(lst2);  //       we combine lists
//        System.out.println(lst1);
//        System.out.println(lst2);
        //Orr I can put certain index
        lst1.addAll(2, lst2);
        System.out.println("list1: " + lst1);

        //Second Way creating Arraylist and getting copy from another collection object with variable
        //intead of addAll method directly we put inside paranthsis.
        ArrayList<String> list3 = new ArrayList<>(lst1);
        System.out.println("list3 : " + list3);
        //how i get list3 as A String----------> toString
        //or how i get String Representation out the arraylist object
        String lstAsString = list3.toString(); // here we call specific method which give us  a String representation
        System.out.println("list3 :"+list3); //it will automatically call toString() method implicitly (have but we dont see) itis (ToString())-- work default
        System.out.println("lstAsString = " + lstAsString); // here we define  with toString()
        /* PayAttention:  whenever you print out any reference variable that point to object, it will automatically call to String method*/



    }
}
