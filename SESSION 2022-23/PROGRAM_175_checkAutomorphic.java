import java.util.*;
public class PROGRAM_175_checkAutomorphic
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
    public boolean checkAutomorphic(int num)
    {
        int sqnum, s;
        sqnum = num * num;
        s = sqnum % (int)Math.pow(10, countDigits(num));
        return (s == num);
    }
}
