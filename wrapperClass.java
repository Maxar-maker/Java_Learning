import java.util.*;
public class wrapperClass 
{
    public static void main()
    {
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter your age");
        int age=scr.nextInt();
        int v=0;
        int k=0;
        int n=0;
        int l=0;
        char ch;
        boolean a=true;
        String s;
        while(a==true)
        {
            System.out.println("To stop type :No");
            s=scr.next();
            if(s=="No"||s=="no")
            {
                a=false;
                break;
            }
            /*else
            {
            if(age>=13)
            {
            System.out.println("Enter your house");
            System.out.println("V-Vishal,K-Kamal,N-Nihal");
            ch=scr.next().charAt(0);
            if(ch=='V'||ch=='v')
            {
                v++;
                System.out.println("You are registered");
            }
            if(ch=='K'||ch=='k')
            {
                k++;
                System.out.println("You are registered");
            }
            if(ch=='N'||ch=='n')
            {
                n++;
                System.out.println("You are registered");
            }
            }
            if(v<22)
                {
                    System.out.println("Not enough people in v");
                }
            if(k<24)
                {
                    System.out.println("Not enough people in k");
                }
            if(n<14)
                {
                    System.out.println("Not enough people in n");
                }*/
          
            
        }
                
    }
}