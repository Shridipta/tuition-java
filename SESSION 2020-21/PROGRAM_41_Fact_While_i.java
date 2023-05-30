
/**
 * Write a description of class PROGRAM_41_Fact_While_i here.
 *
 * @author (Shridipta Satpati)
 * @version (23.1.21)
 */
public class PROGRAM_41_Fact_While_i
{
    public void main(int num)
    {
        int i = 1, f = 1;
        while (i <= num)
        {
            f = f * i;
            i++;
        }
        System.out.println("Factorial = "+f);
    }
}