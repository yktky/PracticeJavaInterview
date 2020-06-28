package FirstTopicsPractice;

public class NamePrinter {

    public static void main(String[] args) {


        String name = "Alexander";
        //get each and every character and print them out vertifically
        int x =0 ; // why 0-----> because index start with 0

        while (x<name.length()){
            System.out.println("index: "+x);
            System.out.println(name.charAt(x));
            ++x;
        }
    }
}