/**
 * Write a description of class PROGRAM_5_LEAP here.
 *
 * @author (Shridipta Satpati)
 * @version (14.11.20)
 */
public class PROGRAM_5_Leap_Second_Way
{
    public static void main (int year)
    {
        if (year%400==0 || (year % 100 != 0 && year % 4 == 0))
            System.out.println("Leap Year");
        else
            System.out.println("Not Leap Year");
    }
}