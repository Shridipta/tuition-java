public class PROGRAM_Pattern_86
{
    public static void main(int n)
    {
        int i, j, a, b, c;
        for (i=1; i<=n; i++)
        {
            a = 1; b = 0; c = 0;
            for (j=1; j<=i; j++)
            {
                c = a+b;
                System.out.print(c+" ");
                a = b; b = c;
            }
            System.out.println();
        }
    }
}
