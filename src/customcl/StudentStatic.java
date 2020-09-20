package customcl;

import java.util.ArrayList;

public class StudentStatic {

    // if you have more than one block
    //it will run in the order it appear

    private static ArrayList<String> studentList1;

    static {


        System.out.println("Welcome to StudentStatic");

    }
    static {
        System.out.println("welcome second time");
    }

    static {
        studentList1 = new ArrayList<>();
        studentList1.add("Abdul");
        studentList1.add("Ayse");
        studentList1.add("Nurilla");
        studentList1.add("Ansar");
        studentList1.add("Ali");
        studentList1.add("Erdem");
    }

    public static void main(String[] args) {
        System.out.println(studentList1); //look directly we can call  static field in main method

        //now I will call displayAllStudent
        displayAllStudent();
        //  loadAllMyData();
        System.out.println("**************");
        addOneStudent("Tugba");
        addOneStudent("Sheroz");
        displayAllStudent();
        updateStudent(3, "Sheroz Zoidow");
        displayAllStudent();
        System.out.println("-----------------------------");
        removeStudent(5);
        displayAllStudent();

    }

    //create static method displayLoadAllStudent, accept no param return nothing
    public static void displayAllStudent() {
        for (int i = 0; i < studentList1.size(); i++) {
            System.out.println((i + 1) + "--->" + studentList1.get(i));
        }
    }
    //create a method to pre-populate 10 student into the list

    //create a static method called addOneStudent, accept one parameter as String name
    //and add that name to list, return no value
    public static void addOneStudent(String name) {
        studentList1.add(name);
    }

    //create a static method called addOneStudent, accept 2 parameter as int index and  String name
    // it will update the name of stodent at that location
    public static void updateStudent(int index, String newNmae) {

        //what if i have 10 student but I wanna try to set this
        // value of number 100 student how we handle this???if we go over this quaetion
        if (index >= studentList1.size()) {
            System.out.println("OUT OF RANGE");
            // break; no swithch no loop we can not use break with if
            return; //we use return it imediatly out from mehod
        }
        studentList1.set(index, newNmae);

    }

    public static void removeStudent(int index) {

        if (index >= studentList1.size()) {
            System.out.println("OUT OF RANGE  remove");
            return;
        }
        studentList1.remove(index);

    }
}
