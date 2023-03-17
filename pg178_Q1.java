import java.util.*;
public class pg178_Q1
{
    public static void main(int a,int b,int c)
    {
        if(a+b+c==180)
        {
            if (a==90||b==90||c==90)
            {
                System.out.println("It is a right angle triangle");
            }
            else if (a<90||b<90||c<90)
            {
                System.out.println("It is a obtuse angle triangle");
            }
            else
            {
                System.out.println("It is a actue angle triangle");
            }
        }
        else
        {
            System.out.println("It is not a triangle");
        }
    }
}