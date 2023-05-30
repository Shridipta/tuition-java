
/**
 * Write a description of class PROGRAM_Series_25d here.
 *
 * @author (Shridipta Satpati)
 * @version (a version number or a date)
 */
public class PROGRAM_Series_25d
{
    public void main(int n)
    {
        int i, a = 1, b = 0, c = 0, sum = 0;
        for (i = 1; i <= n; i++)
        {
            c = a + b;
            a = b; b = c;
            System.out.print(c + " ");
            sum = sum + c;
        }
        System.out.println("Sum = " + sum);
    }
}