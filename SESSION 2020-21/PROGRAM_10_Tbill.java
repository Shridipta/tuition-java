
/**
 * Write a description of class PROGRAM_10_Tbill here.
 *
 * @author (Shridipta Satpati)
 * @version (21.11.20)
 */
public class PROGRAM_10_Tbill
{
    public static void main (int call)
    {
        double bill = 0;
        call = call - 50;
        if (call <= 100)
            bill = call * 2;
        else if (call <= 200)
            bill = 100*2 + (call-100)*2.5;
        else
            bill = 100*2 + 100*2.5 + (call-200)*3;
        bill = bill+100;
        bill = bill + (10.12/100 * bill);
        System.out.println ("Bill Amount = Rs "+bill);
    }
}