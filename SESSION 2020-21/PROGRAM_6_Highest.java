
/**
 * Write a description of class PROGRAM_6_Highest here.
 *
 * @author (Shridipta Satpati)
 * @version (14.11.20)
 */
public class PROGRAM_6_Highest
{
    public static void main (int a, int b, int c)
    {
        int max = a;
        if (b>max)
            max = b;
        if (c>max)
            max = c;
        System.out.println("Highest = "+max);
    }
}