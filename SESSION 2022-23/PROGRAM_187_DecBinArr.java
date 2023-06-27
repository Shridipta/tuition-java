import java.util.*;
public class PROGRAM_187_DecBinArr
{
    public static void main(int num)
    {
        int rem[] = new int[num];
        int k = 0, d, i;
        while (num > 0)
        {
            d = num%2;
            rem[k++] = d;
            num /= 2;
        }
        System.out.println("Binary Number");
        for (i = k-1; i >= 0; i--)
            System.out.print(rem[i]);
    }
}
