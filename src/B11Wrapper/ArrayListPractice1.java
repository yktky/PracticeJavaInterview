package B11Wrapper;

import java.util.ArrayList;

public class ArrayListPractice1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 100; i >0 ; i--) {
            list.add(i);
        }
        System.out.println(list);
        int count = 0;
        for (Integer each : list) {
            if(each %3==0 && each%5==0){
                count++;

            }

        }
        System.out.print(count);
    }
}
