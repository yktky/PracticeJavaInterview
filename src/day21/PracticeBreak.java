package day21;

public class PracticeBreak {
    public static void main(String[] args) {

        String name = "Gulay";

        for (int x = 0; x <name.length()-1; x++) {
            char currentChar = name.charAt(x);
            System.out.println(currentChar);
            if (currentChar=='l'){
                break;
            }

        }

        System.out.println("****************************");

        String name2 = "Nursultan";
        for (int i = 0; i <name2.length()-1; i++) {
            String currentChar = name2.substring(i,i+1);

            if (currentChar.equalsIgnoreCase("l")){
                break;
            }
            System.out.println(currentChar);

        }
        for (int y = 0; y <10 ; y++) {
            if (y==5){
                break;
            }
            System.out.println(y);
        }
        System.out.println("-----------------------------");

        String name3 =" Goksel";
        String reversed = "";
        for (int x = name3.length()-1; x>=0; x--) {
            reversed+= name3.substring(x,x+1);

        }
        System.out.println(reversed);
    }
}
