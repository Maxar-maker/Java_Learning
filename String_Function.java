import java.util.*;
public  class String_Function
{
    public static void main()
    {
        String s="COMPUTER";
        s=s.trim();
        String l;
        String s1="";
        for(int i=0;i<s.length();i++)
        {
            l=s.substring(i,i+1);
            if(l.equals("A")||l.equals("I")||l.equals("O")||l.equals("U")||l.equals("E"))
            {
                continue;
            }
            else
            {
                s1+=l;
            }
        }
        
        
        System.out.println(s1);
    }
}