public class PROGRAM_84_Time_Add
{
    public static void main (int hr1, int m1, int s1, int hr2, int m2, int s2)
    {
        int s, m, hr;
        s = s1 + s2;
        m = m1 + m2 + s/60;
        hr = hr1 + hr2 + m/60;
        s = s % 60;
        m = m % 60;
        System.out.println("Hour = "+hr+" Minutes = "+m+" Seconds = "+s);
    }
}