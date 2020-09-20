package col;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Arrays;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetMethod {
    public static void main(String[] args) {
        /*
         * SortedSet is a type of set that maintain Sorted Order on top of uniques
         * */
        // Sorted set extends Set interface
        //Set extends Collection interface
        SortedSet<Long> longSortedSet = new TreeSet<>();
    //    Set<Long> longTreeSet = new TreeSet<>(); //we can just use set interface itself and
        // only make it available or any method setting interface have

        //now I want to do with Sorted
        longSortedSet.add(3L);
        longSortedSet.add(3L);
        longSortedSet.add(39L);
        longSortedSet.add(27L);
        longSortedSet.add(20L);
        System.out.println(longSortedSet);
        System.out.println(longSortedSet.first());
        System.out.println(longSortedSet.last());
        longSortedSet.addAll(Arrays.asList(15L,18L,15L,18L));
        System.out.println(longSortedSet);

        //SortedSet is not allow null
        longSortedSet.add(null);  //if you use null it give NullPointerExceptions
        System.out.println(longSortedSet);


    }
}
