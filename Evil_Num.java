import java.util.*;
public class Evil_Num
{
    public static void main(int num)
    {
        String bin="";
        int mod=0;
        int div=0;
        int cc=0;
        while(num>0)
        {
            if(num%2==0)
            {
                bin+="0";
                num/=2;
            }
            else
            {
                bin+="1";
                num-=1;
                num/=2;
            }
        }
        System.out.println(bin);
        for(int i=0;i<bin.length();i++)
        {
            if(bin.charAt(i)=='1')
            {
                cc++;
            }
        }
        if(cc%2==0)
        {
            System.out.println("Evil Num");
        }
        else
        {
            System.out.println("Not a Evil Num");
        }
    }
}