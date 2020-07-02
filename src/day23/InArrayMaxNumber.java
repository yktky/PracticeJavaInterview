package day23;

public class InArrayMaxNumber {
    public static void main(String[] args) {
        /* we assume the first item is the max
        * then compare the first item to yhe rest of item
        * and replace the value of max with actual max number in each iteration */

        int[] nums = {1,4,6,8,9,5};
        int max = nums[0];
        for (int i = 1; i <nums.length; i++) { //here I gave i =1 beacuse I want first index compare rest of them my first index is 0
            if (nums[i]>max){
                max = nums[i];
            }
        }
        System.out.println(max);

        /*
        * max
        * iteration 1 ----> 4>1----->max 4
        * iteration 2 -----> 6>4 ---->max6
        * iteration 3 ------> 8>6----->max6
        * iteration 3 ------> 9>8----->max9
        * iteration 3 ------> 5>9 false ----->max9
        * */
    }
}
