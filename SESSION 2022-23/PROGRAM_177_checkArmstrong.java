import java.util.*;
public class PROGRAM_177_checkArmstrong
{
    public int countDigits(int num)
    {
        int count=0;
        while (num > 0)
        {
            count++;
            num/=10;
        }
        return count;
    }

    public boolean checkArmstrong(int num)
    {
        int copy = num, sum = 0, d;
        while (copy > 0)
        {
            d = copy % 10;
            sum = sum + (int) Math.pow(d, countDigits(num));
            copy = copy / 10;
        }
        return (num == sum);
    }
}
