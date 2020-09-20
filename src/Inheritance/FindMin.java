package Inheritance;

import java.util.Arrays;

public class FindMin {

  // Write a method that can find the maximum number from an int Array

    public static void main(String[] args) {
        int[] min = {-1,-6,12};
        System.out.println(maxValue(min));
    }



   // Solution 1:

    public static int maxValue( int[]  n ) {

        int min = Integer.MAX_VALUE;

        for(int each: n)

            if(each < min)

                min = each;



        return min;
}
}
