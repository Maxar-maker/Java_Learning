import java.util.*;
public class Grade10_project
{
    public static void main()
    {
        Scanner scr=new Scanner(System.in);
        System.out.println("Emirp number");
        System.out.println("Enter number");
        int num=scr.nextInt();
        int rev=0;
        int mod=0;
        int temp=num;
        boolean yes1=false;
        boolean yes2=false;
        int cc=0;
        while(num>0)
        {
            mod=num%10;
            num=num/10;
            rev=(rev+mod)*10;
        }
        rev=rev/10;
        for(int i=1;i<=rev;i++)
        {
            if(rev%i==0)
            {
                cc++;
            }
        }
        if(cc==2)
        {
            yes1=true;
        }
        cc=0;
        for(int i=1;i<=temp;i++)
        {
            if(temp%i==0)
            {
                cc++;
            }
        }
        if(cc==2)
        {
            yes2=true;
        }
        if(yes1==true&&yes2==true)
        {
            System.out.println(temp+" is a Emirp number");
        }
        else
        {
            System.out.println(temp+" is a not an Emirp number");
        }
    }
}
