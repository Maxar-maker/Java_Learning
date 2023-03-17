import java.util.*;
public class AP
{
    int sum=0;
    int TARGET;
    public void fib(int a,int b)
    { 
        if(sum<=TARGET)
        {
            System.out.print(a+",");
            sum =a+b;
            a=b;
            b=sum;
            //System.out.print(sum+",");
            fib(a,b);
        }
        else
        {
            System.out.print(a+"!");
            //System.out.print(b+"!");
            return;
        }
    }
    }


        

