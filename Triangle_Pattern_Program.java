import java.util.*;
public class Triangle_Pattern_Program
{
    public static void main()
    {
        int sp=4;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                if(j<=sp)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print(j);
                }
            }
            System.out.println();
            sp--;
        }
    }
}