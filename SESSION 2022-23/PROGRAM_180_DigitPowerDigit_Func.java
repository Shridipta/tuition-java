import java.util.*;
public class PROGRAM_180_DigitPowerDigit_Func
{
    public void main(int num)
    {
        int sum=0, d;
        while(num>0)
        {
            d=num%10;
            sum+=toThePower(d, d);
            num/=10;
        }
        System.out.println("The Sum= " + sum);
    }

    int toThePower(int x, int n)
    {
        int s = 1, i;
        for (i=1; i<=n; i++)
            s*=i;
        return s;
    }
}
