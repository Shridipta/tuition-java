
/**
 * Write a description of class PROGRAM_35_Locus here.
 *
 * @author (Shridipta Satpati)
 * @version (16.1.21)
 */
public class PROGRAM_35_Lucas
{
    public void main(int n)
    {
        int i, a = 3, b = -1, c;
        for (i = 1; i <= n; i++)
        {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }
}