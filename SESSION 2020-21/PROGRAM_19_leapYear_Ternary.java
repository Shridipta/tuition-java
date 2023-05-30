
/**
 * Write a description of class PROGRAM_19_leapYear_Ternary here.
 *
 * @author (Shridipta Satpati)
 * @version (a version number or a date)
 */
public class PROGRAM_19_leapYear_Ternary
{
    public void main (int year)
    //full nesting in this program
    {
        System.out.println(year % 100 == 0 ? (year % 400 == 0 ? "Leap":"Not Leap") : 
                                             (year % 4 == 0? "Leap" : "Not Leap"));
        
    }
}
