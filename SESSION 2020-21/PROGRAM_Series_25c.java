
/**
 * Write a description of class PROGRAM_Series_25c here.
 *
 * @author (Shridipta Satpati)
 * @version (a version number or a date)
 */
public class PROGRAM_Series_25c
{
    public void main(int x, int n)
    {
        int i, f = 1, s = 0;
        double term, sum = 0;
        for (i = 1; i <= n; i++)
        {
            s = s + 1;
            f = f * i;
            term = s / f;
            System.out.println(term + " ");
            sum = sum + term;
        }
        System.out.println("Sum = " + sum);
    }
}