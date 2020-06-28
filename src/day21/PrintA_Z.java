package day21;

public class PrintA_Z {
    public static void main(String[] args) {

        char a = 'a';
        System.out.println(a+1);  //Pay attention you add +1 it give you ascii code number
        char next = (char) (a+1);    //This is down casting as explicitly
        System.out.println(next); //now returned letter after downcasting

        //get all letter as number

        for (int x = 'a'; x <='z' ; x++) {

            char eachChar = (char)x;
           //System.out.print(x);  // I am not interested in with number I interest in the letter
            System.out.print(eachChar);
        }


    }
}
