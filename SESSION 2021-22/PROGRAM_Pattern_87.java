public class PROGRAM_Pattern_87
{
    public static void main(int n)
    {
        int i, j;
        for (i=1; i<=n; i++)
        {
            for (j=1; j<=n; j++)
                if (i==1 || i==n || j==1 || j==n)
                    System.out.print(i);
                else
                    System.out.print(" ");
            System.out.println();
        }
    }
}
