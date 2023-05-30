public class PROGRAM_Pattern_105
{
    public static void main(int n)
    {
        int i, j, c = 0, k;
        for (i=1; i<=n; i++)
        {
            for (k=1; k<=n-i;k++)
                System.out.print(" ");
            for (j=1; j<=i; j++)
            {
                c = c+1;
                System.out.print(c%2);
            }
            System.out.println();
        }
    }
}
