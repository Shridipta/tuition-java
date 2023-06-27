import java.util.*;
public class PROGRAM_199_HashTable2
{
    public static void main(int arr[])
    {
        int n = arr.length, i, d;
        for (i = 0; i<n; i++)
        {
            d = arr[i];
            if (isRepeat(arr, d, i))
                continue;
            System.out.println("Frequency of " + d + "= " + freq(d, arr));
        }
    }

    public static boolean isRepeat(int arr[], int d, int pos)
    {
        int i, n = arr.length;
        for (i=0; i<n; i++)
            if (d==arr[i])
                break;
        return (pos>i);
    }

    public static int freq (int d, int arr[])
    {
        int i, c = 0, n = arr.length;
        for(i = 0; i<n; i++)
            if (d==arr[i])    
                c++;
        return c;
    }
}
