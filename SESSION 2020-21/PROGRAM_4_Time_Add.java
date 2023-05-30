
/**
 * Write a description of class PROGRAM_4_Time_Add here.
 *
 * @author (Shridipta Satpati)
 * @version (8.11.2020)
 */
public class PROGRAM_4_Time_Add
{
    public static void main (int hr1, int min1, int sec1, int hr2, int min2, int sec2)
    {
        int ts1, ts2, ts, thr, tmin;
        ts1 = hr1*3600+min1*60+sec1;
        ts2 = hr2*3600+min2*60+sec2;
        ts = ts1+ts2;
        thr = ts/3600;
        ts = ts%3600;
        tmin = ts/60;
        ts = ts%60;
        System.out.println("Hour = "+thr+" Minutes = "+tmin+" Seconds = "+ts);
    }
}