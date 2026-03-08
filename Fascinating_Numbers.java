import java.util.*;
public class Fascinating_Numbers
{
    public static void main(int num_og)
    {
        char num[]={'1','2','3','4','5','6','7','8','9'};
        int num_n[]=new int[9];
        int cc=0;
        int temp=num_og;
        while(temp>0)
        {
            cc++;
            temp/=10;
        }
        int n2=num_og*2;
        int n3=num_og*3;
        System.out.println(num_og+""+n2+""+n3);
        System.out.println(cc);
        String num_s=num_og+""+n2+""+n3;
        boolean ch=true;
        int cc1=0;
        for(int j=0;j<9;j++)
        {
            for(int i=0;i<num_s.length();i++)
            {
                if(num_s.charAt(i)==num[j])
                {
                    cc1++;
                }
                if(cc1>1)
                {
                    ch=false;
                }
                
            }
            cc1=0;
        }
        System.out.println(ch);
    }
}