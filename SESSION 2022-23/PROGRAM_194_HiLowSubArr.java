import java.util.*;
public class PROGRAM_194_HiLowSubArr
{
    public static void main(int arr[])
    {
        int n = arr.length;
        int highest, lowest, high, low, i, k=0;
        highest = lowest = arr[0];
        high = low = 0;
        for (i=0; i<n; i++)
        {
            if (arr[i] < lowest) 
            {
                low = i;
                lowest = arr[i];
            }
            else if (arr[i] > highest)
            {
                high = i;
                highest = arr[i];
            }
        }
        int srr[] = new int [Math.abs(n-2)];
        for (i=Math.min(high, low); i<=Math.max(high, low); i++)
        {
            srr[k++] = arr[i];
        }
        System.out.println("Displaying array elements");
        for (i=0; i<srr.length; i++)
            System.out.println(srr[i]);
    }
}
