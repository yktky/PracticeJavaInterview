package day30;

public class CarInventory {
    public static void main(String[] args) {

        String[] cars = {"Accura-NSX", "Chevrolet-Corvette","Chevrolet-Cavalier",
                "BMW-3 Series","Pontiac-LeMans","BMW-7 Series","Oldsmobile-Achieva","Honda-Civic"};
        //Task count Chevrolet and Civic
        int chevCNT = 0 ;
        int civicCNT = 0 ;

        for (String eachCar : cars ) {
            if(eachCar.toLowerCase().startsWith("chevrolet")){
                chevCNT++;

            }
            if (eachCar.toUpperCase().contains("CIVIC")){
                civicCNT++;

            }

        }
        System.out.println("civicCNT:  "+civicCNT);
        System.out.println("chevyCNT: "+chevCNT);
    }
}
