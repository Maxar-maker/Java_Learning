import java.util.*;
public class String_Program
{
    public static void main()
    {
        String str=" Arjun is good ";
        str=str.trim();
        String a=str.toUpperCase();
        a=a.trim();
        String str1="";
        int cv=0;
        int cc=0;
        int cd=0;
        int s1=0;
        int s2=1;
        int max=0;
        String temp="";
        String max_str="";
        for(int i=0;i<a.length();i++)
        {
            if(Character.isDigit(a.charAt(i)))
            {
                cd++;
            }
            if(a.charAt(i)=='A'||a.charAt(i)=='I'||a.charAt(i)=='O'||a.charAt(i)=='U'||a.charAt(i)=='E')
            {
                cv++;
            }
            else
            {
                cc++;
            }
        }
        for(int i=0;i<str.length();i++)
        {
            if(' '==str.charAt(i))
            {
                str1=str1+" "+Character.toUpperCase(str.charAt(i+1));
                i++;
                continue;
            }
            if(str.charAt(i)=='A'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U'||str.charAt(i)=='E')
            {
                str1=str1+"*";
                continue;
            }
            str1+=str.charAt(i);
        }
        String str2=" "+str+" ";
        for(int i=0;i<a.length()-1;i=s2)
        {
            s1=str2.indexOf(" ",i);
            s2=str2.indexOf(" ",(s1+1));
            temp=(str2.substring(s1,s2));
            if(temp.length()>max)
            {
                max=temp.length();
                max_str=temp;
            }
        }
        System.out.println(max_str);
        System.out.println(str1);
        System.out.println(cc);
        System.out.println(cv);
        System.out.println(cd);
    }
}