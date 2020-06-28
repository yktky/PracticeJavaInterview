package day20;

public class Get4Character {
    public static void main(String[] args) {


        String name = "America";
        for (int i = 0; i <name.length()-3 ; i++) {
            System.out.println(name.substring(i,i+4));
        }
    }
}
