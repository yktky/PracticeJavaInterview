package muhtarIQ;

import java.util.Arrays;

public class FindMax {


    //Write a method that can find the maximum number from an int Array
    public static void main(String[] args) {
        int[] a = {13,-13,-1};
        System.out.println(maxValue(a));
    }



   // Solution 1:

    public static int maxValue( int[]  n ) {

        int max = Integer.MIN_VALUE;

        for(int each: n)

            if(each > max)

                max = each;



        return max;

    }
}
