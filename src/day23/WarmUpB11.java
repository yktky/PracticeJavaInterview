package day23;

public class WarmUpB11 {
    public static void main(String[] args) {
        int[] num = {5,8,63,53,10};
        //print true if all are  numbers are more than 10
        //print false if not
        //print false as long as one number are false
        boolean result =true;
        for (int i = 0; i < num.length; i++) {
            if (num[i]>10){
                System.out.println("true");
            }else {
                System.out.println("false");
            }
        }
    }
}
