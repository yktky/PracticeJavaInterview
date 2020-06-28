package day20;

public class FindDog {
    public static void main(String[] args) {
        
        //given sentence, find out the location of the dog

        String msg = "I like Dog, Dogs are cute, Dogs are friendly";
        for (int x = 0; x < msg.length()-2; x++) {

            String current3charcter = msg.substring(x,x+3);
            System.out.println(current3charcter);

            if(current3charcter.equals("Dog")){
                System.out.println("BINGO !!! AT DOG LOCATION:"+x);
            }
            
        }
        
    }
}
