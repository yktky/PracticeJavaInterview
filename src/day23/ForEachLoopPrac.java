package day23;

public class ForEachLoopPrac {
    public static void main(String[] args) {

        long[] salary = {500000L,100000L,900000L,200000L,300000L,500000L};


        for (long eachSalary :salary){
            if (eachSalary<= 100000){
                continue;
            }
            System.out.println(eachSalary);
        }

        long maxS = salary[0];

        for (long eachS : salary) {
            if (eachS>maxS){
                maxS =eachS;  // now we found --> maxS beacome eachS
            }


        }
    }

}
