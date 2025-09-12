import java.util.*;
public class Sentence_Spilter
{
    public static void main()
    {
        String a=" Arjun is good ";
        int cc=0;
        int s1=0;
        int s2=0;
        
        for(int i=0;i<a.length()-1;i=s2)
        {
            s1=a.indexOf(" ",i);
            s2=a.indexOf(" ",(s1+1));
            System.out.println(a.substring(s1,s2));
        }
    }
}