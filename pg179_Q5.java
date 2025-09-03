import java.util.*;
public class pg179_Q5
{
    public static void main(int year)
    {
        int a=year%4;
        int b=year%100;
        if (a==0&&b==0)
        {
            System.out.println("It is a century leap year");
        }
        else if(a==0)
        {
             System.out.println("It is a leap year");
        }
        else
        {
             System.out.println("It is a century year but not a leap year");
        }
    }
}