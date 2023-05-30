
/**
 * Write a description of class PROGRAM_39_3Digit_Palindome here.
 *
 * @author (Shridipta Satpati)
 * @version (21.1.21)
 */
public class PROGRAM_39_3Digit_Palindome
{
    public void main()
    {
        int i, copy;
        for (i = 100; i<=999; i++)
        {
            copy = i;
            int d1 = copy % 10;
            copy = copy / 10;
            int d2 = copy % 10;
            copy = copy / 10;
            int d3 = copy % 10;
            if (d1 == d3)
                System.out.println(i);
        }
    }
}