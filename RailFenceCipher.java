import java.util.*;
public class RailFenceCipher
{
    String s1="";
    String s2="";
    String s3="";
    String str="WeFoundYouRun";
    int max=0;
    String arr[][]=new String [3][18];
    public void max()
    {
        if(s1.length()>s2.length())
        {
            if(s1.length()>s3.length())
            {
                max= s1.length();
            }
            else
            {
                max= s3.length();
            }
        }
        else
        {
            if(s2.length()>s3.length())
            {
                max= s2.length();
            }
            else
            {
                max= s3.length();
            }
        }
    }
    public void encrpyt()
    {
        for(int i=0;i<str.length();i+=4)
        {
            s1+=str.charAt(i);
        }
        for(int i=1;i<str.length();i+=2)
        {
            s2+=str.charAt(i);
        }
        for(int i=2;i<str.length();i+=4)
        {
            s3+=str.charAt(i);
        }
    }
    public void save_arr()
    {
        int cc=0;
        int max=18;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<18;j++)
            {
                arr[i][j]="_";
            }
        }
        
        for(int i=0;i<18;i+=4)
        {
            if(s1.length()==cc)
            {
                break;
            }
            arr[0][i]=s1.substring(cc,cc+1);
            cc++;
            
        }
        cc=0;
        for(int i=1;i<18;i+=2)
        {
            if(s2.length()==cc)
            {
                break;
            }
            arr[1][i]=s2.substring(cc,cc+1);
            cc++;
            
        }
        cc=0;
        for(int i=2;i<18;i+=4)
        {
            if(s3.length()==cc)
            {
                break;
            }
            arr[2][i]=s3.substring(cc,cc+1);
            cc++;
        }
        
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<18;j++)
            {
                System.out.printf(arr[i][j]);
            }
            System.out.println();
        }
    }
    public String decrypt()
    {
        String decrypt="";
        for(int i=0;i<18;i++)//col
        {
            for(int j=0;j<3;j++)//row
            {
                decrypt+=arr[j][i];
            }
        }
        decrypt=decrypt.replace("_","");
        return decrypt;
    }
    public static void main()
    {
        RailFenceCipher ob=new RailFenceCipher();
        ob.encrpyt();
        ob.max();
        ob.save_arr();
        System.out.println(ob.decrypt());
    }
}