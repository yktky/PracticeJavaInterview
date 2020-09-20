package arrayListpractice;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListBinarySorted {
    public static void main(String[] args) {
        ArrayList<String> lst = new ArrayList<>();
        lst.add("Etka");
        lst.add("Umut");
        lst.add("Aygul");
        lst.add("Izdar");
        lst.add("Amir");
        lst.add("Mehmet");
        System.out.println("lst = " + lst);
        Collections.sort(lst);
        System.out.println("lst = " + lst);
        //looking for the index of an item in the sorted list
        int amirLocation = Collections.binarySearch(lst,"Amir");
        System.out.println("amirLocation = " + amirLocation);
        int talmuratLocations = Collections.binarySearch(lst,"Talmurat");
        System.out.println("talmuratLocations = " + talmuratLocations); //reason  we have 6 item
        // when we sorted talmurat is going to last location but it doesnt have so it will display -6
         //reversing Collection
        Collections.reverse(lst);
        System.out.println(lst);
    }
}
