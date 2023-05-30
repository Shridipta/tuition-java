
/**
 * Write a description of class PROGRAM_49_Multiply here.
 *
 * @author (Shridipta Satpati)
 * @version (23.1.21)
 */
public class PROGRAM_40_Multiply
{
    public void main(int a, int b)
    {
        int i, sum = 0;
        for (i = 1; i <= b; i++)
            sum += a;
        System.out.println("Product = " + sum);
    }
}