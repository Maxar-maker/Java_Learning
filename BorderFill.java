import java.util.*;
public class BorderFill
{
    public static void main(int n,int m)
    {
        char arr[][]=new char[n][m];
        char a='#';
        char b='$';
        char c='@';
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=c;
            }
        }
        arr[0][0]=a;
        arr[n-1][0]=a;
        arr[0][m-1]=a;
        arr[m-1][n-1]=a;
        int i=0;//r
        int j=1;//c
        while(arr[i][j]!=a)
        {
            arr[i][j]=b;
            j++;
        }
        i=1;
        j=0;
        while(arr[i][j]!=a)
        {
            arr[i][j]=b;
            i++;
        }
        i=n-1;
        j=1;
        while(arr[i][j]!=a)
        {
            arr[i][j]=b;
            j++;
        }
        i=1;
        j=m-1;
        while(arr[i][j]!=a)
        {
            arr[i][j]=b;
            i++;
        }
        
        for(int c1=0;c1<n;c1++)
        {
            for(int c2=0;c2<m;c2++)
            {
                System.out.print(arr[c1][c2]);
            }
            System.out.println();
        }
    }
}