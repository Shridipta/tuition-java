import java.util.*;
public class PROGRAM_129_Evil
{
    public static void main(int n)
    {
        int rem, bin = 0, i = 1, d, c=0;
        while (n != 0) 
        {
            rem = n % 2;
            n = n / 2;
            bin = bin + (rem * i);
            i = i * 10;
        }
        while (bin>0)
        {
            d = bin %10;
            if (d==1)
                c++;
            bin = bin/10;
        }
        if(c%2 == 0)
            System.out.println("Evil Number");
        else
            System.out.println("Not a evil number");
    }
}
