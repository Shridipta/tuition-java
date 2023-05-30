
/**
 * Write a description of class PROGRAM_41_Fact_While_ii here.
 *
 * @author (Shridipta Satpati)
 * @version (23.1.21)
 */
public class PROGRAM_41_Fact_While_ii
{
    public void main(int num)
    {
        int f = 1;
        while (num > 0)
        {
            f = f * num;
            num--;
        }
        System.out.println("Factorial = " + f);
    }
}