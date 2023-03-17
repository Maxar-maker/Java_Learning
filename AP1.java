public class AP1 //extends AP and driver class
{
    public int mystery(int x)
    {
        int[] a={0,2,3,4};
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==x)
            {
                return i;
            }
            else
            {
                return -1;
            }
            
        }
        return 0;
    }
    public static void main(int y)
    {
     AP1 ob=new AP1();
        int a=ob.mystery(2);
        System.out.println(a);
    }
}
 
