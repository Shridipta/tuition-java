public class PROGRAM_60_Parcel_Wt
{
    public static void main(int wt)
    {
        double charge;
        if(wt <= 100)
            charge = 60;
        else if (wt % 10 == 0)
            charge = 60 + (wt-100)/10 * 20;
        else
            charge = 60 + (wt-100)/10 * 20 + 20;
        System.out.println("Charge = Rs " + charge);
    }
}
