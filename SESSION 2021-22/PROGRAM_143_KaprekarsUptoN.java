import java.util.*;
public class PROGRAM_143_KaprekarsUptoN
{
    public static void main(int num)
    {
        int i, copy, sq, count = 0, right, left;
        for (i = 1; i<= num; i++)
        {
            copy = i;
            count = 0;
            sq = i * i;
            while (copy > 0)
            {
                count += 1;
                copy = copy / 10;
            }
            right = sq % (int) Math.pow(10, count);
            left = sq / (int) Math.pow(10, count);
            if (left + right == i)
                System.out.println(i);
        }
    }
}
