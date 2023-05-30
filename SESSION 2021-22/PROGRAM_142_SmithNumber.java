import java.util.*;
public class PROGRAM_142_SmithNumber
{
    public static void main(int num)
    {
        int i, copy, d, sum1 = 0, sum2 = 0;
        copy = num;
        while(copy>0)
        {
            d = copy%10;
            sum1+=d;
            copy/=10;
        }
        for (i = 2; i <= num;)
            if (num % i == 0)
            {
                copy = i;
                while (copy>0)
                {
                    d = copy%10;
                    sum2+=d;
                    copy /=10;
                }
                num = num / i;
            }
            else
                i++;
        if (sum1 == sum2)
            System.out.println("Smith Number");
        else
            System.out.println("Not a Smith Number");
    }
}
