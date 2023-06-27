import java.util.*;
public class REVISION2_PROG_5
{
    public static void main(int n)
    {
        for (int i = 1; i<= n; i++)
        {
            for (int l = 1; l<=i-1; l++)
                System.out.print(" ");
            for(int j =i ; j<=n ; j++)
                System.out.print(j);
            for(int k =n ; k>=i ; k--)
                System.out.print(k);
            System.out.println();
        }
    }
}
