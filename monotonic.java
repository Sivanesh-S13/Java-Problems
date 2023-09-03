import java.util.*;
import java.io.*; 

class monotonic
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int size,i,j;
        System.out.println("Enter the Number of elements:");
        size=s.nextInt();
        int[] arr=new int[size];
        for(i=0;i<size;i++)
            arr[i]=s.nextInt();

        for(i=0;i<size;)
        for (int k : arr) {
            System.out.println(k);
        }
    }
}