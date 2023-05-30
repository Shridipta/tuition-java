import java.util.*;
public class PROGRAM_132_alternate
{
    public static void main(int n)
    {
        int copy = n, d, sum = 0;
        while(copy>0)
        {
            d = copy%10;
            sum += d;
            copy/=100;
        }
        System.out.println("Sum of alternate digits = "+sum);
    }
}
