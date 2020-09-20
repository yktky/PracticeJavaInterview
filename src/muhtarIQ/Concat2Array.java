package muhtarIQ;

import java.util.Arrays;

public class Concat2Array {

   // Write a return method that can concate two arrays



    //Solution:
    public static void main(String[] args) {
        int[] a1 = {1,5,6,3};
        int[]  a2 = {6,5,7,8};
        System.out.println(Arrays.toString(concatTwoArrays(a1, a2)));
    }

    public static int[] concatTwoArrays(int[] arr1 , int[] arr2) {

        int[] result = new int[arr1.length + arr2.length];

        int i = 0;

        for(int each: arr1) {

            result[i] = each;

            i++;

        }

        for(int each: arr2) {

            result[i] =each;

            i++;

        }

        return result;

    }
}
