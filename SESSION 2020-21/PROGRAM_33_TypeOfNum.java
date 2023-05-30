
/**
 * Write a description of class PROGRAM_33_TypeOfNum here.
 *
 * @author (Shridipta Satpati)
 * @version (16.1.21)
 */
public class PROGRAM_33_TypeOfNum
{
    public void main(int num)
    {
        int i, s = 0;
        for (i = 1; i < num; i++)
            if (num % i == 0)
                s+=i;
        if (s > num)
            System.out.println("Abundant Number");
        else if (s<num)
            System.out.println("Deficient Number");
        else
            System.out.println("Perfect Number");
    }
}