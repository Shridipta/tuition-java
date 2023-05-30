public class PROGRAM_Pattern_89
{
    public static void main(int n)
    {
        int i, j;
        for (i=1; i<=n; i++)
        {
            for (j=1; j<=i; j++)
                System.out.print(j%2);
            System.out.println();
        }
    }
}
