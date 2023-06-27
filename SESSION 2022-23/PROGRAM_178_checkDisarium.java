import java.util.*;
public class PROGRAM_178_checkDisarium
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
    public boolean checkDisarium(int num)
    {
        int copy = num, sum = 0, count = countDigits(num), d;
        while (copy > 0)
        {
            d = copy % 10;
            sum += (int) Math.pow(d, count);
            copy = copy / 10;
            count--;
        }
        if (num == sum)
            return true;
        return false;
    }
}
