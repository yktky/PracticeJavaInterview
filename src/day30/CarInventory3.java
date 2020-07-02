package day30;

public class CarInventory3 {
    public static void main(String[] args) {
        //Print Make and Model separetly in this format
        //honda civic
        //Car make is Honda and MOdel is Civic
        //print only Honda Brand cars
        String eachCar = "Honda-Civic";
        String[] eachcarSplitted = eachCar.split("-");
        System.out.println("Car make is "+eachcarSplitted[0]+eachcarSplitted[1]);
    }
}
