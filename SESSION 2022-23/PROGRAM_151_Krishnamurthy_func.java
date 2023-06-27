import java.util.*;
public class PROGRAM_151_Krishnamurthy_func
{
    public void main(int n)
    {
        int copy = n, d, sum = 0;
        while(copy>0)
        {
            d = copy%10;
            sum+= fact(d);
            copy/=10;
        }
        if (sum==n)
            System.out.println("Krishnamurthy Number");
        else
            System.out.println("Not a Krishnamurthy Number");
    }
    int fact (int k)
    {
        int f = 1, i;
        for(i=1;i<=k;i++)
            f*=i;
        return f;
    }
}
