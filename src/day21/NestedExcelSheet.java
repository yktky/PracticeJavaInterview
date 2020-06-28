package day21;

public class NestedExcelSheet {
    public static void main(String[] args) {

        for (int x = 1; x <3 ; x++) {
            for (int y = 1; y <=5 ; y++) {
                System.out.print("Cell"+"("+x+","+y+")"+",");

            }
            System.out.println();  // in the nested loop in order to one line seperatly each row we put here
        }

    }
}
