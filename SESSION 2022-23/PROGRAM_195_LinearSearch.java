import java.util.*;
public class PROGRAM_195_LinearSearch
{
    public static void main(int arr[], int item)
    {
        int n = arr.length, i, pos = -1;
        for (i=0; i<n; i++)
        {
            if (arr[i] == item)
            {
                pos = i+1;
                break;
            }
        }
        if (pos == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found in position "+pos);
    }
}
