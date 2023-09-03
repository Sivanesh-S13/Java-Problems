import java.util.*;
class binary
{
    public static void main(String[] args) {
        
        int arr[]={3,6,9,13,45,50,51};
        int n=6;
        int len=arr.length;
        int low=0,high=len-1;
        int mid=(high+low)/2;
        while(low<=high)
        {
            if(arr[mid]<n)
                low=mid+1;
            else if(arr[mid]==n)
                {System.out.println("Element "+arr[mid]+" found at index "+mid);
                break;
        }
            else
                high=mid-1;

            mid=(high+low)/2;
        }
    }
}