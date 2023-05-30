
/**
 * Write a description of class PROGRAM_24_FACTORIAL here.
 *
 * @author (Shridipta Satpati)
 * @version (a version number or a date)
 */
public class PROGRAM_24_FACTORIAL
{
    public void main(int n)
    {
        int f = 1;
        for (int i = 1; i <= n; i++)
            f *= i;
        System.out.println("The factorial of the number is = "+f);
    }
}