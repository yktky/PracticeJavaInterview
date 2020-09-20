package day34B11;

import java.util.Arrays;

public class CallWithObject2DArray {
    public static void main(String[] args) {
      //  addManyNumbers(new int[] {1,4,66,33});
        //or
          int[] single = {1,4,66,33};
           addManyNumbers(single);
    }
    public static void addManyNumbers(int[] manyNums){

        int sum = 0;
        for (int eachnum : manyNums) {
            sum+=eachnum;

        }
        System.out.println(sum);

    }
}
