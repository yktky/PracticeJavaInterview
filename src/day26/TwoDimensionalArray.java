package day26;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] data = {{2,14,3},{4,5},{9,7}};
        for (int[] row : data) {
            for (int cell :row) {
                System.out.print(cell+" ");
            }
            System.out.println();
        }

        //2.way

        System.out.println("second way");

        for (int i = 0; i < data.length; i++) {         //THIS OUTER LOOP IS GOING THROUGH EACH AND EVERY ROW--->REPRESENT EACH ROW
                                                          // data[i]
            for (int j = 0; j < data[i].length; j++) {  //THIS INNER LOOP IS GOING TO THROUGH EACH AND EVERY CELL
                System.out.print(data[i][j]+" ");
            }
            System.out.println();
        }
    }
}
