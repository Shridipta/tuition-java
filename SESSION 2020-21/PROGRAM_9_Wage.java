
/**
 * Write a description of class PROGRAM_9_Wage here.
 *
 * @author (Shridipta Satpati)
 * @version (21.11.20)
 */
public class PROGRAM_9_Wage
{
    public static void main (int hr, int k)
    {
        double wage = 0;
        if (hr <= 40)
            wage = k * hr ;
        else if (hr <= 50 )
            wage = 40*k + (hr-40)*k*1.5;
        else
            wage = 40*k + (10*k*1.5) + (hr-50)*k*2;
        System.out.println("Wage = Rs "+wage);
    }
}