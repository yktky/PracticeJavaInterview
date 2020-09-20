package B11Wrapper;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethod {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.remove("B");
        System.out.println(list);
        
        list.set(0,"B");
        System.out.println(list);
    //    list.contains("C");// //it doent not contain C it will return false, so we need assign to boolean
        boolean result = list.contains("C");
        System.out.println("result : "+result);
    }
}
