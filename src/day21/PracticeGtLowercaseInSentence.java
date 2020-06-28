package day21;

public class PracticeGtLowercaseInSentence {
    public static void main(String[] args) {
         //Get this sentence only lowercase  --------->Or uppercase

        //Without store it any String----> It will give  samething with 2. way
        String str = "You are going to Market as SDET";
        for (int x = 0; x <str.length() ; x++) {
            char getletter = str.charAt(x);
            if (getletter>='a'&& getletter<='z'){  // I only want to get lowercase
                System.out.println(getletter);
            }

        }

        //2.way we can store in allLowercase variable

        String str2 = "You are going to Market as SDET";
        String allLowercase = "";
        for (int x = 0; x < str2.length() ; x++) {
            char getletter = str2.charAt(x);
            if (getletter>='a'&& getletter<='z'){  // I only want to get lowercase
                allLowercase += getletter;
            }

        }
        System.out.println(allLowercase);


    }
}
