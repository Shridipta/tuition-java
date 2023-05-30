
/**
 * Write a description of class PROGRAM_3_Time here.
 *
 * @author (SHRIDIPTA SATPATI)
 * @version (7.11.2020)
 */
public class PROGRAM_3_Time
{
  public static void main (int sec)
  {
      int hr, min;
      hr = sec / 3600;
      sec = sec % 3600;
      min = sec / 60;
      sec = sec % 60;
      System.out.println ("Hour = "+hr+ " Minutes = "+min+" Seconds = "+sec);
  }
}
