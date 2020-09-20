package B11Method;

public class LongestNameFOREaChLoop {
    public static void main(String[] args) {

        //LongestNmae class and this class is same result only I want to defferent way solve this problem
        String[] names = {"abc","c","hyght"};
        //in order to find max, min,sum ,longest,shortest firsting first
        // we need to store that word or sum...or max in container

        //Why we can do for each loop because it doesnt ask where they location only wants to find longest name
        String longestName = names[0];
        for (String eachName : names) {
            if (eachName.length()>longestName.length()){
                longestName = eachName;
            }
        }
        System.out.println(longestName);
    }
}
