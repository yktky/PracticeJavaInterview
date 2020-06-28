package FirstTopicsPractice;

public class SubStringpPractice {
    public static void main(String[] args) {
        //substring is getting part of String

        //Get from the second word till last word
        String movie = "Lord Of The Ring";

        int startingPoint = movie.indexOf(" ")+1;
        int endingPoint = movie.length();
        System.out.println("second word till last word: "+movie.substring(startingPoint,endingPoint));
        String secondToLast = movie.substring(5);
        System.out.println(secondToLast);

        // TURN  Lord Of The Ring  --->Ring Of The Lord

        String wordRing = movie.substring(12);
        String wordOfThe = movie.substring(4,12);
        String wordLord = movie.substring(0,4);
        System.out.println(wordRing+" "+wordOfThe+" "+wordLord);

    }
}
