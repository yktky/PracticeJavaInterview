package arrayListpractice;

import java.util.Arrays;

public class IntervievRa {


        public static void main(String[] args) {

            strictlyIncreasing(new int[]{1, 3, 2, 1});
            strictlyIncreasing(new int[]{1, 3, 2});

        }

        public static void strictlyIncreasing(int[] arr) {

            int[] arrOneLess = new int[arr.length - 1];
            for (int i = 0; i < arr.length; i++) {
                //if it is the last index :
                if (arr[i] == arr.length - 1) {
                    arrOneLess[i] = arr[i];

                } else {

                    if ((arr[i] > arr[i + 1])) {
                        arrOneLess[i] = arr[i + 1];
                        i++;

                    } else {
                        arrOneLess[i] = arr[i];
                    }
                }

            }
            System.out.println(Arrays.toString(arrOneLess));
            System.out.println(yesNo(arrOneLess));

        }


        public static String yesNo(int[] arr) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] <= arr[i + 1]) {
                    continue;
                } else {
                    return "No";
                }
            }
            return "Yes";
        }
    }

