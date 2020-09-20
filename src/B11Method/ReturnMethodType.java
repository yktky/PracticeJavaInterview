package B11Method;

public class ReturnMethodType {
    public static void main(String[] args) {

        long salaryfirstYear = giveme6DigitSalary();
        long salarysecondYear = giveme6DigitSalary();
        System.out.println(salaryfirstYear+salarysecondYear); //pay attention 2 time we
                                                              // called method and we do concat

        //imagine second year %10 Raise
        long secondyearSalary = (long)(salaryfirstYear*1.1); // double with downcasting to th along
        System.out.println(salaryfirstYear+secondyearSalary);



    }
    public static long giveme6DigitSalary(){
        return 180000;
    }
}
