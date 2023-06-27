import java.util.*;
public class PROGRAM_188_2ndHighInArr2
{
    public static int[] remDuplicateArr(int arr[])
    {
        int n = arr.length, i, j, temp, count, k=0;
        for (i=0; i<n; i++)
        {
            count = 0;
            for (j=i+1; j<n; j++)
            {
                if(arr[i] == arr[j])
                    count++;
            }
            if (count == 0)
                arr[k++] = arr[i];
        }
        return arr;
    }

    public static int[] bubbleSort(int arr[])
    {
        int temp, n = arr.length, i, j;  
        for (i=0; i<n-1; i++)
            for(j=0; j<n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
        return arr;
    }

    public static void main(int arr[])
    {  
        int n = arr.length;
        remDuplicateArr(bubbleSort(arr));
        System.out.println("Second Highest Value = " + arr[n-3]);  
    }  
}
