package col;

import java.util.HashSet;
import java.util.Set;

public class SetOfStringPerson {
    public static void main(String[] args) {

        System.out.println(new String("Adam").hashCode());

        Set<String> strSet = new HashSet<>();
        System.out.println(strSet.size());
        System.out.println("********************");

        //we try to get hashcode create custom type(Person)

        Set<Person> personSet = new HashSet<>();
        Person p1 = new Person("John", 20);
        Person p2 = new Person("John", 20);
        Person p3 = new Person("John", 20);
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());
        personSet.add(p1);
        System.out.println(personSet);
    }
}
