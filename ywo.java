public class ywo
{
    public static void main()
    {
        System.out.println("");
       test ob=new test();
       ob.yes1();
       ob.yes(8);
       //ob.yes2();
       
       test2 ob2=new test2();
       ob2.yes2();
       ob2.yes(8);
       ob2.yes1();
       System.out.println(ob2.i);
       
       test ob3=new test2();
       test2 ob4=(test2)ob3;
       ob3.yes(2);
       ob3.yes1();
       //ob3.yes2();
       System.out.println("OB4 test"+ob4.i);
       ob4.yes(2);
       ob4.yes2();
       ob4.yes1();
    }
}