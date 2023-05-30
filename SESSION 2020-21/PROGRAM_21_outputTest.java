
/**
 * Write a description of class PROGRAM_21_outputTest here.
 *
 * @author (Shridipta Satpati)
 * @version (a version number or a date)
 */
public class PROGRAM_21_outputTest
{
    public void main()
    {
        int a = 5, b = -10, c = 34 ;
        if (a < b)
        a = a + b;
        c = a - b;
        a = a + c++ + ++b;
        System.out.println(a + " " + (b + c));
    }
}