package FirstTopicsPractice;

public class PalindromaTest {
    public static void main(String[] args) {

        String name = "kayak";
        System.out.println("name" +name);

        String reversedName ="";
        for (int x = name.length()-1; x>=0;x--){
            reversedName +=reversedName+name.charAt(x);
        }
        System.out.println(" it is Palindroma: "+ reversedName);
        //check whether name is equal without case check

        if(name.equalsIgnoreCase(reversedName)){
            System.out.println("Palindroma Test PASS");
        }else {
            System.out.println("Palindroma Test Failed");
        }
    }
}
