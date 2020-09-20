package day34B11;

import java.util.Arrays;

public class AscendingArray {
    public static void main(String[] args) {
        int[] array = {45, 12, 85, 32, 89, 39, 69, 44, 42, 1, 6, 8};

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
