package DzianneYou;

public class Array_Of_Object {
    public static void main(String[] args) {

        Object [][] arr = {{"Mayur",33,5,7},{"Shruti",30,5,7},{"Gaurov",31,5,10,'M'}};
        for (Object[] x: arr){
            for (Object y :x){
                System.out.print(y+" ");
            }
            System.out.print("\n");
        }
    }
}
