package col;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetInterfacePractice_hashSet {
    public static void main(String[] args) {

        Set<Long> longSet = new HashSet<>();
        longSet.add(7L);
        longSet.add(7L);
        longSet.add(7L);
        longSet.add(7L);
        longSet.add(70L);
        longSet.add(70L);
        System.out.println(longSet.size());
        System.out.println(longSet);
        for (Long each : longSet) {  //go through each and every item with each for loop
            System.out.println(each + "->");
        }

        longSet.addAll(Arrays.asList(2L, 3L, 4L, 4L, 4L));  //look we add new item but it will give not duplicate
        System.out.println(longSet);

        //update
        longSet.add(null);
        System.out.println(longSet);
        //remove if null and add new instead of null
        if (!longSet.add(null)) {
            longSet.remove(null);
            longSet.add(0L);
        }
        System.out.println(longSet);

    }
}
