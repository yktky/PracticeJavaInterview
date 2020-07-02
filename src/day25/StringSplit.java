package day25;

import java.util.Arrays;

public class StringSplit {
    public static void main(String[] args) {



        String shows = "Orville, Game Of Throne, X-Man, Gifted, Breaking Bad";

        String [] splitshowsArray = shows.split(" ");  //Pay attention With Space split see output then you will see difference
        System.out.println(Arrays.toString(splitshowsArray));

        for (int i = 0; i < splitshowsArray.length; i++) {
            System.out.print(splitshowsArray[i]);
        }// We commmented beacause Now I wanna  only see one or last item one by one

//        //see only 1 item
//        System.out.println(splitshowsArray[1]);
//        //see last item
//        System.out.println(splitshowsArray[splitshowsArray.length-1]);
//
//        String[] splitshowsArary2 = shows.split("Game Of Throne");
//        System.out.println(Arrays.toString(splitshowsArary2));

    }
}
