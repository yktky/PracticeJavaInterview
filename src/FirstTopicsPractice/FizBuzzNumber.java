package FirstTopicsPractice;

public class FizBuzzNumber {
    public static void main(String[] args) {

        //FIZZ BUZZ NUMBER  IF A NUMBER CAN BE DIVIDED BY BOTH 3 AND 5
        //  FIZZ NUMBER   IF A NUMBER CAN BE DIVIDED BY 5
        // BUZZ NUMBER     IF A NUMBER CAN BE DIVIDED BY 3

        int num = 15;
        if(num %5==0 && num %3==0){
            System.out.println("is Fizz Buzz Number");
        }else if(num%5==0){
            System.out.println("is Fizz Number");
        }else if (num%3==0){
            System.out.println("is Buzz Number");
        }
        System.out.println("+++++++++++++++++++++++++++++");

        int x = 100;  //look only certain number we check condition
        if (x%2==0){
            System.out.println("even number");
        }


        int x1 = 100;  //here we look for range and we check condition
        while (x1>0){

            System.out.println(x1);


            x1++;
        }


    }
}
