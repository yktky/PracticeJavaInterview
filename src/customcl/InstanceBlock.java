package customcl;

import java.util.Random;

public class InstanceBlock {

    int num;

    {
        System.out.println("ALL SYSTEM GO");
        Random r = new Random();
        num = r.nextInt(100);
    }

    public InstanceBlock() {
        System.out.println("Constructor");
    }
    public InstanceBlock(String name){
        System.out.println("Constructor "+name);
    }
}
