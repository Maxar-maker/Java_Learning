public class driver_AP
{
    public static void main()
    {
        SuperTest bob=new SuperTest1();
        driver_AP ob=new driver_AP();
        
        System.out.println( "supertest" + ((SuperTest1)bob).endoskeleton );
        System.out.println("plain test" + bob.endoskeleton);
        bob.action();
    }
}