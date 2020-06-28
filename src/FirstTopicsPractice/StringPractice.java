package FirstTopicsPractice;

public class StringPractice {
    public static void main(String[] args) {

        String name = "Game of Throne Java";
        System.out.println(name.indexOf("Throne"));
        System.out.println(name.charAt(0));
        System.out.println(name.length());
        System.out.println("find out the location of first space:");
        System.out.println(name.indexOf(" "));
        System.out.println(name.lastIndexOf("e"));
        System.out.println("find out last location the caharacter space show up");
        System.out.println(name.lastIndexOf(" "));
        System.out.println("find out last location the letter Kawa shows up");
        System.out.println(name .lastIndexOf("Kawa"));
        System.out.println(name.indexOf("Ga")); //pay attention whole word point of first index it doesn't matter whole or not it read first letter location


    }
}
