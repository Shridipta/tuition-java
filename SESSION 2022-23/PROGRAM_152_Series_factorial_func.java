import java.util.*;
public class PROGRAM_152_Series_factorial_func
{
    public void main(int n)
    {
        int i, sum=0;
        for(i = 1; i<=n; i++)
            sum+=fact(i);
        System.out.println("Sum="+sum);
    }
    int fact (int k)
    {
        int f = 1, i;
        for(i=1;i<=k;i++)
            f*=i;
        return f;
    }
}
