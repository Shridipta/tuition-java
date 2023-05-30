
/**
 * Write a description of class PROGRAM_34_Pell here.
 *
 * @author (Shridipta Satpati)
 * @version (16.1.21)
 */
public class PROGRAM_34_Pell
{
    public void main(int n)
    {
        int i, a = 1, b = 0, c;
        for (i = 1; i <= n; i++)
        {
            c = a + 2 * b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }
}