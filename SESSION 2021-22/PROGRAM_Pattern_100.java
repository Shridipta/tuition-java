public class PROGRAM_Pattern_100
{
    public static void main(int n)
    {
        int i, j, k;
        for (i=1; i<=n; i++)
        {
            for (k=1; k<=i-1; k++)
                System.out.print(" ");
            for (j=i; j<=n; j++)
                System.out.print(j);
            for (j=n; j>=i; j--)
                System.out.print(j);
            System.out.println();
        }
    }        
}
