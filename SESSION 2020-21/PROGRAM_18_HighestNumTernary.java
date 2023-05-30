
/**
 * Write a description of class PROGRAM_18_HighestNumTernary here.
 *
 * @author (Shridipta Satpati)
 * @version (19.12.20)
 */
public class PROGRAM_18_HighestNumTernary
{
    public void main (int a, int b, int c)
    {
        int max;
        max = a > b ? (a > c ? a : c) : ( b > c ? b : c);
    }
}    