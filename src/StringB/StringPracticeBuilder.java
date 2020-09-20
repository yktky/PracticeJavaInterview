package StringB;

public class StringPracticeBuilder {
    public static void main(String[] args) {
                                         //    0123456789012345
       StringBuilder sb1 = new StringBuilder("Learning is good");
        sb1.replace(9,12,"gulay");
        System.out.println(sb1);
        //insert,replace , append, delete, reverse there are mostly is used this method



        String name1 = "mana";
        String name2 = "mana";
        System.out.println(name1==name2);
        System.out.println(name1.equals(name2));
    }
}
