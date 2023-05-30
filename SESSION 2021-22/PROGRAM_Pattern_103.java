public class PROGRAM_Pattern_103
{
    public static void main(int n)
    {
        int i, j;
        char ch;
        for (i=1; i<=n; i++)
        {
            for (j=1; j<=n-i+1; j++)
            {
                ch = (char)(j+64);
                System.out.print(ch);
            }
            for (j=1; j<=i; j++)
                System.out.print(j);
            System.out.println();
        }
    }
}
