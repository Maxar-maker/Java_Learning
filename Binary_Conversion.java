import java.util.*;
public class Binary_Conversion
{
    public static void main(int num)
    {
        String bin="";
        int mod=0;
        int div=0;
        String new_bin="";
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
        
        
        
        for (int i = bin.length() - 1; i >= 0; i--) {
            new_bin += bin.charAt(i);
        }

        System.out.println(new_bin);
    }
}