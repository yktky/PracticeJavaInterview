package day29;

import java.util.Arrays;

public class ParacticeFillUpArraySize {
    public static void main(String[] args) {

        String[] strArr = new String[300];
        for (int i = 0; i < strArr.length; i++) {
            //strArr[i] = "I love java" ; //or WE wanna start 1 like below we can write code
            strArr[i] = (i+1)+". I love Java"; //i+1 --> we want to start 1 so we add index +1
        }
        System.out.println("Arrays.toString(strArr = " + Arrays.toString(strArr));
    }
}
