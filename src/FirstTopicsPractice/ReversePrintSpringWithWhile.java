package FirstTopicsPractice;

public class ReversePrintSpringWithWhile {
    public static void main(String[] args) {

        String name = "Sadrettin Cali";
       // int lastCharacterIndex = name.length()-1;

        int x = name.length()-1;  // it defines last index
        while (x>=0){
            System.out.println("index "+x+": "+name.charAt(x));
            --x;
        }

        System.out.println("*************************");
        String name2 = "Birnigar";
        int x2 = name2.length()-1;
        while (x2>=0){
            System.out.println("index: "+x2+": "+ name2.charAt(x2));
            --x2;
        }

    }
}
