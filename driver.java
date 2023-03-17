public class driver
{
    public static void main()
    {
        cat c1=new cat();
        tiger t1=new tiger();
        cat s1=new tiger();
        /*//tiger s2=new cat();
        c1.greet();
        t1.greet();
        s1.greet();
        
        System.out.println("");
        c1.sleep();
        t1.sleep();
        s1.sleep();
        //c1.sleep(5);
        t1.sleep(6);
        //s1.sleep(7);
        ((tiger) s1).sleep(7);
        
        //((tiger) c1).sleep(8);
        
        
        System.out.println("");
        c1.eat();
        t1.eat();
        s1.eat();
        ((tiger) s1).eat();
        
        System.out.println("");
        //c1.talk();
        t1.talk();
        //s1.talk();*/
        
        ((cat)s1).eat();
        t1.greet();
        s1.m1(4);
        t1.m1("hi");
        c1.m1(5);
        
    }
}