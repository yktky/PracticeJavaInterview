package day23;

public class OptionalTaskB11ArrayContinued {
    /*
     * print them out using the loop
     * OPTIONALLY SWAP tHe value of first and last items----->{9,.....1}
     *
     * get the sum of all numbers
     * get the max number
     * */

    public static void main(String[] args) {

        int[] nums = {1, 4, 5, 6, 8};
        for (int x = 0; x < nums.length; x++) {
            System.out.print(nums[x]);
        }
        System.out.println();

        int temp = nums[nums.length - 1];
        nums[nums.length - 1] = nums[0];
        nums[0] = temp;
        for (int y = 0; y < nums.length; y++) {
            System.out.print(nums[y]);
        }
        System.out.println();

        int sum = 0;
        for (int k = 0; k < nums.length; k++) {
            sum = sum + nums[k];
        }
        System.out.println(sum);


    }
}
