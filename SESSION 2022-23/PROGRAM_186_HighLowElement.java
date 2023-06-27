import java.util.*;
public class PROGRAM_186_HighLowElement
{
    public static void main(int arr[])
    {
        int n = arr.length;
        int max, min, i, num;
        max = min = arr[0];
        for (i=0; i<n; i++)
        {
            num = arr[i];
            if (num > max)
                max = num;
            if (num < min)
                min = num;
        }
        System.out.println("Highest Element = "+max);
        System.out.println("Lowest Element = "+min);
    }
}
