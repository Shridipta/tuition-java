
/**
 * Write a description of class PROGRAM_7_TRIANGLE here.
 *
 * @author (SHRIDIPTA SATPATI)
 * @version (20.11.20)
 */
public class PROGRAM_7_Triangle
{
    public void main (int a, int b, int c)
    {
        if (a==b && b==c)
            System.out.println("Equilateral Triangle");
        else if (a==b || b==c || c==a)
            System.out.println("Isosceles Triangle");
        else
            System.out.println("Scalene Triangle");
    }
}