import java.util.*;
public class pg210_prg2
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int a,n,s=0;
        for(a=1;a<=10;a++)
        {
          System.out.println("Enter a number");
          n=in.nextInt();
          s=s+n;
        }
        System.out.println("The sum of numbers ="+s); 
}
}