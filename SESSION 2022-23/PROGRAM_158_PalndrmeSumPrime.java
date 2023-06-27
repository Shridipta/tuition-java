import java.util.*;
public class PROGRAM_158_PalndrmeSumPrime
{
    public static void main(int start)
    {
        int k = 0, copy, rev, d, sum = 0, c, j;
        for (int i = start;  ; i++)
        {
            if (k == 50)
                return;
            copy = i;
            rev = 0;
            sum=0;
            c = 0;
            while (copy>0)
            {
                d = copy%10;
                rev = rev*10+d;
                copy/=10;
            }
            if (rev == i)
            {
                copy = i;
                while (copy>0)
                {
                    d = copy%10;
                    sum+=d;
                    copy/=10;
                }
                for (j = 1; j<=sum; j++)
                    if (sum % j == 0)
                        c++;
                if (c == 2)
                {
                    System.out.println(i);
                    k++;
                }
            }
        }
    }
}
