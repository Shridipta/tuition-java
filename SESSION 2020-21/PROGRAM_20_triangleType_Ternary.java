
/**
 * Write a description of class PROGRAM_20_triangleType_Ternary here.
 *
 * @author (Shridipta Satpati)
 * @version (a version number or a date)
 */
public class PROGRAM_20_triangleType_Ternary
{
    public void main (int a, int b, int c)
    {
        System.out.println(a == 90 || b == 90 || c == 90 ? ("Right Angled") :
                                                           (a > 90 || b > 90 || c > 90 ? "Obtuse" : "Acute"));
    }
}                                                    