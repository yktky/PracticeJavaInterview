package B11Wrapper;

public class MethodOverloadingwithWrrapper {
    public static void main(String[] args) {

        doSomething(Integer.parseInt("100"));
        //OR we can store in int data type
        int val = Integer.parseInt("100");
        doSomething(val);


    }
    public static void doSomething(int x){
        System.out.println("dosomething(intx)"); // void method always sout inside method
    }
}
