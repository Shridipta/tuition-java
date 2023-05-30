public class PROGRAM_113_rev_sqr
{
    public static void main()
    {
        for (int i = 10; i<=100; i++)
        {
            int sqr = i*i, sqrt, r1 = 0, r2 = 0, d;
            while(sqr>0)
            {
                d = sqr % 10;
                r1 = r1*10+d;
                sqr = sqr/10;
            }
            sqrt = (int) Math.sqrt(r1);
            if (sqrt < i)
                continue;
            while (sqrt>0)
            {
                d = sqrt%10;
                r2 = r2 *10+d;
                sqrt = sqrt/10;
            }
            if (r2 == i)
                System.out.println(i);
        }
    }
}
