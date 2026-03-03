import java.util.*;
public class Binary
{
    public static void main(int num)
    {
        String str="";
        while(num>0)
        {
            if(num%2==1)
            {
                str+="1";
                num=(num-1)/2;
            }
            else
            {
                str+="0";
                num=(num)/2;
            }
        }
        StringBuffer sb=new StringBuffer(str);
        System.out.println(sb.reverse());
    }
}