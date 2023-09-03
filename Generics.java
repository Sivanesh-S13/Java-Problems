import java.util.Arrays;
public class Generics
{
    public static <E> void printarray(E[] elements)
    {
        Arrays.sort(elements);
        System.out.println(Arrays.toString(elements));
    }
    public static void main(String args[])
    {
        Integer[] intarray={50,10,30,20,70};
        Character[] chararray={'s','i','v','i'};
        String[] strarray={"Apple","Strawberry","Banana","Orange"};
        System.out.println("Printing Integer Arrays\n");
        printarray(intarray);
        System.out.println("\nPrinting Character Arrays\n");
        printarray(chararray);
        System.out.println("\nPrinting String Arrays\n");
        printarray(strarray);

    }
}