import java.util.*;
public class PROGRAM_Pattern_140
{
    public static void main(int n)
    {
        for (int i = 1; i <= n ; i++)
        {
            for (int j = 1; j <= n-i+1 ; j++)
                System.out.print(j);
            for (int k = 1; k <= i-1; k++)
                System.out.print(" ");
            for (int l = i-1; l >=1  ; l--)
                System.out.print(" ");
            for (int l = n-i+1; l >=1  ; l--)
                System.out.print(l);
            System.out.println();
        }
        for (int i = 2; i <= n ; i++)
        {
            for (int j = 1; j <= i ; j++)
                System.out.print(j);
            for (int k = 1; k <= n-i; k++)
                System.out.print(" ");
            for (int l = n-i; l >=1  ; l--)
                System.out.print(" ");
            for (int l = i; l >=1  ; l--)
                System.out.print(l);
            System.out.println();
        }
    }
}
