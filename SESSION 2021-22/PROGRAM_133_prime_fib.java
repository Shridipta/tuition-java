public class PROGRAM_133_prime_fib
{
    public static void main(int n)
    {
        int a = 1, b = 0, c, i, count, j;
        for(i = 1; i <= n; )
        {
            c = a+b;
            count = 0;
            for (j = 1; j <= c; j++)
                if (c%j == 0)
                    count++;
            if (count == 2)
            {
                System.out.println(c + " ");
                i++;
            }
            a = b;
            b = c;
        }
    }
}