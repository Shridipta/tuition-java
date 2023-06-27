import java.util.*;
public class PROGRAM_198_SepPrimeComp
{
    public static void main(int arr[])
    {
        int i, j, n = arr.length, temp;
        for (i=0; i<n; i++)
            for(j=0; j<n-1; j++)
                if (isPrime(arr[j+1]) == true && isPrime(arr[j]) == false)
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
        System.out.println("Array in rearranged order");
        for (i=0; i<n; i++)
            System.out.println(arr[i]);
    }
    public static boolean isPrime(int num)
    {
        int i = 1, c = 0;
        for (i=1; i<=num; i++)
            if (num%i==0)
                c++;
        if (c==2)
            return true;
        return false;
    }
}
