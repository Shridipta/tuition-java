public class PROGRAM_135_Pattern
{
    public static void main(int n)
    {
        for(int i=n; i>=1; i--)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(j);
            }
            for(int k=1; k<=n-i; k++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
