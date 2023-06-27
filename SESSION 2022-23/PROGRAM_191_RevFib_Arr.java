import java.util.*;
public class PROGRAM_191_RevFib_Arr
{
    public static void main(int n)
    {
        int[] arr = new int[n];
        arr[0]=1;
        arr[1]=1;
        int i;
        for (i=2; i<n;i++)
        {
            arr[i] = arr[i-1]+arr[i-2];
        }
        for (i= n-1; i>=0 ;i--)
            System.out.println(arr[i]);
   }
}
