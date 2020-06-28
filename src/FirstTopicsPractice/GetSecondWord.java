package FirstTopicsPractice;

public class GetSecondWord {
    public static void main(String[] args) {

        //given a sentence with 3 words
        //get the second word

        String sentence = "I love Java";
        String secondWord ;
        int firstSpaceIndex = sentence.indexOf(" ");
        System.out.println("firstSpaceIndex: "+firstSpaceIndex);
        int lastSpaceIndex = sentence.lastIndexOf(" ");
        System.out.println("lastSpaceIndex: "+lastSpaceIndex);
        System.out.println(sentence.substring(2,6));

        //or
        secondWord = sentence.substring(firstSpaceIndex+1,lastSpaceIndex);
        System.out.println("second word: "+secondWord);
        String firstWord = sentence.substring(0,firstSpaceIndex);
        System.out.println(firstWord);

        String lastWord = sentence.substring(lastSpaceIndex+1);
        System.out.println(lastWord);

        String name = "I love Java  I Love Java Java Java";
        int firstJavaLocation = name.indexOf("Java");

        int startingPointToSearchSecondJava = firstJavaLocation+1;
        int secondJavaLocation = name.indexOf("Java",startingPointToSearchSecondJava);
        System.out.println("second java location = "+secondJavaLocation);
        int firstSpaceLocation = name.indexOf(" ");
        int secondSpace = name.indexOf(" ",firstSpaceLocation+1);
        System.out.println("second word in this sentence is: "+name.substring(firstSpaceLocation+1,secondSpace));


    }
}
