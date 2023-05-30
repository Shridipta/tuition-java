
/**
 * Write a description of class PROGRAM_43_PrimeDecomposition here.
 *
 * @author (Shridipta Satpati)
 * @version (21.1.21)
 */
public class PROGRAM_43_PrimeDecomposition_While
{
    public void main(int num)
    {
        int i = 2;
        while (num > 1)
        {
            if (num % i == 0)
            {
                System.out.println(i);
                num = num/i;
            }
            else
                i++;
        }    
    }
}