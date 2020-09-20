public class PalindromaWithMethod {

    public static void main(String[] args) {
        System.out.println(isPalidroma("kayak"));
        System.out.println(isPalidroma("race car"));  //replaceAll(" ",""); pay attention we replace all space
        // here and it became palindromae
        System.out.println(isPalidroma("was it a car or a cat i saw"));
        System.out.println(isPalidroma("myname"));

        System.out.println("reverse string*********************************");
        String resultCheckReverse = reverseString("ana");
        System.out.println(resultCheckReverse);

    }


    public static boolean isPalidroma(String target) {
        String reversed = "";
        target = target.replaceAll(" ", "");
        reversed = reversed.replaceAll(" ", "");

        for (int i = target.length() - 1; i >= 0; i--) {
            reversed += target.charAt(i) + "";

        }
//        if (reversed.equals(target)){
//            return true;
//        }
        return reversed.equals(target);
    }

    public static String reverseString(String target) {
        String reversed = "";
        for (int x = target.length() - 1; x >= 0; x--) {
            reversed += target.charAt(x) + "";
        }
        return reversed;
    }
}
