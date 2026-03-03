import java.util.*;
public class SumOfSetence
{
    public static int cc(String s)
    {
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            c+=(int)s.charAt(i);
        }
        return c;
    }
    public static void main(String str)
    {
        String str1="";
        int min=9999;
        int cc=0;
        int min_i=0;
        StringTokenizer sc=new StringTokenizer(str);
        String arr[]=new String[sc.countTokens()];
        int i=0;
        while(sc.hasMoreTokens())
        {
            arr[i]=sc.nextToken();
            i++;
        }
        for(int j=0;j<arr.length;j++)
        {
            for(int a=0;a<arr.length;a++)
            {
                if(min>cc(arr[a]))
                {
                    min=cc(arr[a]);
                    min_i=a;
                }
            }
            str1+=" "+arr[min_i];
            arr[min_i]="zzzzz";
            min=9999;
        }
        System.out.println(str1);
    }
}