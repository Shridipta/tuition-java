public class Prime_Decomp
{
    public static void main(int num)
    {
        int i;
        for (i = 2; i <= num;)
            if (num % i == 0)
            {
                System.out.print(i + " ");
                num = num / i;
            }
            else
                i++;
    }
}
