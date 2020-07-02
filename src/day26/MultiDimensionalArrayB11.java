package day26;

import java.util.Arrays;

public class MultiDimensionalArrayB11 {
    public static void main(String[] args) {

        int[][] table = new int[4][2];  //first dimension can be seen row number,  second dimension can be seen
        // column number

        table[0][0] = 12;
        table[0][1] = 17;
        table[1][0] = 3;
        table[1][1] = 40;
        table[2][0] = 44;
        table[2][1] = 27;
        table[3][0] = 23;
        table[3][1] = 12;

//        for (int[] row : table) {
//            for (int cell : row) {
//                System.out.print(cell + " ");
//            }
//            System.out.println();
//        }


        for (int i = 0; i < table.length; i++) {
            int[] eachRow = table[i];
          //  System.out.println(Arrays.toString(eachRow));
            for (int x = 0; x < eachRow.length; x++) {
                System.out.print(eachRow[x]+" ");
            }
            System.out.println();
        }


    }
}
