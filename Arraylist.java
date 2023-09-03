import java.util.*;
class Arraylist
{
    public static void main(String args[])
    {
    ArrayList <String> list=new ArrayList <String>();
    list.add("Sivanesh");
    list.add("Roheeth");
    list.add("Gokul");
    list.add("Rahul");
    list.add("Loki");
    System.out.println(list);
    Collections.sort(list);
    for(String lis:list)
    {
        System.out.println(lis);
    }
    }
}