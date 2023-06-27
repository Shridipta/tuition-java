import java.util.*;
public class REVISION2_PROG_1
{
    public static void main(int n)
    {
        int i, j, k, l;
        for (i=1; i<=n; i++)
        {
            for (k=1; k<=(n-i); k++)
                System.out.print(" ");
            for (j=1; j<=i; j++)
                System.out.print(j);
            for (j=i-1; j>=1; j--)
                System.out.print(j);
            System.out.println();
        }
        for (i=n; i>=1; i--)
        {
            for (k=1; k<=(n-i+1); k++)
                System.out.print(" ");
            for (j=1; j<=i-1; j++)
                System.out.print(j);
            for (j=i-2; j>=1; j--)
                System.out.print(j);
            System.out.println();
        }
    }
}
