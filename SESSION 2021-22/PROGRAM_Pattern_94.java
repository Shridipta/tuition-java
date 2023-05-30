class PROGRAM_Pattern_94
{
    public static void main(int n)
    {
        int i, j, k;
        for (i=1; i<=n; i++)
        {
            for (k=1; k<=(n-i); k++)
                System.out.print(" ");
            for (j=i; j>=1; j--)
                System.out.print(j);
            System.out.println();
        }
    }
}
