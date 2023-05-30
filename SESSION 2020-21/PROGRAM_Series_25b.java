
/**
 * Write a description of class PROGRAM_Series_25b here.
 *
 * @author (Shridipta Satpati)
 * @version (a version number or a date)
 */
public class PROGRAM_Series_25b
{
    public void main(int x, int n)
    {
        int i, sign = 1;
        double term, sum = 0;
        for (i = 1; i <= 2 * n; i += 2)
        {
            term = (int)Math.pow(x, i) * sign / (i + 1);
            System.out.println(term + " ");
            sum = sum + term;
            sign = sign * -1;
        }
        System.out.println("Sum = " + sum);
    }
}