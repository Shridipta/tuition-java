import java.util.*;
public class PROGRAM_189_PrimeComp_Arrs
{ 
    public static void main(int arr[])
    {
        int n = arr.length;
        int parr[] = new int [n];
        int carr[] = new int [n];
        int i, c, j, k1=0, k2=0;
        for (i = 0; i<n; i++)
        {
            c = 0;
            for (j = 1; j<=arr[i]; j++)
                if (arr[i]%j == 0)
                    c++;
            if  (c==2)
                parr[k1++] = arr[i];
            else
                carr[k2++] = arr[i];
        }
        System.out.println("Prime Array");
        for (i=0; i<n; i++)
            System.out.print(parr[i] + " ");
        System.out.println("\nComposite Array");
        for (i=0; i<n; i++)
            System.out.print(carr[i] + " ");
    }
}