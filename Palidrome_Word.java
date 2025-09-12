import java.util.*;
public class Palidrome_Word 
{
    public static String PalindromeChecker(String word)
    {
        int palcount=0;
        char ch;
        String str2="";
        for (int i=word.length()-1;i>=0;i--)
        {
            ch=word.charAt(i);
            str2=str2+ch;
        }
        if (word.equals(str2))
        {
            palcount++;
            //System.out.println(word);
            return word;
        }
        else
        {
            return "NO";
        }
        
    }
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str=in.nextLine();
        str=str.trim();
        str=" "+str+" ";
        int word1=0, word2=0;String w3="";
        System.out.println("Palindrome Words: ");
        for (int i=0;i<str.length()-1;i=word2)
        {
            word1=str.indexOf(" ",i);
            word2=str.indexOf(" ",(word1+1));
            w3=str.substring(word1, word2).trim();
            
            System.out.println(PalindromeChecker(w3));
        }
    }
}