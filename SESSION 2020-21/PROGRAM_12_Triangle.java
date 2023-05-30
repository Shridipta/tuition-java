
/**
 * Write a description of class PROGRAM_12_Triangle here.
 *
 * @author (Shridipta Satpati)
 * @version (28.11.2020)
 */
public class PROGRAM_12_Triangle
{
    public static void main (int a, int b, int c)
    {
        if (a+c>c && b+c>a && c+a>b)
            System.out.println("Possible");
        else
            System.out.println("Not Possible");
    }
}
