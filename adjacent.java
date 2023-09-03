import java.util.*;
import java.io.*;
class thief
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int size,sum=0;
        size=s.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++)
        arr[i]=s.nextInt(); 
        for(int i=0;i<arr.length;i+=2)
        sum+=arr[i];
        System.out.println(sum);


    }
}