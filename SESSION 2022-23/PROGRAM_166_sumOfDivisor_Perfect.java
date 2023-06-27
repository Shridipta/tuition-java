import java.util.*;
public class PROGRAM_166_sumOfDivisor_Perfect
{
    public int sumOfDivisor(int num)
    {
        int sum=0, i;
        for(i=1; i<num;i++)
            if (num%i==0)
                sum+=i;
        return sum;
    }
    public void main(int n)
    {
        if (sumOfDivisor(n)==n)
            System.out.println("Perfect Number");
        else
            System.out.println("Not a Perfect Number");
    }
}
