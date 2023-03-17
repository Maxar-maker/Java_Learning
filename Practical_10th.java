import java.util.*;
public class Practical_10th
{
    public static void main()
    {
        Scanner scr=new Scanner(System.in);
        System.out.println("Math function series sum");
        System.out.println("Enter ending number");
        int num=scr.nextInt();
        double t_sum=0;
        
        for(int j =1;j<=num;j++)
        {
            t_sum+=Math.sin(j);
        }
        System.out.println("Total sum of Math function:"+t_sum);
    }
}
