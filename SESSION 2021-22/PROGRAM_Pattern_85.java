public class PROGRAM_Pattern_85
{
    public static void main(int n)
    {
        int i, j, c;
        for (i=1; i<=n; i++)
        {
            for (j=1; j<=i; j++)
            {
                c = i*j;
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}
