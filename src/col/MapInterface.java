package col;

import java.util.HashMap;
import java.util.Map;

public class MapInterface {
    public static void main(String[] args) {

        Map<String, Integer> scoreMap = new HashMap<>();

        scoreMap.put("Mary",23);
        scoreMap.put("Yekta",90);
        System.out.println(scoreMap);
        scoreMap.replace("Mary",100);
        System.out.println(scoreMap);
        

    }
}
