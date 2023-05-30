
/**
 * Write a description of class PROGRAM_27_LCM here.
 *
 * @author (Shridipta Satpati)
 * @version (16.1.21)
 */
public class PROGRAM_27_LCM
{
    public void main(int a, int b)
    {
        int i, lcm = a * b;
        for (i = a * b; i >= 1; i--)
        {
            if (i % a == 0 && i % b == 0)
                lcm = i;
        }
        System.out.println("LCM = " + lcm);
    }
}