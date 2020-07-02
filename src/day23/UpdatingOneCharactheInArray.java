package day23;

public class UpdatingOneCharactheInArray {
    public static void main(String[] args) {
        int[] nums = {1,2,5,9,106,6,4};
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+ " ");
        }
        System.out.println();  //this works for array result only go to one line

        System.out.println("Updating");
        //double the value of 3 rd item : for ex: 6--->12
        nums[2]=nums[2]*2;
        //update the value of 4th item to sum of 1 st and 2nd items 8 ---->1+4
        nums[3] = nums[0]+nums[1];
        for (int x = 0; x < nums.length; x++) {
            System.out.print(nums[x]+" ");
        }

    }
}
