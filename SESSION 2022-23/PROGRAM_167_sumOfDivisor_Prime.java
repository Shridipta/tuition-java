import java.util.*;
public class PROGRAM_167_sumOfDivisor_Prime
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
        if (n==1)
            System.out.println("Neither Prime nor Composite");
        else if (sumOfDivisor(n)==1)
            System.out.println("Prime Number");
        else
            System.out.println("Composite Number");
    }
}
