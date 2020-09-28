package DzianneYou;

public class String_Conversion {
    public static void main(String[] args) {

        int num = 100;
        String i1 = Integer.toString(num);
        System.out.println(i1);
        System.out.println(Integer.toBinaryString(num));

        String str1 = "100";
        String str2 = "1010101";
        System.out.println(Integer.parseInt(str1));
        System.out.println(Integer.parseInt(str2,2));
    }
}
