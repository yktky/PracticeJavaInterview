package customcl;


public class InstanceBlockTest {
    public static void main(String[] args) {
        InstanceBlock instanceBlock = new InstanceBlock();
        System.out.println(" ---"+instanceBlock.num);
        InstanceBlock instanceBlock1 = new InstanceBlock("John Snow");
        System.out.println("instanceblok"+instanceBlock1.num);

    }
}
