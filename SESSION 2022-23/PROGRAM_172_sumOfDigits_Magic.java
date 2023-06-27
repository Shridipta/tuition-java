import java.util.*;
public class PROGRAM_172_sumOfDigits_Magic
{
    public static int sumOfDigits(int num)
    {
        int sum=0, d;
        while(num>0)
        {
            d=num%10;
            sum+=d;
            num/=10;
        }
        return sum;
    }
    public static void main(int n)
    {
        int sum = n;
        while (sum > 9)
        {
            sum = sumOfDigits(n);
            n= sum;
        }
        if (sum ==1)
            System.out.println("Magic Number");
        else
            System.out.println("Not Magic number");
    }
}
