package DzianneYou;

public class String_Comparison {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Java";
        String str3 = "java";
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        //or
        if (str1.equalsIgnoreCase(str2)){
            System.out.println("string is equal");
        }else {
            System.out.println("string is not equals");
        }
        //or
        System.out.println("with compare to method");
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareTo(str3));
        System.out.println(str1.compareToIgnoreCase(str3));
    }
}
