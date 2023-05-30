
/**
 * Write a description of class PROGRAM_26_HCF here.
 *
 * @author (Shridipta Satpati)
 * @version (16.1.21)
 */
public class PROGRAM_26_HCF
{
    public void main (int a, int b)
    {
        int i, hcf = 1;
        for (i = 1; i <= a*b; i++)
        {
            if (a % i == 0 && b % i == 0)
                hcf = i;
        }
        System.out.println("HCF = " + hcf);
    }
}    