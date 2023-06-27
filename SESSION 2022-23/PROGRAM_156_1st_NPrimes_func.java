import java.util.*;
public class PROGRAM_156_1st_NPrimes_func
{
    public static void main(int n)
    {
        int k = 0;
        for (int i = 1; ; i++)
        {
            if (isprime(i) ==true)
            {
                System.out.println(i);
                k++;
            }
            if (k==n)
                return;
        }
    }
    static boolean isprime(int num)
    {
        int i, c=0;
        for(i = 1; i<=num ; i++)
            if (num%i == 0)
                c++;
        return (c==2);
    }
}
