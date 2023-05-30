
/**
 * Write a description of class PROGRAM_28_Power here.
 *
 * @author (Shridipta Satpati)
 * @version (16.1.21)
 */
public class PROGRAM_28_Power
{
    public void main (int x, int n)
    {
        int sign = 1, i;
        double p = 1;
        if (n < 0)
            sign = -1;
        n = Math.abs(n);
        for (i = 1; i <= n; i++)
            p *= x;
        if (sign == -1)
            p = 1/p;
        else if (n == 0)
            p = 1;
        System.out.println("Exponential value = "+p);
    }
}