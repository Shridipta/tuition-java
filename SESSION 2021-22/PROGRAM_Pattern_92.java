class PROGRAM_Pattern_92
{
    public static void main(int n)
    {
        int i, j, k, c = 0;
        for (i=n; i>=1; i--)
        {
            for (j=1; j<=i; j++)
                System.out.print(j);
            for (k=1; k<=c; k++)
                System.out.print(" ");
            for (j=i; j>=1; j--)
                System.out.print(j);
            System.out.println();
            c+=2;
        }
    }
}
