package exceptensP;

public class CheckedExceptions {
    public static void main(String[] args)  {

        try {
            Thread.sleep(3);  // (unwanted) checked exceptions during compile , we have to handle it with try catach blok
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //we have to handle checked exceptions

        /*this is place that where is  we store exception code and statement
        *  try block we store exceptions will
        *
        * catch block  we store exceptions -----> to try to catch exceptions it will catch execptions */
    }
}
