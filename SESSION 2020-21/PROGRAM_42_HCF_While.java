
/**
 * Write a description of class PROGRAM_42_HCF_While here.
 *
 * @author (Shridipta Satpati)
 * @version (23.1.21)
 */
public class PROGRAM_42_HCF_While
{
    public void main(int a, int b)
    {
        while (a != b)
        {
            if (a > b)
                a = a-b;
            else
                b = b-a;
        }
        System.out.println("HCF = " + a);
    }
}