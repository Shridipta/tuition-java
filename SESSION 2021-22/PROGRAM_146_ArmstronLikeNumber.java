import java.util.*;
public class PROGRAM_146_ArmstronLikeNumber
{
    public static void main(int num)
    {
        int c =0, copy=num, copy2 = num, i=0, d, 
        pow, sum=0;
        while(copy>0)
        {
            c++;
            copy/=10;
        }
        if (c%3!=0)
        {
            System.out.println("Not Armstrong Like Number1");
            return;
        }
        int cp = c/3;
        pow = (int) Math.pow(10, cp);
        while(copy2>0)
        {
            d = copy2 % pow;
            sum += (int) Math.pow(d, 3);
            copy2/=pow;
        }
        if (sum==num)
            System.out.println("Armstrong Like Number");
        else
            System.out.println("Not Armstrong Like Number");
    }
}
