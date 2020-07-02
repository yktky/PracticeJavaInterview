package day25;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

             int [] numbers = {11,2,39,18,7,4,15};
             int count = numbers.length;
             int lastIndex = count -1;

             for (int i = 0; i <count/2 ; i++) {

            int temp = numbers[i];
            numbers[i] =numbers[lastIndex -i];
            numbers[lastIndex-i] = temp;
             }
        System.out.println(Arrays.toString(numbers));
    }
}
