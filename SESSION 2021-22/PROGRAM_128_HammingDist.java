import java.util.*;
public class PROGRAM_128_HammingDist
{
    public static void main(int a, int b)
    {
        int rem, bin1 = 0, bin2 = 0, i = 1, c = 0;
        int cpy1 = a, cpy2 = b, d1, d2, f = 0;
        while (a != 0) 
        {
            rem = a % 2;
            a = a / 2;
            bin1 = bin1 + (rem * i);
            i = i * 10;
            c++;
        }
        i = 1;
        c = (cpy2>cpy1?0:c);
        if (cpy2>cpy1)
            c = 0;
        while (b != 0) 
        {
            rem = b % 2;
            b = b / 2;
            bin2 = bin2 + (rem * i);
            i = i * 10;
            c++;
        }
        while (c>0)
        {
            d1 = bin1 % 10;
            d2 = bin2 % 10;
            if (d1 != d2)
                f++;
            bin1 = bin1/10;
            bin2 = bin2 / 10;
            c--;
        }
        System.out.println("Hamming Distance = "+f);
    }
}
