public class PROGRAM_Pattern_96
{
    public static void main(int n)
    {
        int i, j, k;
        for (i=1; i<=n; i++)
        {
            for (j=1; j<=n; j++)
                if (i == 1)
                    if (j%2 == 1)
                        System.out.print("#");
                    else
                        System.out.print("@");
                else if (i == n)
                    if (j%2 == 1)
                        System.out.print("@");
                    else
                        System.out.print("#");
                else if (j == 1)
                    System.out.print("#");
                else if (j == n)
                    System.out.print("@");
                else
                    System.out.print(" ");
            System.out.println();
        }
    }
}