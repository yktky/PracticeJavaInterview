package customcl;

public class StaticBlock {
    // this is the most of the time  you gonna use the  initilizer your field
    // if you have some type of custom things you wanna do before it is being use at the first time
    public  static  String school;
    public static boolean isRamadan;
    public StaticBlock(){
        System.out.println("This is default constructor: I just for remember future" +
                " Look Order for static block");
    }

    static {
        school = "Cyberek School";
        System.out.println("school = " + school);
        System.out.println("Let The Journey Begin");
        if (isRamadan){
            System.out.println("Use ramadan schedule");
        }else {
            System.out.println("Use normal Schedule");
        }
    }
}
