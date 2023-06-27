import java.util.*;
public class PROGRAM_168_sumOfDivisor_perfAbundntDefcnt
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
        else if(sumOfDivisor(n)<n)
            System.out.println("Deficient Number");
        else
            System.out.println("Abundant Number");
    }
}
