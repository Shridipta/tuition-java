import java.util.*;
public class PROGRAM_174_countDigits
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
}
