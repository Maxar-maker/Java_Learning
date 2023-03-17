public class test2 extends test 
{
    public int i=0;
    public void yes(int n)
    {
        super.yes(n+3);
        n*=2;
        System.out.println(n);
    }
    public void yes2()
    {
        System.out.println("yes2");
    }
}