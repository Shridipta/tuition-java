
/**
 * Write a description of class PROGRAM_13_Special here.
 *
 * @author (Shridipta Satpati)
 * @version (a version number or a date)
 */
public class PROGRAM_13_Special
{
    public void main (int num)
    {
        int d1, d2, newnum = 0;
        d1 = num % 10;
        d2 = num / 10;
        newnum = d1 + d2 + num;
        if ((d1*10+d2)== newnum)
            System.out.println("Special Two Digit Number");
        else
            System.out.println("Not Special Two Digit Number");
    }  
}
