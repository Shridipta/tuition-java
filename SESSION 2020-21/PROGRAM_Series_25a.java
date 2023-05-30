
/**
 * Write a description of class PROGRAM_Series_PROGRAM_25a here.
 *
 * @author (Shridipta Satpati)
 * @version (a version number or a date)
 */
public class PROGRAM_Series_25a
{
    public void main(int x, int n)
    {
        int i, term, sum = 0, sign = 1;
        for (i = 1; i <= n; i++)
        {
            term = (int)Math.pow(x, i) * sign;
            System.out.println(term + " ");
            sum = sum + term;
            sign = sign * -1;
        }
        System.out.println("Sum = " + sum);
    }
}