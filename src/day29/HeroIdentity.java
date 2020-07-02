package day29;

public class HeroIdentity {
    public static void main(String[] args) {

String hero1 = "Superman- Clark J Kent";
String[] heroSplitted = hero1.split("-");
String herocode = heroSplitted[0];
String fullName = heroSplitted[1];
String stars = "";
        for (int i = 1; i <+fullName.length() ; i++) {
            stars +="*";

        }
        String heroX = hero1.replace(fullName,stars);
        System.out.println("hero1 = " + hero1);
        System.out.println("heroX = " + heroX);

    }
}
