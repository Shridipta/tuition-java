public class PROGRAM_4digit_prime_131
{
    public static void main()
    {
        int c = 0, l, j, copy, q = 0, f;
        for (int i = 1000; i<=10000; i++)
        {
            c = 0; 
            for (j = 1; j<=i ; j++)  //prime check
            {
                if (i%j == 0) 
                    c++;
            }
            if (c==2)   //last == first digit check
            {
                l = i%10;
                copy = i;
                
                q = 0;
                while(copy>0)
                {
                    q++;
                    copy/=10;
                }
                f = i/(int)Math.pow(10, q-1);
                
                if (f == l)
                    System.out.println(i);
            }
        }
    }
}
