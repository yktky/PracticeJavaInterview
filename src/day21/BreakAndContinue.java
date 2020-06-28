package day21;

import javax.crypto.spec.PSource;

public class BreakAndContinue {

    public static void main(String[] args) {
        int sum = 0;
        for (int x = 1; x <=10 ; x++) {
            System.out.println("current sum is : "+ sum);
            if (sum>40){

            break;

        }
            // we need to add the sum after we make sure it didn't go over 40
            sum = sum+x;

        }
        System.out.println("sum: "+sum);
    }
}
