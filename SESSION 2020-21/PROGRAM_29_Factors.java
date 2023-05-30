
/**
 * Write a description of class PROGRAM_29_Factors here.
 *
 * @author (Shridipta Satpati)
 * @version (16.1.21)
 */
public class PROGRAM_29_Factors
{
    public void main(int num)
    {
        int i, odd = 0, even = 0;
        for (i = 1; i <= num; i++)
        {
            if (num % i == 0)
            {
                if (i % 2 == 1)
                    odd += i;
                else
                    even += i;
            }
        }
        System.out.println("Sum of Odd Factors = " + odd);
        System.out.println("Sum of Even Factors = " + even);
    }
}