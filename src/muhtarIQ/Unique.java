package muhtarIQ;

public class Unique {
    public static void main(String[] args) {

        System.out.println(unique("aaaabbbbccduy"));
    }





    public static String unique(String str) {

        String[ ] arr=str.split("");

        String unique1="";

        for(int j=0; j<arr.length; j++) {

            int num=0;

            for(int i=0; i<arr.length; i++ ) {

                if(arr[i].equals(arr[j]) )

                    num++;

            }

            if(num==1)

                unique1+=arr[j];

        }

        return unique1;

    }
}
