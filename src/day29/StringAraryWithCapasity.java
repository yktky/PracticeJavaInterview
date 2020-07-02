package day29;

import java.util.Arrays;

public class StringAraryWithCapasity {
    public static void main(String[] args) {

        String str = new String("ABC"); // THIS IS OBJECT WITH VALUE ABC
        String [] strArr2 = new String[5]; //THIS IS EMPTY STRING ARRAY WITH CAPASITY 5,

        strArr2[0] = "i love java"; //if we have 3 or 10 or 20 we can fill up into array
                                    // But if we have 100 capacity or 1000 or mere big then
                                      //we need to for loop That is main idea wy we use loop
        strArr2[1] = "I love Java";
        strArr2[2] = "i love Java";
        System.out.println(Arrays.toString(strArr2));
    }
}
