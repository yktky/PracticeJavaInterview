package day26;

import java.util.Arrays;

public class Modify {
    public static void main(String[] args) {

        int a = 10; //this original
        int b =a; //b getting copy a
        b=20; //b becaome 20 but a dont change: so you are not dealing with originally
        System.out.println(a); //pay attention it is a

        int [] arr = {1,2,4,6,3};
        for (int k = 0; k < arr.length; k++) {
            int eachItem = arr[k];  //here each item getting copy whatever iteration giving me
            eachItem = 20;   //note we do not change orginally one
            System.out.println(eachItem);

        }
        System.out.println(Arrays.toString(arr));


    }
}
