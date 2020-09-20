package FirstTopicsPractice;

public class ReverseInteger {
    public static void main(String[] args) {
        int num = 456;
        String str = String.valueOf(num);
        for (int i = str.length()-1; i >=0 ; i--) {
            System.out.print(str.charAt(i)+" ");
        }
    }
}
