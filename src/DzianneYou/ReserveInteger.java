package DzianneYou;

public class ReserveInteger {
    public static void main(String[] args) {

        int num = 456;
       // String str = String.valueOf(num); 1.way
        String str2 = Integer.toString(num); //2.way
        for (int i = str2.length()-1; i >=0 ; i--) {
            System.out.print(str2.charAt(i)+" ");
        }
    }
}
