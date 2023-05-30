public class PROGRAM_Pattern_88
{
    public static void main(int n)
    {
        int i, j, c = 0;
        for (i=1; i<=n; i++)
        {
            for (j=1; j<=i; j++)
            {
                c = c+1;
                System.out.print(c%2);
            }
            System.out.println();
        }
    }
}
