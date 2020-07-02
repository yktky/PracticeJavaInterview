package day25;

import java.util.Arrays;

public class ToCreateArrayHave3Way {

    public static void main(String[] args) {



        /*
         *
         *
         *
         * 3 ways to create an array*/

        String[] names = new String[5];  // deafault value is null for each item

        names[0] ="abc";
        names[1] = "ef";
        names [2] = "gh";
        System.out.println(Arrays.toString(names));  //  it seems -->to make the String

        String[] names2 = new String[]{"aaa","bbb","ccc", null};

        int x = 0;
        while (x< names2.length){
            System.out.println(names2[x]);
            x++;

        }
        //This must happen in one statement
        String[] names3 = {"asdads","ssss0"};



    }
}