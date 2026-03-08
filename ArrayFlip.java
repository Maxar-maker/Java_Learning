import java.util.*;
public class ArrayFlip
{
    public static void main()
    {
        int arr[]={1,2,3,4};
        int f=0;
        int e=arr.length-1;
        int temp=0;
        int n=0; 
        while(n<=(4/2))
        {
            temp=arr[f];
            arr[f]=arr[e];
            arr[e]=temp;
            f++;
            e--;
            n++;
        }
        for(int a:arr)
        {
            System.out.println(a);
        }
    }
}