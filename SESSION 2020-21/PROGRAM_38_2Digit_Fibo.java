
/**
 * Write a description of class PROGRAM_38_2Digit_Fibo here.
 *
 * @author (Shridipta Satpati)
 * @version (a version number or a date)
 */
public class PROGRAM_38_2Digit_Fibo
{
    public void main()
    {
        int i, a = 1, b = 0, c;
        for (i = 10; i <= 99; i++)
        {
            c = a + b;
            if (c >= 10 && c <= 100)
                System.out.print(c + " ");
            a = b; b = c;
        }
    }
}