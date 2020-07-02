package day25;

import java.util.Arrays;

public class SplitParactice3 {
    public static void main(String[] args) {

        String str = "Everything is Awesome !ee!";
        String[] showsArray = str.split("e");
        System.out.println(Arrays.toString(showsArray));

        String str2 ="X-Man is verypopular in world";
        String[] showsArraystr2 =str2.split("pop") ;
        System.out.println(Arrays.toString(showsArraystr2));
    }
}
