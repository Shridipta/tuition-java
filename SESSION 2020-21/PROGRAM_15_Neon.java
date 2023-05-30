
/**
 * Write a description of class PROGRAM_15_Neon here.
 *
 * @author (Shridipta Satpati)
 * @version (10.12.20)
 */
public class PROGRAM_15_Neon
{
    public void main (int num)
    {
        int sqnum = num * num;
        int d1 = sqnum / 10; int d2 = sqnum % 100;
        if ((d1 + d2) == num)
            System.out.println("Neon Number");
        else
            System.out.println("Not Neon Number");
    }
}