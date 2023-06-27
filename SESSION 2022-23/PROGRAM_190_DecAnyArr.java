import java.util.*;
public class PROGRAM_190_DecAnyArr
{
    public static void main(int num, int b)
    {
        int rem[] = new int[num];
        int k = 0, d, i;
        while (num > 0)
        {
            d = num%b;
            rem[k++] = d;
            num /= b;
        }
        System.out.println("Binary Number");
        for (i = k-1; i >= 0; i--)
        {
            num = rem[i];
            if (num > 9)
                System.out.print((char) rem[i] +55);
            else
                System.out.print(rem[i]);
        }
    }
}
