package StringB;

public class FindJava {
    public static void main(String[] args) {

        String str = "java is fine, I love Java Java";
        int count = 0;
        for (int i = 0; i < str.length()-3; i++) {
            if (str.substring(i,i+4).equalsIgnoreCase("java")){
                count++;
            }
        }
    }
}
