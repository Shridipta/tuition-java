public class PROGRAM_Pattern_102
{
    public static void main(int n)
    {
        int i, j;
        char ch;
        for (i=1; i<=n; i++)
        {
            for (j=n-1; j>=i; j--)
                if (i == 1)
                    System.out.print(n);
                else 
                    System.out.print(n-1);
            for (j=1; j<=i; j++)
            {
                ch = (char)(j+64);
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
