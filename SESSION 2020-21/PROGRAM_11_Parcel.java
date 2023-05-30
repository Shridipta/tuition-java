
/**
 * Write a description of class PROGRAM_11_Parcel here.
 *
 * @author (Shridipta Satpati)
 * @version (21.11.20)
 */
public class PROGRAM_11_Parcel
{
    public static void main (int wt)
    {
        int charge = 0;
        if (wt <= 500)
            charge = 40;
        else if (wt % 100 == 0)
            charge = 40 + (wt-500)/100*20;
        else
            charge = 40 + (wt-500)/100*20 +20;
        System.out.println("Charge = Rs "+charge);
    }
}