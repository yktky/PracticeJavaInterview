package day20;

public class GetLetterInString {

    public static void main(String[] args) {
                     //01234567
        String name = "Gokyuzum";
                     //12345678



        for (int x =0; x<=name.length()-2; x+=2){  // 2.52 Akbar 20 day
            System.out.println(name.substring(x,x+2));
        }

    }
}
