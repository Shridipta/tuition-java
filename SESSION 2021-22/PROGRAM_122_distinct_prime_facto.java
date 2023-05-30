public class PROGRAM_122_distinct_prime_facto
{
    public static void main(int num)
    {
        int i, c;
        for (i = 2; i <= num;)
            if (num % i == 0)
            {
                c = i;
                num = num / i;
            }
            else
            {
                i++;
            }
    }
}
