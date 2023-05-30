public class PROGRAM_Pattern_98
{
    public static void main(int n)
    {
        int i, j, k;
        for (i=1; i<=n; i++)
        {
            for (k=1; k<=(n-i); k++)
                System.out.print(" ");
            for (j=1; j<=i; j++)
                System.out.print("* ");
            System.out.println();
        }
        for (i=n; i>=1; i--)
        {
            for (k=1; k<=n-i+1; k++)
                System.out.print(" ");
            for (j=i-1; j>=1; j--)
                System.out.print("* ");
            System.out.println();
        }
    }
}
