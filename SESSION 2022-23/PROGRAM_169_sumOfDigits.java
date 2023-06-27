import java.util.*;
public class PROGRAM_169_sumOfDigits
{
    public static int main(int num)
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
}
