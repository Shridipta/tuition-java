import java.util.*;
public class PROGRAM_197_BubbleSort
{
    public static void main(int arr[])
    {
        int i, j, n = arr.length, temp;
        for (i=0; i<n-1; i++)
            for(j=0; j<n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
        System.out.println("Array in ascending order");
        for (i=0; i<n; i++)
            System.out.println(arr[i]);
    }
}
