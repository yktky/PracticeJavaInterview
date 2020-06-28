package day20;

public class GetSibling {
    public static void main(String[] args) {

        String name = "Ayra";
        System.out.println("Getting 2 Character");

        for (int i = 0; i <name.length()-1 ; i++) {
            System.out.println(name.substring(i,i+2));

        }

        //Ay
        //ra
//        System.out.println(name.substring(0,2));
//        System.out.println(name.substring(1,3));
//        System.out.println(name.substring(2,4));



        //Or With LOOP
        // Ayr|yra
        // 012--->I stop here
        //Ayr
        //yra

        System.out.println("Getting 3 Character");
        for (int x =0; x<name.length()-2;x++){
            System.out.println(name.substring(x,x+3));
        }


    }
}
