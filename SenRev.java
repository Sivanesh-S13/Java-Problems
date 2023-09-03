import java.util.*;
import java.lang.*;
import java.io.*;
public class SenRev {
    public static void main(String[] args) {

        //System.out.println("Hello world!");
        //int i,j;
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String s[]=str.split(" ");
        for(int i=s.length-1;i>=0;i--)
        {
            System.out.print(s[i]+" ");
        }

        
    }
}