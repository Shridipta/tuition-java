import java.util.*;
public class PROGRAM_196_BinarySearch
{
    public static void main(int arr[], int item)
    {
        int start = 0, end = arr.length, mid = 0;
        while (start <= end)
        {
            mid = (start+end)/2;
            if(item > arr[mid])
                start = mid+1;
            else if (item < arr[mid])
                end = mid -1;
            else
                break;
        }
        if (arr[mid] == item)
            System.out.println("Element found in position " + (mid+1));
        else
            System.out.println("Element not found");
    }
}
