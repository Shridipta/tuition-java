import java.util.*;
public class PROGRAM_176_checkKaprekar
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
    public boolean checkKaprekar(int num)
    {
        int sq, count = 0, right, left;
        sq = num * num;
        right = sq % (int) Math.pow(10, countDigits(num));
        left = sq / (int) Math.pow(10, countDigits(num));
        return (left + right == num);
    }
}
