
/**
 * Write a description of class PROGRAM_30_Prime here.
 *
 * @author (Shridipta Satpati)
 * @version (16.1.21)
 */
public class PROGRAM_30_Prime
{
    public void main (int num)
    {
        int i, c = 0;
        for (i = 1; i <= num; i++)
            if (num % i == 0)
                c+=1;
        if (c == 2)
            System.out.println("Prime Number");
        else
            System.out.println("Composite Number");
    }
}