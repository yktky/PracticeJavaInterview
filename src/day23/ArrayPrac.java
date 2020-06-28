package day23;





public class ArrayPrac {
    public static void main(String[] args) {


    String [] shows = {"Ali","Berna","Clay","Demir"};   //pay Attention "Ali" is String (Berna,Clay,Demir,Ali are String)
    int showsCount = shows.length;
        //System.out.println(showsCount);
        for (int x = 0; x <shows.length ; x++) {  //Basically each item are String so ----For String ---length());
            System.out.println(shows[x]);

            String currentShows = shows[x];
            System.out.println(currentShows+ " has characther count: "+currentShows.length());


        }
    }

}
