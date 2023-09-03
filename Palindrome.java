import java.util.*;
import java.io.*;

public class Palindrome
{
    public static void main(String args[])
    {
        System.out.println("Enter a number:");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int r;
        int sum=0;
        int temp;
        temp=n;
        while(n>0)
        {
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }

        System.out.println("The Reverse of the Given Number:"+sum);
        if(temp==sum)
        {
            System.out.println("The Number is Palindrome");
        }
        else
        {
            System.out.println("The Number is not a Palindrome");
        }
    }
}