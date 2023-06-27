import java.util.*;
public class PROGRAM_149_nCr_func
{
    public static void main(int n, int r)
    {
        int f1 = factorial(n);
        int f2 = factorial(n);
        int f3 = factorial(n);
        System.out.println("Number of combinations= "+ f1/(f2*f3));
    }

    static int factorial(int k)
    {
        int f = 1, i;
        for(i=1;i<=k;i++)
            f*=i;
        return f;
    }
}
