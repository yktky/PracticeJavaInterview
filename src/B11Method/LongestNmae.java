package B11Method;

public class LongestNmae {
    public static void main(String[] args) {

        //create static method called findLongestWord
       // this method have one parameter as String variable and return the longest as String


        /* in interview you will say logic:
        * i will take first one get length and I will compare with second one then Third one just i will keep
        * swapping the biggest item whatever biggest length is
        * i will just keeping putting into temparray bug that  will crated   I will store biggest length there*/
        String[] names = {"abc","c","hyght"};
        //in order to find max, min,sum ,longest,shortest firsting first
        // we need to store that word or sum...or max in container
        String longestName = names[0];
        for (int i = 0; i < names.length; i++) {
            if (names[i].length()>longestName.length()){
                longestName=names[i];

            }
        }
        System.out.println(longestName);
    }
}
