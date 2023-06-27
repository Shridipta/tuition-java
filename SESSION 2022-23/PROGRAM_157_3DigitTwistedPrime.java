import java.util.*;
public class PROGRAM_157_3DigitTwistedPrime
{
    public static void main()
    {
        for (int i = 100; i<=1000; i++)
            if (isprime(i) ==true && isprime(reverse(i)) == true)
                System.out.println(i);
    }
    static boolean isprime(int num)
    {
        int i, c=0;
        for(i = 1; i<=num ; i++)
            if (num%i == 0)
                c++;
        return (c==2);
    }
    static int reverse(int num)
    {
        int r = 0, d;
        while (num>0)
        {
            d = num%10;
            r = r*10+d;
            num/=10;
        }
        return r;
    }
}