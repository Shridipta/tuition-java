import java.util.*;
public class PROGRAM_182_Series_factDiv_func
{
    public void main(int n, int x)
    {
        int sign=1, i;
        for(i=1;i<=n;i++)
        {
            double term = Math.pow(x, i)/fact(i);
            System.out.println(term*sign);
        }
    }

    int fact(int n)
    {
        int i, f=1;
        for (i=1;i<=n;i++)
            f*=i;
        return f;
    }
}
