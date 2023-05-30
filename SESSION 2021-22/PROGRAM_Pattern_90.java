public class PROGRAM_Pattern_90
{
    public static void main(int n)
    {
        int i, j, k;
        for (i = 1; i <= n; i++)
        {
            for (j = i; j <= n; j++)
                System.out.print(j);
            for (k = 1; k <= (i-1); k++)
                System.out.print(k);
            System.out.println();
        }
    }
}
