import java.util.*;
public class PROGRAM_150_Series_factorial_func
{
    public void main(int n, int x)
    {
        int sign=1,i, a=1;
        double term, sum=0;
        for(i = 1; i<=n;i++)
        {
            term =  (Math.pow(x, a)/fact(a)) * sign;
            System.out.println(term);
            sum+=term;
            a+=2;
            sign*=-1;
        }
        System.out.println("Sum = "+sum);
    }
    int fact (int k)
    {
        int f = 1, i;
        for(i=1;i<=k;i++)
            f*=i;
        return f;
    }
}
