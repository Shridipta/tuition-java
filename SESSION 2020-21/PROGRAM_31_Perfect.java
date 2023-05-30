
/**
 * Write a description of class PROGRAM_31_PerfectNum here.
 *
 * @author (Shridipta Satpati)
 * @version (16.1.21)
 */
public class PROGRAM_31_Perfect
{
    public void main(int num)
    {
        int i, sum = 0;
        for (i = 1; i <= num-1; i++)
            if (num % i == 0)
                sum += i;
        if (sum == num)
            System.out.println("Perfect Number");
        else
            System.out.println("Not a Perfect Number");
    }
}