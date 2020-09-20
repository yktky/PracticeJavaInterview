package day34B11;

import java.util.Arrays;

public class DescendindArray {
    public static void main(String[] args) {
        int[] array = {45, 12, 85, 32, 89, 39, 69, 44, 42, 1, 6, 8};

        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            }

        System.out.println(Arrays.toString(array));
    }
}
