public class PROGRAM_Pattern_97
{
    public static void main(int n)
    {
        int i, j, k;
        for (i=1; i<=n; i++)
        {
            for (k=1; k<=(n-i); k++)
                System.out.print(" ");
            for (j=1; j<=i; j++)
            {
                char c = (char) (64 + j);
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}
