import java.util.*;
public class PROGRAM_188_2ndHighInArr
{
    public static void main(int arr[])
    {
        int n = arr.length, i, max, max2;
        max = arr[0];
        max2 = arr[0];
        for (i=1; i<n; i++)
        {
            if (arr[i] > max)
                max = arr[i];
        }    
        for (i=1; i<n; i++)
            if (arr[i] < max && arr[i] > max2)
                max2 = arr[i];
        System.out.println(max2);
    }
}
