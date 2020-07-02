package day26;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {

        int [] nums = {1,3,5,6,8,9};
        int index = Arrays.binarySearch(nums,5);  // it points location  --it take your array object and
        // it take the Item you want to the search then it will give you back location
        System.out.println(index);

        int [] nums100 = new int[100];
        Arrays.fill(nums100,5);
        System.out.println(Arrays.toString(nums100));
    }
}
